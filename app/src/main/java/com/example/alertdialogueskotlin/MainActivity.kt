package com.example.alertdialogueskotlin

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun save (view: View){
        val alert = AlertDialog.Builder(this)

        alert.setTitle("save")
        alert.setMessage("are you sure ?")
        alert.setPositiveButton("yes"){dialog: DialogInterface, which: Int -> Toast.makeText(applicationContext,"Saved", Toast.LENGTH_LONG).show()  }
        alert.setNegativeButton("No"){dialog: DialogInterface?, which: Int -> Toast.makeText(applicationContext,"Not Saved", Toast.LENGTH_LONG).show() }
        alert.show()

    }
}