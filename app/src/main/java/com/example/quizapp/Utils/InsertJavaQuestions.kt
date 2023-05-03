package com.example.quizapp.Utils

import com.example.quizapp.Model.AndroidQuestionModel

class InsertJavaQuestions {

    private var questionModelList = mutableListOf<AndroidQuestionModel>()

    fun insertJavaQuestionToDB(): MutableList<AndroidQuestionModel> {
        val questionModel = AndroidQuestionModel(
            "Java is developed by?",
            "Google",
            "Adobe",
            "SunMicroSystem",
            "Microsoft",
            3
        )
        questionModelList.add(questionModel)

        val questionModel1 = AndroidQuestionModel(
            "What is the default behavior of Java classes?",
            "All classes are public",
            "All classes are sealed",
            "All classes are abstract",
            "All classes are final",
            4
        )
        questionModelList.add(questionModel1)


        val questionModel2 = AndroidQuestionModel(
            "What is an immutable variable?",
            "A variable that can't change, read-only",
            "A variable that can be changed",
            "A variable used for string interpolation",
            "None of the above",
            1
        )
        questionModelList.add(questionModel2)


        val questionModel3 = AndroidQuestionModel(
            "Which of the following is a reserved keyword in Java?",
            "object",
            "strictfp",
            "main",
            "system",
            2
        )
        questionModelList.add(questionModel3)


        val questionModel4 = AndroidQuestionModel(
            "In which memory a String is stored, when we create a string using new operator?",
            "Stack",
            "String memory",
            "Heap memory",
            "Random storage space",
            3
        )

        questionModelList.add(questionModel4)

        val questionModel5 = AndroidQuestionModel(
            "Which of these classes are the direct subclasses of the Throwable class?",
            "RuntimeException and Error class",
            "Exception and VirtualMachineError class",
            "Error and Exception class",
            "IOException and VirtualMachineError class",
            3
        )
        questionModelList.add(questionModel5)

        val questionModel6 = AndroidQuestionModel(
            " Which option is false about the final keyword?",
            ".A final method cannot be overridden in its subclasses.",
            "A final class cannot be extended.",
            "A final class cannot extend other classes.",
            "A final method can be inherited.",
            3
        )
        questionModelList.add(questionModel6)

        val questionModel7 = AndroidQuestionModel(
            "An interface with no fields or methods is known as a ______.",
            "Runnable Interface",
            "Marker Interface",
            "Abstract Interface",
            "CharSequence Interface",
            2
        )
        questionModelList.add(questionModel7)

        val questionModel8 = AndroidQuestionModel(
            "What do you mean by nameless objects?",
            "An object created by using the new keyword.",
            "An object of a superclass created in the subclass.",
            "An object without having any name but having a reference.",
            "An object that has no reference.",
            4
        )
        questionModelList.add(questionModel8)

        val questionModel9 = AndroidQuestionModel(
            "Which package contains the Random class?",
            "java.util package",
            "java.lang package",
            "java.awt package",
            "java.io package",
            1
        )
        questionModelList.add(questionModel9)

        val questionModel10 = AndroidQuestionModel(
            "Which of the following is true about the anonymous inner class?",
            "It has only methods",
            "Objects can't be created",
            "It has a fixed class name",
            "It has no class name",
            4
        )
        questionModelList.add(questionModel10)

        val questionModel11 = AndroidQuestionModel(
            " In which process, a local variable has the same name as one of the instance variables?",
            "Serialization",
            "Variable Shadowing",
            "Abstraction",
            "Multi-threading",
            2
        )
        questionModelList.add(questionModel11)

        val questionModel12 = AndroidQuestionModel(
            "Which of the following for loop declaration is not valid?",
            "for ( int i = 99; i >= 0; i / 9 )",
            "for ( int i = 7; i <= 77; i += 7 )",
            "for ( int i = 20; i >= 2; - -i )",
            "for ( int i = 2; i <= 20; i = 2* i )",
            1
        )
        questionModelList.add(questionModel12)

        val questionModel13 = AndroidQuestionModel(
            "Which of the following creates a List of 3 visible items and multiple selections abled?",
            "new List(false, 3)",
            "new List(3, true)",
            "new List(true, 3)",
            "new List(3, false)",
            2
        )
        questionModelList.add(questionModel13)

        val questionModel14 = AndroidQuestionModel(
            "Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?",
            "javap tool",
            "javaw command",
            "Javadoc tool",
            "javah command",
            3
        )
        questionModelList.add(questionModel14)

        val questionModel15 = AndroidQuestionModel(
            "is used to find and fix bugs in the Java programs.",
            "JVM",
            "JRE",
            "JDK",
            "JDB",
            4
        )
        questionModelList.add(questionModel15)

        val questionModel16 = AndroidQuestionModel(
            "Which of the following is a valid declaration of a char?",
            "char ch = '\\utea';",
            "char ca = 'tea';",
            "char cr = \\u0223;",
            "char cc = '\\itea';",
            1
        )
        questionModelList.add(questionModel16)

        val questionModel17 = AndroidQuestionModel(
            "Which of the following is not a Java features?",
            "Dynamic",
            "Architecture Neutral",
            "Use of pointers",
            "Object-oriented",
            3
        )
        questionModelList.add(questionModel17)

        questionModelList.add(questionModel15)
        return questionModelList
    }




}