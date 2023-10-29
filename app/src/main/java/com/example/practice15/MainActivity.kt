package com.example.practice15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btClick(view: View) {

        val breedEditText : EditText = findViewById(R.id.editTextText)
        val yearEditText : EditText = findViewById(R.id.editTextNumber)
        val mounthEditText : EditText = findViewById(R.id.editTextNumber2)

        val breed = breedEditText.text.toString()
        val year = yearEditText.text.toString().toInt()
        val mounth = mounthEditText.text.toString().toInt()

        val animal: Animal = Animal()

        animal.setBreed(breed)
        animal.setYear(year)
        animal.setMounth(mounth)
        
        if (breed == ""){
            Toast.makeText(this, "Введите ваши данные!", Toast.LENGTH_SHORT).show()
            breedEditText.requestFocus()
        }

        else {

            val intent: Intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra(animal.javaClass.simpleName, animal)
            startActivity(intent)
        }
    }
}