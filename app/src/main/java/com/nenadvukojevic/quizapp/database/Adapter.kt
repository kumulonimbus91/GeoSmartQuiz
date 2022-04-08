package com.nenadvukojevic.quizapp.database

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.nenadvukojevic.quizapp.R
import com.nenadvukojevic.quizapp.databinding.LeaderBoardItemBinding

class Adapter() : RecyclerView.Adapter<Adapter.ViewHolder>() {

    var data = listOf<UserModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {


        return ViewHolder.from(parent)

    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {

        val item = data[position]

        holder.bind(item)

    }

    override fun getItemCount(): Int {
        return data.size

    }
    fun userList(list: List<UserModel>) {
        data = list
        notifyDataSetChanged()
    }

    class ViewHolder private constructor(val binding: LeaderBoardItemBinding) : RecyclerView.ViewHolder(binding.root) {

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)

                val binding = LeaderBoardItemBinding.inflate(layoutInflater, parent, false)


                return ViewHolder(binding)

            }
        }

        fun bind (item: UserModel) {
            binding.username.text = item.userName
            binding.date.text = item.date
            binding.title.text = item.title
            binding.tvScore.text = item.score.toString()

            if (item.score!! in 191..200) {
                binding.imageLb.setImageResource(R.drawable.trezubec_2_01)
            } else if (item.score!! in 161..190) {
                binding.imageLb.setImageResource(R.drawable.expert)

            } else if (item.score!! in 141..160) {
                binding.imageLb.setImageResource(R.drawable.master_06)
            } else if (item.score!! in 101..140) {
                binding.imageLb.setImageResource(R.drawable.hat_03)
            } else if (item.score!! in 51..100) {
                binding.imageLb.setImageResource(R.drawable.pupil)
            } else if (item.score!! < 50) {
                binding.imageLb.setImageResource(R.drawable.beginner_04)
            }
        }


    }


}