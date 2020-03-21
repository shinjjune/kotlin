package com.example.myapplication

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreferenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        // SharedPreference 저장하는 방법

        // MODE
        // - MODE_PRiVATE : 생성한 app에서만 사용 가능
        // - MODE_WORLD_READABLE : 다른 app 사용가능 -> READ ONlY
        // - MODE_WORLD_WRITEABLE : 다른 app 사용가능 -> 기록도 가능
        // - MODE_MULTI_PROCESS : 이미 호출되어 사용중인지 체크
        // - MODE_APPEND : 기존 preference 에 신규로 추가
//        val editor : SharedPreferences.Editor = sharedPreferences.edit()
//        editor.putString("hello", "안녕하세요")
//        editor.commit()

        // sp1 -> Sharedpreference
        //                  (Key, Value) -> ("Hello", "안녕하세요")
        // sp2 -> Sharedpreference
        //                  (Key, Value) -> ("Hello", "안녕하세요11")
        save_btn.setOnClickListener {
            val sharedPreferences = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor : SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("hello", "안녕하세요")
            editor.putString("goodbye", "안녕히가세요")
            editor.commit()
        }


        load_button.setOnClickListener {
            // SharedPreference 에 값을 불러오는 방법
            val sharedPreferences = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val value1 = sharedPreferences.getString("hello","데이터 없음1")
            val value2 = sharedPreferences.getString("goodbye","데이터 없음2")
            Log.d("key=value","value1 : "+ value1)
            Log.d("key=value","value2 : "+ value2)
        }

        delete_button.setOnClickListener {
            val sharedPreferences = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.remove("hello")
            editor.commit()

        }
        delete_all_button.setOnClickListener {
            val sharedPreferences = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.clear()
            editor.commit()

        }
    }
}
