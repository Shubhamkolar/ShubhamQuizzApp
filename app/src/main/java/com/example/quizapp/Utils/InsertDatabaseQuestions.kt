package com.example.quizapp.Utils

import com.example.quizapp.Model.AndroidQuestionModel

class InsertDatabaseQuestions {

    private var questionModelList = mutableListOf<AndroidQuestionModel>()

    fun insertDataQuestionToDB(): MutableList<AndroidQuestionModel> {
        val questionModel = AndroidQuestionModel(
            "What is the full form of DBMS?",
            "Data of Binary Management System",
            "Database Management System",
            "Database Management Service",
            "Data Backup Management System",
            2
        )
        questionModelList.add(questionModel)

        val questionModel1 = AndroidQuestionModel(
            "What is a database?",
            "Organized collection of information that cannot be accessed, updated, and managed",
            "Collection of data or information without organizing",
            "Organized collection of data or information that can be accessed, updated, and managed",
            "Organized collection of data that cannot be updated",
            3
        )
        questionModelList.add(questionModel1)


        val questionModel2 = AndroidQuestionModel(
            "What is DBMS?",

            "DBMS is a collection of queries",
            "DBMS is a high-level language",
            "DBMS is a programming language",
            "DBMS stores, modifies and retrieves data",
            4
        )
        questionModelList.add(questionModel2)


        val questionModel3 = AndroidQuestionModel(
            "Who created the first DBMS?",

            "Edgar Frank Codd",
            "Charles Bachman",
            "Charles Babbage",
            "Sharon B. Codd",

            2
        )
        questionModelList.add(questionModel3)


        val questionModel4 = AndroidQuestionModel(
            "Which type of data can be stored in the database?",

            "Image oriented data",
            "Text, files containing data",
            "Data in the form of audio or video",
            "All of the above",

            4
        )

        questionModelList.add(questionModel4)

        val questionModel5 = AndroidQuestionModel(
            " In which of the following formats data is stored in the database management system?",

            "Image",
            "Text",
            "Table",
            "Graph",
            3
        )
        questionModelList.add(questionModel5)

        val questionModel6 = AndroidQuestionModel(
            "Which of the following is not a type of database?",
            "Hierarchical",
            "Network",
            "Distributed",
            "Decentralized",
            4
        )
        questionModelList.add(questionModel6)

        val questionModel7 = AndroidQuestionModel(
            "Which of the following is not an example of DBMS?",
            "MySQL",
            "Microsoft Acess",
            "IBM DB2",
            "Google",
            4
        )
        questionModelList.add(questionModel7)

        val questionModel8 = AndroidQuestionModel(
            "Which of the following is a feature of DBMS?",
            "Minimum Duplication and Redundancy of Data",
            "High Level of Security",
            "Single-user Access only",
            "Support ACID Property",
            3
        )
        questionModelList.add(questionModel8)

        val questionModel9 = AndroidQuestionModel(
            "Which of the following is a feature of the database?",
            "No-backup for the data stored",
            "User interface provided",
            "Lack of Authentication",
            "Store data in multiple locations",
            2
        )
        questionModelList.add(questionModel9)

        val questionModel10 = AndroidQuestionModel(
            "Which of the following is not a function of the database?",
            "Managing stored data",
            "Manipulating data",
            "Security for stored data",
            "Analysing code",
            4
        )
        questionModelList.add(questionModel10)

        val questionModel11 = AndroidQuestionModel(
            " Which of the following is a function of the DBMS?",
            "Storing data",
            "Providing multi-users access control",
            "Data Integrity",
            "All of the above",
            4
        )
        questionModelList.add(questionModel11)

        val questionModel12 = AndroidQuestionModel(
            "Which of the following is a component of the DBMS?",
            "Data",
            "Data Languages",
            "Data Manager",
            "All of the above",
            4
        )
        questionModelList.add(questionModel12)

        val questionModel13 = AndroidQuestionModel(
            "Which of the following is known as a set of entities of the same type that share same properties, or attributes?",
            "Relation set",
            "Tuples",
            "Entity set",
            "Entity Relation model",
            3
        )
        questionModelList.add(questionModel13)

        val questionModel14 = AndroidQuestionModel(
            "What is information about data called?",
            "Hyper data",
            "Tera data",
            "Meta data",
            "Relations",
            3
        )
        questionModelList.add(questionModel14)

        val questionModel15 = AndroidQuestionModel(
            "What does an RDBMS consist of?",
            "Collection of Records",
            "Collection of Keys",
            "Collection of Tables",
            "Collection of Fields",
            3
        )
        questionModelList.add(questionModel15)
        return questionModelList
    }
}