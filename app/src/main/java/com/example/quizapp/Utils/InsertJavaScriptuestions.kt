package com.example.quizapp.Utils

import com.example.quizapp.Model.AndroidQuestionModel

class   InsertJavaScriptuestions {

    private var questionModelList = mutableListOf<AndroidQuestionModel>()

    fun insertJSQuestionToDB(): MutableList<AndroidQuestionModel> {
        val questionModel = AndroidQuestionModel(
            " In JavaScript, what is a block of statement?",
            "Conditional block",
            "block that combines a number of statements into a single compound statement",
            "both conditional block and a single statement",
            "block that contains a single statement",
            2
        )
        questionModelList.add(questionModel)

        val questionModel1 = AndroidQuestionModel(
            "When interpreter encounters an empty statements, what it will do:",
            "Shows a warning",
            "Prompts to complete the statement",
            "Throws an error",
            "Ignores the statements",
            4
        )
        questionModelList.add(questionModel1)


        val questionModel2 = AndroidQuestionModel(
            " The \"function\" and \" var\" are known as:",

            "Keywords",
            "Data types",
            "Declaration statements",
            "Prototypes",
            3
        )
        questionModelList.add(questionModel2)


        val questionModel3 = AndroidQuestionModel(
            "Which of the following variables takes precedence over the others if the names are the same?",

            "Global variable",
            "The local element",
            "The two of the above",
            "None of the above",

            2
        )
        questionModelList.add(questionModel3)


        val questionModel4 = AndroidQuestionModel(
            "Which one of the following also known as Conditional Expression:",

            "Alternative to if-else",
            "Switch statement",
            "If-then-else statement",
            "immediate if",

            4
        )

        questionModelList.add(questionModel4)

        val questionModel5 = AndroidQuestionModel(
            "Which type of JavaScript language is ___",

            "Object-Oriented",
            "Object-Based",
            "Assembly-language",
            "High-level",
            2
        )
        questionModelList.add(questionModel5)

        val questionModel6 = AndroidQuestionModel(
            "Which one of the following is the correct way for calling the JavaScript code?",
            "Preprocessor.",
            "Triggering Event",
            "RMI",
            "Function/Method",
            4
        )
        questionModelList.add(questionModel6)

        val questionModel7 = AndroidQuestionModel(
            "Which of the following type of a variable is volatile?",
            "Mutable variable",
            "Dynamic variable",
            "Volatile variable",
            "Immutable variable",
            1
        )
        questionModelList.add(questionModel7)

        val questionModel8 = AndroidQuestionModel(
            " Which of the following option is used as hexadecimal literal beginning?",
            "00",
            "0x",
            "0X",
            "Both 0x and 0X",
            4
        )
        questionModelList.add(questionModel8)

        val questionModel9 = AndroidQuestionModel(
            "When there is an indefinite or an infinite value during an arithmetic computation in a program, then JavaScript prints______.",
            "Prints an exception error",
            "Prints an overflow error",
            "Displays \"Infinity\"",
            "Prints the value as such",
            3
        )
        questionModelList.add(questionModel9)

        val questionModel10 = AndroidQuestionModel(
            " In the JavaScript, which one of the following is not considered as an error:",
            "Syntax error",
            "Missing of semicolons",
            "Division by zero",
            "Missing of Bracket",
            3
        )
        questionModelList.add(questionModel10)

        val questionModel11 = AndroidQuestionModel(
            " Which of the following number object function returns the value of the number?",
            "toString()",
            "valueOf()",
            "toLocaleString()",
            "toPrecision()",
            2
        )
        questionModelList.add(questionModel11)

        val questionModel12 = AndroidQuestionModel(
            "In JavaScript the x===y statement implies that:",
            "Both x and y are equal in value, type and reference address as well.",
            "Both are x and y are equal in value only.",
            "Both are equal in the value and data type.",
            "Both are not same at all.",
            3
        )
        questionModelList.add(questionModel12)

        val questionModel13 = AndroidQuestionModel(
            "Choose the correct snippet from the following to check if the variable \"a\" is not equal the \"NULL\":",
            "if(a!==null)",
            "if (a!)",
            "if(a!null)",
            "if(a!=null)",
            1
        )
        questionModelList.add(questionModel13)

        val questionModel14 = AndroidQuestionModel(
            "In JavaScript, what will be used for calling the function definition expression:\n" +
                    "",
            "Function prototype",
            "Function literal",
            "Function calling",
            "Function declaration",
            2
        )
        questionModelList.add(questionModel14)

        val questionModel15 = AndroidQuestionModel(
            "Which of the following one is the property of the primary expression:",
            "Contains only keywords",
            "basic expressions containing all necessary functions",
            "contains variable references alone",
            "stand-alone expressions",
            4
        )
        questionModelList.add(questionModel15)
        return questionModelList
    }



}