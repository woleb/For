package com.example.it_wog.afor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 /*       var text = ""
        //for (i in 1..10){
        //for ( i in 10 downTo 1){
        for ( i in 1..10 step 2){
          text = text + i + "\n"
        }
        textfeld.text = text
*/
        var text =listOf("Hallo " , "test" , " noch etwas")
        var ausgabe = ""
        for (i in text){
            ausgabe = ausgabe + i
        }
        textfeld.text = ausgabe

    }
}
