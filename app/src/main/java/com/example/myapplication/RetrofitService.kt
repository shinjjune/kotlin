package com.example.myapplication

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RetrofitService{

    @GET("json/students/")
    fun getStudentsList(): Call<ArrayList<PersonFromServer>>

    @POST("json/students/")
    fun createStudents(
        @Body params : HashMap<String, Any>
    ): Call<PersonFromServer>

    @POST("json/students/")
    fun createStudentEasy(
        @Body person: PersonFromServer
    ): Call<PersonFromServer>
}