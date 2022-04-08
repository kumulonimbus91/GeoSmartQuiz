package com.nenadvukojevic.quizapp

object Constants { // new kotlin file

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"



    fun getQuestions(): ArrayList<Question> {

        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?", R.drawable.argentina10,
            "Argentina", "Australia",
            "Armenia", "Austria",
            1
        )
        questionsList.add(que1)
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.australia10,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.brazil10,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.belgium10,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.fiji10,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.germany10,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.denmark10,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.india10,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.newzealand10,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)
        //11
        val que11 = Question(11, "What country does this map represents?", R.drawable.brazil5,
        "Nigeria", "China", "Brazil", "Mexico", 3)

        questionsList.add(que11)

        //12
        val que12 = Question(12, "What country does this map represents?", R.drawable.austria5,
            "Austria", "Switzerland", "Belgium", "Nepal", 1)

        questionsList.add(que12)

        //13
        val que13 = Question(13, "What country does this map represents?", R.drawable.mexico5,
            "Algeria", "Colombia", "Thailand", "Mexico", 4)

        questionsList.add(que13)

        //14
        val que14 = Question(14, "What country does this map represents?", R.drawable.uruguay5,
            "Czech Republic", "Uruguay", "Montenegro", "Portugal", 2)

        questionsList.add(que14)

        //15
        val que15 = Question(15, "What country does this map represents?", R.drawable.croatia5,
            "Croatia", "Macedonia", "Italy", "Chile", 1)

        questionsList.add(que15)

        //16
        val que16 = Question(16, "What country does this map represents?", R.drawable.germany5,
            "France", "Poland", "Germany", "Denmark", 3)

        questionsList.add(que16)

        //17
        val que17 = Question(17, "What country does this map represents?", R.drawable.thailand5,
            "France", "Thailand", "Malta", "Laos", 2)

        questionsList.add(que17)

        //18
        val que18 = Question(18, "What country does this map represents?", R.drawable.bosnia5,
            "Cambodia", "Honduras", "Uruguay", "Bosnia", 4)

        questionsList.add(que18)
        //19
        val que19 = Question(19, "What country does this map represents?", R.drawable.egypt5,
            "Egypt", "Pakistan", "Poland", "Chad", 1)

        questionsList.add(que19)

        //20
        val que20 = Question(20, "What country does this map represents?", R.drawable.algeria5,
            "Jamaica", "Tanzania", "Kenya", "Algeria", 4)

        questionsList.add(que20)

        //21
        val que21 = Question(21, "What is the capital of Japan?", R.drawable.question_01,
            "Beijing", "Tokyo", "Seoul", "London", 2)

        questionsList.add(que21)

        //22
        val que22 = Question(22, "What is the capital of Iceland?", R.drawable.question_01,
            "Reykjavik", "Riyadh", "Helsinki", "Dublin", 1)

        questionsList.add(que22)

        //23
        val que23 = Question(23, "What is the capital of Austria?", R.drawable.question_01,
            "Cardiff", "Vienna", "Copenhagen", "Oslo", 2)

        questionsList.add(que23)

        //24
        val que24 = Question(24, "What is the capital of Ireland?", R.drawable.question_01,
            "Rome", "Yamoussoukro", "Rabat", "Dublin", 4)

        questionsList.add(que24)

        //25
        val que25 = Question(25, "What is the capital of Mexico?", R.drawable.question_01,
            "Mexico City", "New Delhi", "Rabat", "Rome", 1)

        questionsList.add(que25)

        //26
        val que26 = Question(26, "What is the capital of Finland?", R.drawable.question_01,
            "Oslo", "Moscow", "Helsinki", "Sofia", 3)

        questionsList.add(que26)

        //27
        val que27 = Question(27, "What is the capital of Chile?", R.drawable.question_01,
            "Lima", "Santiago", "Salvador", "Buenos Aires", 2)

        questionsList.add(que27)
        //28
        val que28 = Question(28, "What is the capital of Serbia?", R.drawable.question_01,
            "Zagreb", "Ljubljana", "Prague", "Belgrade", 4)

        questionsList.add(que28)

        //29
        val que29 = Question(29, "What is the capital of Honduras?", R.drawable.question_01,
            "San Pedro Sula", "Tegucigalpa", "Guadalajara", "Flores", 2)

        questionsList.add(que29)

        //30
        val que30 = Question(30, "What is the capital of Mongolia?", R.drawable.question_01,
            "Ulaanbaatar", "Murun", "Chișinău", "Kyoto", 1)

        questionsList.add(que30)
        //31
        val que31 = Question(31, "What is the population of Mexico?", R.drawable.question_01,
            "Less than 50 millions", "50-100 millions", "100-150 millions", "More than 150 millions", 3)

        questionsList.add(que31)
        //32
        val que32 = Question(32, "What is the population of Albania?", R.drawable.question_01,
            "2-3 millions", "7-10 millions", "10-15 millions", "More than 15 millions", 1)

        questionsList.add(que32)

        //33
        val que33 = Question(32, "What is the population of Armenia?", R.drawable.question_01,
            "1-2 millions", "12-15 millions", "5-10 millions", "2-3 millions", 4)

        questionsList.add(que33)

        //34
        val que34 = Question(
            34, "What country does this flag belong to?", R.drawable.chad10,
            "Burundi", "Chad",
            "Romania", "Algeria",
            2
        )
        questionsList.add(que34)

        //35
        val que35 = Question(
            35, "What country does this flag belong to?", R.drawable.congo10,
            "Congo", "Angola",
            "Botswana", "Cyprus",
            1
        )
        questionsList.add(que35)

        //36
        val que36 = Question(
            36, "What country does this flag belong to?", R.drawable.combodia10,
            "Eritrea", "Gabon",
            "Cambodia", "Costa Rica",
            3
        )
        questionsList.add(que36)

        //37
        val que37 = Question(37, "What is the population of Bangladesh?", R.drawable.question_01,
            "10-20 millions", "30-50 millions", "120-180 millions", "More than 180 millions", 3)

        questionsList.add(que37)

        //38
        val que38 = Question(38, "Which continent is Cambodia located in?", R.drawable.question_01,
            "Africa", "Asia", "South America", "Europe", 2)

        questionsList.add(que38)
        //39
        val que39 = Question(18, "What country does this map represents?", R.drawable.bolivia5,
            "Russia", "Honduras", "Bolivia", "Bulgaria", 3)

        questionsList.add(que39)



        //40
        val que40 = Question(40, "How many time zones does Australia have?", R.drawable.question_01,
        "2","4","3","5",3)
        questionsList.add(que40)



        //41
        val que41 = Question(
            41, "What country does this flag belong to?",
            R.drawable.north_korea10,
            "North Korea", "Vietnam",
            "China", "Laos", 1
        )

        questionsList.add(que41)
        //42
        val que42 = Question(
            42, "What country does this flag belong to?",
            R.drawable.north_macedonia10,
            "Brunei", "Slovenia",
            "Montenegro", "North Macedonia", 4
        )

        questionsList.add(que42)

        //43
        val que43 = Question(
            43, "What country does this flag belong to?",
            R.drawable.brunei10,
            "Burundi", "Brunei",
            "Andorra", "Azerbaijan", 2
        )

        questionsList.add(que43)
        //44
        val que44 = Question(
            44, "What country does this flag belong to?",
            R.drawable.burundi10,
            "Burundi", "Brunei",
            "Cameroon", "Bahrain", 1
        )

        questionsList.add(que44)

        //45
        val que45 = Question(
            45, "What country does this flag belong to?",
            R.drawable.kenya10,
            "Congo", "Senegal",
            "Kenya", "Dominican Republic", 3
        )

        questionsList.add(que45)

        //46
        val que46 = Question(
            46, "What country does this flag belong to?",
            R.drawable.laos10,
            "Laos", "Thailand",
            "Myanmar", "India", 1
        )

        questionsList.add(que46)

        //47
        val que47 = Question(
            47, "What country does this flag belong to?",
            R.drawable.montenegro10,
            "Suriname", "San Marino",
            "Eritrea", "Montenegro", 4
        )

        questionsList.add(que47)

        //48
        val que48 = Question(
            48, "What country does this flag belong to?",
            R.drawable.samoa10,
            "Samoa", "Zambia",
            "Uzbekistan", "Sri Lanka", 1
        )

        questionsList.add(que48)

        //49
        val que49 = Question(
            49, "What country is bordering France?",
            R.drawable.question_01,
            "Germany", "Australia",
            "Sweden", "Russia", 1
        )

        questionsList.add(que49)

        //50
        val que50 = Question(
            50, "What country is bordering Slovakia?",
            R.drawable.question_01,
            "Portugal", "Poland",
            "Spain", "Egypt", 2
        )

        questionsList.add(que50)
        //51
        val que51 = Question(
            51, "What is the name of the deepest point in Earth’s oceans?" ,
            R.drawable.question_01,
            "Mariana’s Trench", "Sirena Deep",
            "Sunda Trench", "Dordrecht Deep", 1
        )

        questionsList.add(que51)

        //52
        val que52 = Question(
            52, " What is the name of the longest river in the US?" ,
            R.drawable.question_01,
            "Mississippi River", "Yukon River",
            "Nile", "Missouri River", 4
        )

        questionsList.add(que52)

        //53
        val que53 = Question(
            53, "What Cape sits at the tip of Africa? " ,
            R.drawable.question_01,
            "Cape of Good Hope ", "Cape Horn",
            "West Cape Howe", "South East Cape", 1
        )

        questionsList.add(que53)

        //54
        val que54 = Question(
            54, "What country is bordering Bolivia?",
            R.drawable.question_01,
            "USA", "Austria",
            "Brazil", "Finland", 3
        )

        questionsList.add(que54)

        //55
        val que55 = Question(
            55, "What country is bordering Sweden?",
            R.drawable.question_01,
            "Italy", "Norway",
            "Serbia", "Uzbekistan", 2
        )

        questionsList.add(que55)

        //56

        val que56 = Question(
            56, "What country is bordering Ukraine?",
            R.drawable.question_01,
            "Algeria", "Belgium",
            "Russia", "India", 3
        )

        questionsList.add(que56)

        //57

        val que57 = Question(
            57, "What is the capital of North Macedonia?",
            R.drawable.question_01,
            "Lisbon", "Skopje",
            "Sofia", "Lima", 2
        )

        questionsList.add(que57)

        //58
        val que58 = Question(
            58, "What country is bordering Uruguay?",
            R.drawable.question_01,
            "Brazil", "Canada",
            "Japan", "Nepal", 1
        )

        questionsList.add(que58)

        //59

        val que59 = Question(
            59, "What is the capital of Albania?" ,
            R.drawable.question_01,
            "Zagreb", "Tirana",
            "Chișinău", "Kyiv", 2
        )

        questionsList.add(que59)

        //60
        val que60 = Question(
            60, "What did Ceylon change its name to in 1972?" ,
            R.drawable.question_01,
            "Indonesia", "Myanmar",
            "Sri Lanka", "Morocco", 3
        )

        questionsList.add(que60)

        //61
        val que61 = Question(
            61, "What is the highest peak in Africa?" ,
            R.drawable.question_01,
            "Mount Speke ", "Mount Kenya",
            "Ras Dashen", "Mount Kilimanjaro", 4
        )

        questionsList.add(que61)

        //62
        val que62 = Question(62, "What country does this map represents?", R.drawable.sweden5,
            "Sweden", "Finland", "Norway", "Denmark", 1)

        questionsList.add(que62)

        //63
        val que63 = Question(63, "What country does this map represents?", R.drawable.ireland5,
            "Iceland", "Ireland", "Paraguay", "Malta", 2)

        questionsList.add(que63)

        //64

        val que64 = Question(64, "Constantinople and Byzantium are former names of which major city?", R.drawable.question_01,
            "Baghdad", "Rome", "Istanbul", "Athens", 3)

        questionsList.add(que64)

        //65
        val que65 = Question(65, "What is the capital of Bolivia?", R.drawable.question_01,
            "Bogota", "Caracas", "Asuncion", "La Paz", 4)

        questionsList.add(que65)


        //66

        val que66 = Question(66, "What is the capital of Saudi Arabia?", R.drawable.question_01,
            "Riyadh", "Rabat", "Medina", "Kabul", 1)

        questionsList.add(que66)

        //67
        val que67 = Question(67, "What is the name of the microstate located between Spain and France?", R.drawable.question_01,
            "Liechtenstein", "Andorra", "San Marino", "Luxembourg", 2)

        questionsList.add(que67)

        //68
        val que68 = Question(68, "In which ocean are the Canary Islands located?", R.drawable.question_01,
            "Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Arctic Ocean", 1)

        questionsList.add(que68)

        //69
        val que69 = Question(69, "In which ocean are the Maldives located?", R.drawable.question_01,
            "Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Arctic Ocean", 3)

        questionsList.add(que69)

        //70
        val que70 = Question(
            70, "What country does this flag belong to?",
            R.drawable.maldives10,
            "Egypt", "Afghanistan",
            "Pakistan", "Maldives", 4
        )

        questionsList.add(que70)

        //71
        val que71 = Question(
            71, "What country does this flag belong to?",
            R.drawable.italy10,
            "Italy", "Armenia",
            "Mexico", "Holland", 1
        )

        questionsList.add(que71)

        //72
        val que72 = Question(
            72, "What country does this flag belong to?",
            R.drawable.ireland10,
            "Romania", "Ireland",
            "Iceland", "Ivory Coast", 2
        )

        questionsList.add(que72)

        //73
        val que73 = Question(
            73, "What country does this flag belong to?",
            R.drawable.russia10,
            "Belarus", "Slovakia",
            "Russia", "Slovenia", 3
        )

        questionsList.add(que73)

        //74
        val que74 = Question(
            74, "What African country has the largest population?",
            R.drawable.question_01,
            "Kenya", "Tanzania",
            "Algeria", "Nigeria", 4
        )

        questionsList.add(que74)

        //75
        val que75 = Question(
            75, "Mount Vesuvius overlooks which present-day Italian city?",
            R.drawable.question_01,
            "Naples", "Milan",
            "Rome", "Turin", 1
        )

        questionsList.add(que75)

        //76
        val que76 = Question(
            76, "What country does this flag belong to?",
            R.drawable.china10,
            "Turkey", "China",
            "Vietnam", "Cuba", 2
        )

        questionsList.add(que76)

        //77
        val que77 = Question(
            77, "What country is home to the tallest mountain in the world?",
            R.drawable.question_01,
            "India", "Bhutan",
            "Nepal", "Bangladesh", 3
        )

        questionsList.add(que77)

        //78
        val que78 = Question(
            78, "What is the largest U.S. state by area?",
            R.drawable.question_01,
            "California", "Texas",
            "Florida", "Alaska", 4
        )

        questionsList.add(que78)

        //79
        val que79 = Question(
            79, "What is the capital city of Australia?",
            R.drawable.question_01,
            "Canberra", "Ottawa",
            "Melbourne", "Sydney", 1
        )

        questionsList.add(que79)

        //80
        val que80 = Question(
            80, "In which country would you find the city of Dresden?",
            R.drawable.question_01,
            "Austria", "Germany",
            "Denmark", "Latvia", 2
        )

        questionsList.add(que80)

        //81
        val que81 = Question(
            81, "How many States does the United States consist of? ",
            R.drawable.question_01,
            "49", "59",
            "50", "60", 3
        )

        questionsList.add(que81)

        //82

        val que82 = Question(
            82, "Where are the Spanish Steps located? ",
            R.drawable.question_01,
            "Tijuana, Mexico", "Barcelona, Spain",
            "Madrid, Spain", "Rome, Italy", 4
        )

        questionsList.add(que82)

        //83
        val que83 = Question(
            83, "What country does this flag belong to?",
            R.drawable.belize,
            "Belize", "Maldives",
            "Trinidad and Tobago", "Nicaragua", 1
        )

        questionsList.add(que83)

        //84
        val que84 = Question(
            84, "What country does the Rhine River run through?",
            R.drawable.question_01,
            "Poland", "Germany",
            "Spain", "Ukraine", 2
        )

        questionsList.add(que84)

        //85

        val que85 = Question(85, "What country does this map represents?", R.drawable.arabia5,
            "Yemen", "Belgium", "Saudi Arabia", "Sudan", 3)

        questionsList.add(que85)

        //86
        val que86 = Question(
            86, "What country is bordering Mongolia?",
            R.drawable.question_01,
            "Thailand", "Laos",
            "Moldova", "Russia", 4
        )

        questionsList.add(que86)

        //87
        val que87 = Question(
            87, "What country is bordering Belgium?",
            R.drawable.question_01,
            "Holland", "Liechtenstein",
            "Czech Republic", "Andorra", 1
        )

        questionsList.add(que87)
        //88
        val que88 = Question(
            88, "What country is bordering Serbia?",
            R.drawable.question_01,
            "Greece", "Croatia",
            "Ukraine", "Moldova", 2
        )

        questionsList.add(que88)

        //89
        val que89 = Question(
            89, " Which of these African nations is NOT landlocked?",
            R.drawable.question_01,
            "Niger", "Chad",
            "Congo", "Burkina Faso", 3
        )

        questionsList.add(que89)

        //90
        val que90 = Question(
            90, "Montevideo is the capital of what South American country?",
            R.drawable.question_01,
            "Peru", "Paraguay",
            "Suriname", "Uruguay", 4
        )

        questionsList.add(que90)

        //91
        val que91 = Question(
            91, "What Asian country has Kuala Lumpur as its capital?",
            R.drawable.question_01,
            "Malaysia ", "Cambodia",
            "Thailand", "Laos", 1
        )

        questionsList.add(que91)

        //92
        val que92 = Question(92, "What country does this map represents?", R.drawable.kazakhstan5,
            "China", "Kazakhstan", "Mongolia", "Ukraine", 2)

        questionsList.add(que92)

        //93
        val que93 = Question(
            93, "What river runs through Baghdad?",
            R.drawable.question_01,
            "Euphrates", "Karun",
            "Tigris", "Jordan", 3
        )

        questionsList.add(que93)

        //94
        val que94 = Question(
            94, "What is the only sea without any coasts?",
            R.drawable.question_01,
            "Adriatic Sea", "Celebes Sea",
            "Mediterranean Sea", "Sargasso Sea", 4
        )

        questionsList.add(que94)

        //95
        val que95 = Question(
            95, "What country has the most coastline?",
            R.drawable.question_01,
            "Canada", "Russia",
            "China", "United States", 1
        )

        questionsList.add(que95)

        //96
        val que96 = Question(
            96, "What is the capital of North Korea?",
            R.drawable.question_01,
            "Hanoi", "Pyongyang",
            "Beijing", "Taipei City", 2
        )

        questionsList.add(que96)

        //97
        val que97 = Question(
            97, " The Danube flows into what body of water?",
            R.drawable.question_01,
            "Atlantic Ocean", "Volga River",
            "The Black Sea", "Adriatic Sea", 3
        )

        questionsList.add(que97)

        //98
        val que98 = Question(
            98, "Riga is the capital city of which European country?",
            R.drawable.question_01,
            "Estonia", "Lithuania",
            "Belarus", "Latvia", 4
        )

        questionsList.add(que98)

        //99
        val que99 = Question(
            99, "Which country does the holiday island of Ibiza belong to?",
            R.drawable.question_01,
            "Spain", "Italy",
            "Portugal", "France", 1
        )

        questionsList.add(que99)

        //100
        val que100 = Question(
            100, "In which ocean is Fiji?",
            R.drawable.question_01,
            "Atlantic Ocean", "Pacific Ocean",
            "Indian Ocean", "Arctic Ocean", 2
        )

        questionsList.add(que100)

        //101
        val que101 = Question(
            101, "What country does this flag belong to?",
            R.drawable.south_korea10,
            "Japan", "Taiwan",
            "South Korea", "Singapore", 3
        )

        questionsList.add(que101)

        //102
        val que102 = Question(
            102, "What country does this flag belong to?",
            R.drawable.turkey,
            "Syria", "Tunisia",
            "Libya", "Turkey", 4
        )

        questionsList.add(que102)

        //103
        val que103 = Question(
            103, "What country does this flag belong to?",
            R.drawable.morocco10,
            "Morocco", "Algeria",
            "Tunisia", "Indonesia", 1
        )

        questionsList.add(que103)

        //104
        val que104 = Question(
            104, "What country does this flag belong to?",
            R.drawable.ghana10,
            "Senegal", "Ghana",
            "Cameroon", "Niger", 2
        )

        questionsList.add(que104)

        //105
        val que105 = Question(
            105, "What country does this flag belong to?",
            R.drawable.lithuania,
            "Ethiopia", "Uganda",
            "Lithuania", "Angola", 3
        )

        questionsList.add(que105)

        //106
        val que106 = Question(
            106, "What country does this flag belong to?",
            R.drawable.malawi10,
            "Zambia", "Zimbabwe",
            "Rwanda", "Malawi", 4
        )

        questionsList.add(que106)

        //107
        val que107 = Question(
            107, "What country does this flag belong to?",
            R.drawable.cuba10,
            "Cuba", "Costa Rica",
            "Guatemala", "Nicaragua", 1
        )

        questionsList.add(que107)

        //108
        val que108 = Question(
            108, "What country does this flag belong to?",
            R.drawable.czechia,
            "Philippines", "Czech Republic",
            "Poland", "Slovakia", 2
        )

        questionsList.add(que108)

        //109
        val que109 = Question(
            109, "Havana is the capital of what country?",
            R.drawable.question_01,
            "El Salvador", "Jamaica",
            "Cuba", "Sierra Leone", 3
        )

        questionsList.add(que109)

        //110
        val que110 = Question(
            110, "After Brazil, what is the second largest country in South America?",
            R.drawable.question_01,
            "Venezuela", "Argentina",
            "Peru", "Colombia", 4
        )

        questionsList.add(que110)

        //111
        val que111 = Question(
            111, "If I’m visiting the ancient city of Petra, which country am I in?",
            R.drawable.petra3,
            "Jordan", "Israel",
            "Syria", "Lebanon", 1
        )

        questionsList.add(que111)

        //112
        val que112 = Question(
            112, "If I’m visiting the ancient city of Angkor Wat, which country am I in?",
            R.drawable.angkor,
            "Laos", "Cambodia",
            "Thailand", "Myanmar", 2
        )

        questionsList.add(que112)
        //113
        val que113 = Question(
            113, "Denali is the highest mountain in which continent?",
            R.drawable.question_01,
            "Asia", "South America",
            "North America", "Europe", 3
        )

        questionsList.add(que113)

        //114
        val que114 = Question(
            114, "After the Nile and Amazon, what is the third longest river in the world?",
            R.drawable.question_01,
            "Mekong", "Volga",
            "Mississippi", "Yangtze River", 4
        )

        questionsList.add(que114)

        //115
        val que115 = Question(
            115, "If I’m visiting the ancient city of Tikal, which country am I in?",
            R.drawable.tikal,
            "Guatemala", "Mexico",
            "El Salvador", "Honduras", 1
        )

        questionsList.add(que115)

        //116

        val que116 = Question(
            116, "What country owns Easter Island?",
            R.drawable.easterisland,
            "Mexico", "Chile",
            "Peru", "Panama", 2
        )

        questionsList.add(que116)

        //117

        val que117 = Question(
            117, "To which city does this landmark belong?",
            R.drawable.acropolis,
            "Rome", "Istanbul",
            "Athens", "Naples", 3
        )

        questionsList.add(que117)

        //118

        val que118 = Question(
            118, "To which city does this landmark belong?",
            R.drawable.london,
            "Prague", "Paris",
            "Madrid", "London", 4
        )

        questionsList.add(que118)

        //119

        val que119 = Question(
            119, "To which city does this landmark belong?",
            R.drawable.rio,
            "Rio de Janeiro", "Sao Paulo",
            "La Paz", "Lima", 1
        )

        questionsList.add(que119)

        //120

        val que120 = Question(
            120, " What is the man-made canal that splits North and South America called?",
            R.drawable.question_01,
            "Suez Canal", "The Panama Canal",
            "Corinth Canal", "Kiel Canal", 2
        )

        questionsList.add(que120)

        //121
        val que121 = Question(
            121, "What was the country of Myanmar formerly known as?",
            R.drawable.question_01,
            "Southern Rhodesia", "Abyssinia",
            "Burma", "Northern Rhodesia", 3
        )

        questionsList.add(que121)

        //122
        val que122 = Question(
            122, "What was the country of Algeria formerly known as?",
            R.drawable.question_01,
            "Sudanese Republic", "Upper Volta",
            "Siam", "Numidia", 4
        )

        questionsList.add(que122)

        //123

        val que123 = Question(
            123, "Select an African country",
            R.drawable.question_01,
            "Israel", "Guinea",
            "Guyana", "Cambodia", 2
        )

        questionsList.add(que123)

        //124
        val que124 = Question(124, "What is the capital of New Zealand?", R.drawable.question_01,
            "Brisbane", "Melbourne", "Wellington", "Auckland", 3)

        questionsList.add(que124)

        //125

        val que125 = Question(125, "What is the capital of Nicaragua?", R.drawable.question_01,
            "N'Djamena", "Saint John's", "São Tomé", "Managua", 4)

        questionsList.add(que125)
        //126

        val que126 = Question(126, "What is the capital of Indonesia?", R.drawable.question_01,
            "Jakarta", "Maputo", "Ankara", "Minsk", 1)

        questionsList.add(que126)

        //127
        val que127 = Question(127, "What is the capital of Portugal?", R.drawable.question_01,
            "Caracas", "Lisbon", "Buenos Aires", "Porto", 2)

        questionsList.add(que127)

        //128
        val que128 = Question(128, "What is the capital of Uzbekistan?", R.drawable.question_01,
            "Nay Pyi Taw", "Islamabad", "Tashkent", "Sanaa", 3)

        questionsList.add(que128)

        //129
        val que129 = Question(129, "What country has the shortest coastline in the world?", R.drawable.question_01,
            "Andorra", "Montenegro", "Denmark", "Monaco", 4)

        questionsList.add(que129)

        //130

        val que130 = Question(130, "How many countries are inside the United Kingdom?", R.drawable.question_01,
            "4", "5", "3", "2", 1)

        questionsList.add(que130)


        //131
        val que131 = Question(
            131, "What country does this flag belong to?", R.drawable.mongolia10,
            "Uzbekistan", "Mongolia",
            "Tajikistan", "Turkmenistan",
            2
        )
        questionsList.add(que131)

        //132
        val que132 = Question(
            132, "What country does this flag belong to?", R.drawable.japan10,
            "South Korea", "Laos",
            "Japan", "Thailand",
            3
        )
        questionsList.add(que132)

        //133
        val que133 = Question(
            133, "What country does this flag belong to?", R.drawable.iceland10,
            "Norway", "Ireland",
            "Denmark", "Iceland",
            4
        )
        questionsList.add(que133)

        //134
        val que134 = Question(
            134, "What country does this flag belong to?", R.drawable.albania10,
            "Albania", "South Sudan",
            "Gabon", "Guyana",
            1
        )
        questionsList.add(que134)
        //135
        val que135 = Question(
            135, "What country does this flag belong to?", R.drawable.armenia10,
            "Bhutan", "Armenia",
            "Oman", "Yemen",
            2
        )
        questionsList.add(que135)

        //136
        val que136 = Question(
            136, "What country does this flag belong to?", R.drawable.austria10,
            "Estonia", "Malta",
            "Austria", "Tanzania",
            3
        )
        questionsList.add(que136)

        //137
        val que137 = Question(
            137, "What country does this flag belong to?", R.drawable.bangladesh10,
            "Botswana", "Eswatini",
            "Lesotho", "Bangladesh",
            4
        )
        questionsList.add(que137)

        //138
        val que138 = Question(
            138, "What country does this flag belong to?", R.drawable.chile10,
            "Chile", "Ecuador",
            "Puerto Rico", "Suriname",
            1
        )
        questionsList.add(que138)

        //139
        val que139 = Question(
            139, "What country does this flag belong to?", R.drawable.finland10,
            "Guatemala", "Finland",
            "Estonia", "Haiti",
            2
        )
        questionsList.add(que139)

        //140
        val que140 = Question(
            140, "What country does this flag belong to?", R.drawable.honduras10,
            "Bahamas", "Barbados",
            "Honduras", "Tahiti",
            3
        )
        questionsList.add(que140)

        //141
        val que141 = Question(
            141, "What country does this flag belong to?", R.drawable.mexico10,
            "Dominican Republic", "Dominica",
            "Aruba", "Mexico",
            4
        )
        questionsList.add(que141)

        //142
        val que142 = Question(
            142, "What country does this flag belong to?", R.drawable.canada10,
            "Canada", "Papua New Guinea",
            "Georgia", "Azerbaijan",
            1
        )
        questionsList.add(que142)

        //143
        val que143 = Question(
            143, "What country does this flag belong to?", R.drawable.colombia10,
            "Venezuela", "Colombia",
            "Uganda", "Central African Republic",
            2
        )
        questionsList.add(que143)

        //144
        val que144 = Question(
            144, "What country does this flag belong to?", R.drawable.greece10,
            "Cyprus", "Namibia",
            "Greece", "Bulgaria",
            3
        )
        questionsList.add(que144)

        //145
        val que145 = Question(
            145, "What country does this flag belong to?", R.drawable.mali10,
            "Chad", "Benin",
            "Togo", "Mali",
            4
        )
        questionsList.add(que145)

        //146
        val que146 = Question(
            146, "What country does this flag belong to?", R.drawable.namibia10,
            "Namibia", "Burkina Faso",
            "Liberia", "Guinea-Bissau",
            1
        )
        questionsList.add(que146)

        //147
        val que147 = Question(
            147, "What country does this flag belong to?", R.drawable.nauru10,
            "Gabon", "Nauru",
            "Angola", "Tuvalu",
            2
        )
        questionsList.add(que147)

        //148
        val que148 = Question(
            148, "What country does this flag belong to?", R.drawable.netherlands10,
            "Luxembourg", "Serbia",
            "Holland", "Liechtenstein",
            3
        )
        questionsList.add(que148)

        //149
        val que149 = Question(
            149, "What country does this flag belong to?", R.drawable.norway10,
            "Mauritania", "Madagascar",
            "Iraq", "Norway",
            4
        )
        questionsList.add(que149)

        //150
        val que150 = Question(
            150, "What country does this flag belong to?", R.drawable.pakistan10,
            "Pakistan", "Syria",
            "Turkmenistan", "Kyrgyzstan",
            1
        )
        questionsList.add(que150)

        //151
        val que151 = Question(
            151, "What country does this flag belong to?", R.drawable.paraguai10,
            "Ecuador", "Paraguay",
            "Bolivia", "Bahamas",
            2
        )
        questionsList.add(que151)

        //152
        val que152 = Question(
            152, "What country does this flag belong to?", R.drawable.peru10,
            "Chile", "Puerto Rico",
            "Peru", "Grenada",
            3
        )
        questionsList.add(que152)


        //153
        val que153 = Question(
            153, "What country does this flag belong to?", R.drawable.philippines10,
            "Saint Kitts and Nevis", "Puerto Rico",
            "Saint Lucia", "Philippines",
            4
        )
        questionsList.add(que153)
        //154
        val que154 = Question(
            154, "What country does this flag belong to?", R.drawable.senegal10,
            "Senegal", "Benin",
            "Mozambique", "Zimbabwe",
            1
        )
        questionsList.add(que154)
        //155
        val que155 = Question(
            155, "What country does this flag belong to?", R.drawable.sudan10,
            "Jordan", "Sudan",
            "Kuwait", "United Arab Emirates",
            2
        )
        questionsList.add(que155)

        //156
        val que156 = Question(
            156, "What country does this flag belong to?", R.drawable.suriname10,
            "Barbados", "Seychelles",
            "Suriname", "Madagascar",
            3
        )
        questionsList.add(que156)

        //157
        val que157 = Question(
            157, "What country does this flag belong to?", R.drawable.thailand10,
            "Bhutan", "Nepal",
            "Malaysia", "Thailand",
            4
        )
        questionsList.add(que157)

        //158
        val que158 = Question(
            158, "What country does this flag belong to?", R.drawable.tunisia10,
            "Tunisia", "Algeria",
            "Libya", "Turkey",
            1
        )
        questionsList.add(que158)

        //159
        val que159 = Question(
            159, "What country does this flag belong to?", R.drawable.uruguai10,
            "Haiti", "Uruguay",
            "Saint Vincent and the Grenadines", "Trinidad and Tobago",
            2
        )
        questionsList.add(que159)

        //160
        val que160 = Question(
            160, "What country does this flag belong to?", R.drawable.vietnam10,
            "Tahiti", "China",
            "Vietnam", "Taiwan",
            3
        )
        questionsList.add(que160)

        //161
        val que161 = Question(
            161, "What country does this flag belong to?", R.drawable.yemen10,
            "Saudi Arabia", "Oman",
            "United Arab Emirates", "Yemen",
            4
        )
        questionsList.add(que161)

        //162
        val que162 = Question(162, "What is the capital of Iran?", R.drawable.question_01,
            "Tehran", "Islamabad", "Baghdad", "Bishkek", 1)

        questionsList.add(que162)

        //163
        val que163 = Question(163, "What is the capital of Tajikistan?", R.drawable.question_01,
            "Tashkent", "Dushanbe", "Nur-Sultan", "Bishkek", 2)

        questionsList.add(que163)

        //164
        val que164 = Question(164, "What is the capital of Azerbaijan?", R.drawable.question_01,
            "Tbilisi", "Minsk", "Baku", "Ankara", 3)

        questionsList.add(que164)

        //165
        val que165 = Question(165, "What is the capital of India?", R.drawable.question_01,
            "Mumbai", "Bangalore", "Kolkata", "New Delhi", 4)

        questionsList.add(que165)

        //166
        val que166 = Question(166, "What is the capital of Jamaica?", R.drawable.question_01,
            "Kingston", "Albert Town", "Portmore", "Montego Bay", 1)

        questionsList.add(que166)

        //167
        val que167 = Question(167, "What is the capital of Cameroon?", R.drawable.question_01,
            "Bissau", "Yaounde", "Ouagadougou", "Cape Town", 2)

        questionsList.add(que167)

        //168
        val que168 = Question(168, "What is the capital of Switzerland?", R.drawable.question_01,
            "Geneva", "Zurich", "Bern", "Basel", 3)

        questionsList.add(que168)

        //169
        val que169 = Question(169, "What is the capital of Denmark?", R.drawable.question_01,
            "Hague", "Berlin", "Lucerne", "Copenhagen", 4)

        questionsList.add(que169)

        //170
        val que170 = Question(170, "What is the capital of Belgium?", R.drawable.question_01,
            "Brussels", "Bruges", "Antwerp", "Ghent", 1)

        questionsList.add(que170)

        //171
        val que171 = Question(
            171, "To which city does this landmark belong?",
            R.drawable.pisa,
            "Lecce", "Pisa",
            "Florence", "Bologna", 2
        )

        questionsList.add(que171)

        //172
        val que172 = Question(
            172, "To which city does this landmark belong?",
            R.drawable.louvre,
            "London", "Madrid",
            "Paris", "Venice", 3
        )

        questionsList.add(que172)

        //173
        val que173 = Question(
            173, "To which city does this landmark belong?",
            R.drawable.hagiasophia,
            "Tehran", "Sofia",
            "Bratislava", "Istanbul", 4
        )

        questionsList.add(que173)

        //174
        val que174 = Question(
            174, "To which city does this landmark belong?",
            R.drawable.jerusalem,
            "Jerusalem", "Cairo",
            "Damascus", "Ankara", 1
        )

        questionsList.add(que174)

        //175
        val que175 = Question(175, "In which country you can find Bali island?", R.drawable.question_01,
            "India", "Indonesia", "Sri Lanka", "Maldives", 2)

        questionsList.add(que175)

        //176
        val que176 = Question(176, "In which ocean are Galapagos islands located?", R.drawable.question_01,
            "Arctic Ocean", "Indian Ocean", "Pacific Ocean", "Atlantic Ocean", 3)

        questionsList.add(que176)

        //177
        val que177 = Question(177, "In which ocean is Madagascar located?", R.drawable.question_01,
            "Arctic Ocean", "Atlantic Ocean", "Pacific Ocean", "Indian Ocean", 4)

        questionsList.add(que177)

        //178
        val que178 = Question(178, "How many main islands are in Japan?", R.drawable.question_01,
            "4", "6", "5", "3", 1)

        questionsList.add(que178)

        //179
        val que179 = Question(179, "Which is the largest lake in north America?", R.drawable.question_01,
            "Lake Huron", "Lake Superior", "Lake Michigan", "Great Bear Lake", 2)

        questionsList.add(que179)

        //180
        val que180 = Question(180, "What is the name of the supercontinent that existed 200 million years ago?", R.drawable.question_01,
            "Gondwana", "Laurasia", "Pangea", "Pannotia", 3)

        questionsList.add(que180)

        //181
        val que181 = Question(181, "Which continent is Tasmania in?", R.drawable.question_01,
            "Europe", "Africa", "Asia", "Australia", 4)

        questionsList.add(que181)

        //182
        val que182 = Question(182, "Select an European country", R.drawable.question_01,
            "Hungary", "Liberia", "Angola", "Panama", 1)

        questionsList.add(que182)

        //183
        val que183 = Question(
            183, "To which city does this landmark belong?",
            R.drawable.berlin,
            "Copenhagen", "Berlin",
            "Stockholm", "Vienna", 2
        )

        questionsList.add(que183)

        //184
        val que184 = Question(
            184, "To which city does this landmark belong?",
            R.drawable.golden_gate,
            "Los Angeles", "Hong Kong",
            "San Francisco ", "New York", 3
        )

        questionsList.add(que184)

        //185
        val que185 = Question(
            185, "To which city does this landmark belong?",
            R.drawable.dubai,
            "Miami", "Tel Aviv",
            "Sao Paulo", "Dubai", 4
        )

        questionsList.add(que185)

        //186
        val que186 = Question(
            186, "To which country does this landmark belong?",
            R.drawable.taj_mahal,
            "India", "Turkey",
            "Iran", "Kuwait", 1
        )

        questionsList.add(que186)

        //187
        val que187 = Question(
            187, "To which country does this landmark belong?",
            R.drawable.terracota,
            "Japan", "China",
            "South Korea", "Taiwan", 2
        )

        questionsList.add(que187)

        //188
        val que188 = Question(
            188, "To which city does this landmark belong?",
            R.drawable.florence,
            "Rome", "Naples",
            "Florence", "Venice", 3
        )

        questionsList.add(que188)

        //189
        val que189 = Question(
            189, "What state is Mount Rushmore located in?",
            R.drawable.mount_rushmore,
            "Texas", "Florida",
            "Arizona", "South Dakota", 4
        )

        questionsList.add(que189)

        //190
        val que190 = Question(
            190, "How many countries are present in Africa??",
            R.drawable.africa,
            "54", "52",
            "60", "73", 1
        )

        questionsList.add(que190)

        //191
        val que191 = Question(191, "What is the capital of Sri Lanka?", R.drawable.question_01,
            "Nassau", "Colombo", "Sarajevo", "Phnom Penh", 2)

        questionsList.add(que191)

        //192
        val que192 = Question(192, "What is the capital of Cyprus?", R.drawable.question_01,
            "Djibouti", "Quito", "Nicosia", "Cairo", 3)

        questionsList.add(que192)

        //193
        val que193 = Question(193, "Which two countries share a geographical region of Patagonia?", R.drawable.patagonia,
            "Nepal and Bhutan", "Nepal and India", "Brazil and Argentina", "Argentina and Chile", 4)

        questionsList.add(que193)

        //194
        val que194 = Question(194, "What country does this map represents?", R.drawable.czech5,
            "Czech Republic", "Belgium", "Italy", "Chile", 1)

        questionsList.add(que194)

        //195
        val que195 = Question(195, "What country does this map represents?", R.drawable.yemen5,
            "Sudan", "Yemen", "France", "Bolivia", 2)

        questionsList.add(que195)

        //196
        val que196 = Question(196, "Which country have the most islands?", R.drawable.island,
            "Indonesia", "Thailand", "Sweden", "Norway", 3)

        questionsList.add(que196)

        //197
        val que197 = Question(197, "To which city does this landmark belong?", R.drawable.sydney,
            "Bangkok", "Tel Aviv", "Kuala Lumpur", "Sydney", 4)

        questionsList.add(que197)

        //198
        val que198 = Question(198, "Which of the following countries is NOT a monarchy?", R.drawable.crown,
            "Russia", "Sweden", "Denmark", "Spain", 1)

        questionsList.add(que198)

        //199
        val que199 = Question(199, "Which of the following countries has theocracy as a form of government?", R.drawable.theocracy,
            "Syria", "Iran", "Mali", "Italy", 2)

        questionsList.add(que199)

        //200
        val que200 = Question(200, "Real is the currency of which country?", R.drawable.coins,
            "Colombia", "Mexico", "Brazil", "Guatemala", 3)

        questionsList.add(que200)






















































































































































































































        return questionsList


    }




}