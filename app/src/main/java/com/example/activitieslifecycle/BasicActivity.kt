package com.example.activitieslifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BasicActivity : AppCompatActivity() {

    fun printLifecycle(funName: String?) {
        print(this.componentName.className)
        print(" : ")
        println(funName)
    }

    override fun onStart() {
        super.onStart()
        printLifecycle(object {}.javaClass.enclosingMethod?.name)
    }

    override fun onResume() {
        super.onResume()
        printLifecycle(object {}.javaClass.enclosingMethod?.name)
    }

    override fun onPause() {
        super.onPause()
        printLifecycle(object {}.javaClass.enclosingMethod?.name)
    }

    override fun onStop() {
        super.onStop()
        printLifecycle(object {}.javaClass.enclosingMethod?.name)
    }

    override fun onRestart() {
        super.onRestart()
        printLifecycle(object {}.javaClass.enclosingMethod?.name)
    }

    override fun onDestroy() {
        super.onDestroy()
        printLifecycle(object {}.javaClass.enclosingMethod?.name)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        printLifecycle(object {}.javaClass.enclosingMethod?.name)
    }
}
