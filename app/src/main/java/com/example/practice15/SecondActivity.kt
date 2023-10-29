package com.example.practice15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tv1: TextView = findViewById(R.id.textView)
        val tv2 : TextView = findViewById(R.id.textView2)
        val tv3 : TextView = findViewById(R.id.textView3)

        var animal : Animal = Animal()

        val arg : Bundle? = intent.extras

        if (arg != null){
            animal = arg.getParcelable<Animal>(animal.javaClass.simpleName) as Animal

            tv1.text = " Порода -> ${animal.getBreed()}"
            tv2.text = " Год -> ${animal.getYear()}"
            tv3.text = " Месяц -> ${animal.getMounth()}"

        }

    }
}