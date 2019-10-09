package com.example.activitieslifecycle

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.*

class B : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        setSupportActionBar(toolbar)
        toolbar.title = componentName.className

        fab.setOnClickListener {
            startActivity(Intent(this, C::class.java))
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
