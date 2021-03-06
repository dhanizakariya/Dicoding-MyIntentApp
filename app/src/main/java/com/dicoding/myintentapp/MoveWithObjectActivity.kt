package com.dicoding.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithObjectActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_PERSON = "extra person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        val tvObjects:TextView = findViewById(R.id.tv_object_received)

        val person = intent.getParcelableExtra<Person>(EXTRA_PERSON) as Person
        val text = "Name: ${person.name.toString()}, \nEmail: ${person.email}, \nAge : ${person.age}, \nLocation : ${person.city}"
        tvObjects.text = text
    }
}