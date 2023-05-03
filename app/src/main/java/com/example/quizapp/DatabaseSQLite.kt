package com.example.quizapp

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DatabaseSQLite(context: Context, s: String, nothing: Nothing?, i: Int) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(sqLiteDatabase: SQLiteDatabase) {
        val str1:String="create table users(username text,email text,password text)";
        sqLiteDatabase.execSQL(str1);


    }
    override fun onUpgrade(sqLiteDatabase: SQLiteDatabase, i: Int, i1: Int) {

    }

    fun register(username: String, email: String, pass: String) {
        val cv = ContentValues()
        cv.put("username",username)
        cv.put("email",email)
        cv.put("password",pass)
        val db = writableDatabase
        db.insert("users",null,cv)
        db.close()

    }
    fun login(username: String, password: String): Int {
        var result = 0
        val str = arrayOf(username, password)
        val db=readableDatabase
        val c:Cursor=db.rawQuery("select * from users where username=? and password=?",str)
        if(c.moveToFirst()){
            result=1
        }
        return result
    }

    companion object {
        private const val DATABASE_NAME = "your_database_name"
        private const val DATABASE_VERSION = 1
    }
}
