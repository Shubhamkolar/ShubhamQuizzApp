package com.example.quizapp.Utils

import com.example.quizapp.Model.AndroidQuestionModel

class InsertNetworkingQuestions {

    private var questionModelList = mutableListOf<AndroidQuestionModel>()

    fun insertNetworkQuestionToDB(): MutableList<AndroidQuestionModel> {
        val questionModel = AndroidQuestionModel(
            "HTTP stands for ?",
            "Safari",
            "Firefox",
            "Hyper Text Transfer Protocol",
            "Chrome",
            3
        )
        questionModelList.add(questionModel)

        val questionModel1 = AndroidQuestionModel(
            "Which of these is a standard interface for serial data transmission?",
            "ASCII",
            "RS232C",
            "2",
            "Centronics",
            2
        )
        questionModelList.add(questionModel1)


        val questionModel2 = AndroidQuestionModel(
            "Which of the following transmission directions listed is not a legitimate channel?",

            "Simplex",
            "Half Duplex",
            "Full Duplex",
            "Double Duplex",
            4
        )
        questionModelList.add(questionModel2)


        val questionModel3 = AndroidQuestionModel(
            " \"Parity bits\" are used for which of the following purposes?",

            "Encryption of data",
            "To transmit faster",
            "To detect errors",
            "To identify the user",

            3
        )
        questionModelList.add(questionModel3)


        val questionModel4 = AndroidQuestionModel(
            "A collection of hyperlinked documents on the internet forms the ?.?",

            "World Wide Web (WWW)",
            "E-mail system",
            "Mailing list",
            "Hypertext markup language",

            1
        )

        questionModelList.add(questionModel4)

        val questionModel5 = AndroidQuestionModel(
            "  The location of a resource on the internet is given by its?",

            "Protocol",
            "URL",
            "E-mail address",
            "ICQ",
            2
        )
        questionModelList.add(questionModel5)

        val questionModel6 = AndroidQuestionModel(
            "The term HTTP stands for??",
            "Hyper terminal tracing program.",
            "Hypertext tracing protocol.",
            "Hypertext transfer protocol.",
            "Hypertext transfer program.",
            3
        )
        questionModelList.add(questionModel6)

        val questionModel7 = AndroidQuestionModel(
            "A proxy server is used as the computer?",
            "with external access",
            "acting as a backup",
            "performing file handling",
            "accessing user permissions",
            1
        )
        questionModelList.add(questionModel7)

        val questionModel8 = AndroidQuestionModel(
            "Which one of the following would breach the integrity of a system?",
            "Looking the room to prevent theft",
            "Full access rights for all users",
            "Fitting the system with an anti-theft device",
            "Protecting the device against willful or accidental damage",
            2
        )
        questionModelList.add(questionModel8)

        val questionModel9 = AndroidQuestionModel(
            "Which software prevents the external access to a system?",
            "Firewall",
            "Gateway",
            "Router",
            "Virus checker",
            1
        )
        questionModelList.add(questionModel9)

        val questionModel10 = AndroidQuestionModel(
            "Which one of the following is a valid email address?",
            "javat@point.com",
            "gmail.com",
            "tpoint@.com",
            "javatpoint@books",
            1
        )
        questionModelList.add(questionModel10)

        val questionModel11 = AndroidQuestionModel(
            "Which of the following best describes uploading information?",
            "Sorting data on a disk drive",
            "Sending information to a host computer",
            "Receiving information from a host computer",
            "Sorting data on a hard drive",
            2
        )
        questionModelList.add(questionModel11)

        val questionModel12 = AndroidQuestionModel(
            "Which one of the following is the most common internet protocol?",
            "HTML",
            "NetBEUI",
            "TCP/IP",
            "IPX/SPX",
            3
        )
        questionModelList.add(questionModel12)

        val questionModel13 = AndroidQuestionModel(
            "Software programs that allow you to legally copy files and give them away at no cost are called which of the following?",
            "Probe ware",
            "Timeshare",
            "Shareware",
            "Public domain",
            4
        )
        questionModelList.add(questionModel13)

        val questionModel14 = AndroidQuestionModel(
            " The term FTP stands for?",
            "File transfer program",
            "File transmission protocol",
            "File transfer protocol",
            "File transfer protection",
            3
        )
        questionModelList.add(questionModel14)

        val questionModel15 = AndroidQuestionModel(
            "At what speed does tele-computed refer?",
            "Interface speed",
            "Cycles per second",
            "Baud rate",
            "Megabyte load",
            3
        )
        questionModelList.add(questionModel15)
        return questionModelList
    }

}