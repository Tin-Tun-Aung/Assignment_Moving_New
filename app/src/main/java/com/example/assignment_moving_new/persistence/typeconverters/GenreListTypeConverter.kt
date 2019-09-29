package com.example.assignment_moving_new.persistence.typeconverters

import androidx.room.TypeConverter
import com.example.assignment_moving_new.data.vos.GenreVO
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class GenreListTypeConverter {


        @TypeConverter
        fun genreListToJson(genreList: List<GenreVO>):String{
            return Gson().toJson(genreList)
        }

        @TypeConverter
        fun toList(json : String) : List<GenreVO>{
            val typeToken = object : TypeToken<List<GenreVO>>(){

            }.type
            return Gson().fromJson(json,typeToken)
        }

//    companion object{
//        @TypeConverter
//        fun userListToJson(userList: List<UserVO>):String{
//            return Gson().toJson(userList)
//        }
//
//        @TypeConverter
//        fun toList(json : String) : List<UserVO>{
//            val typeToken = object : TypeToken<List<UserVO>>(){
//
//            }.type
//            return Gson().fromJson(json,typeToken)
//        }

//    }
}