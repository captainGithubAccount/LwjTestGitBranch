package com.example.lwjtest_git_branch1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //来自branch3分支修改的
    }

    fun startAlterTheSavePos(){
        //branch3: 我修改了这里
        //branch3: 我修改了这里


    }
}