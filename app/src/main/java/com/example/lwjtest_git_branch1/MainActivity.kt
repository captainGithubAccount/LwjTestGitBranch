package com.example.lwjtest_git_branch1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //来自branch3分支修改的
    }
    fun b2Add(){
        //b3添加的代码
    }
    fun b2Add2(){
        //b3添加的代码
    }
    fun b2Add3(){
        //b3添加的代码
    }
    fun b2Add4(){
        //b3添加的代码
        //来自branch3分支修改的
    }

    fun startAlterTheSavePos(){
        //branch2: 我修改了这里
        //branch2: 我修改了这里
    }


    fun b3Add(){
        //b3添加的代码
    }
}