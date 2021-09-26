package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var result  = 3
        var score = 0
        fun print(score: Int){
            if(score>= 5){
            Log.d("MAIN_ACTIVITY","You Pass!")}
            else{
                Log.d("MAIN_ACTIVITY","your score is very low:(")}
            }
        if((2+1)==result){
            score++
        }
        result = 7
        if((2+5)==result){
            score++
        }
        result = 10
        if((9+1)==result){
            score++
        }
        result = 11
        if((10+1)==result){
            score++
        }
        result = 50
        if((2+48)==result){
            score++
        }

        print(score)



    }
}