package com.afaf.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)
        val items = arrayListOf(
            arrayListOf("Project Setup", "Setting up an Android Studio Project.", "Detailed notes here."),
            arrayListOf("Console", "Printing to the console.", "Detailed notes here."),
            arrayListOf("Resource Files", "Identifying, editing, and using resource files.", "Detailed notes here."),
            arrayListOf("UI Elements", "Creating, modifying, and initializing UI Elements.", "Detailed notes here.")
        )

        val rvAndroid = findViewById<RecyclerView>(R.id.rvandroid)
        rvAndroid.adapter = RvAdapter(this, items)
        rvAndroid.layoutManager = LinearLayoutManager(this)

        title = "Android Review"
    }
}