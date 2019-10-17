package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

// : = extends
class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO : Continue work here
        //val=value,var=variable
        //Java int x; vs Kotlin val x : Tnt
        //findViewById=link program to UI
        val buttonClickMe : Button = findViewById(R.id.buttonClickMe)
        buttonClickMe.setOnClickListener { showMessage() }
    }

    private fun showMessage() {
       val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        //textViewMessage.setText("Hello Jia Wei") //already defined the text in strings.xml
        textViewMessage.setText(getString(R.string.hello))
    }
}
