package com.example.diceactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val die1 = findViewById<TextView>(R.id.dice_1)
        val die2 = findViewById<TextView>(R.id.dice_2)
        val die3 = findViewById<TextView>(R.id.dice_3)
        val lnum1 = findViewById<TextView>(R.id.x1)
        val lnum2 = findViewById<TextView>(R.id.x2)
        val lnum3 = findViewById<TextView>(R.id.x3)
        val Ch = findViewById<CheckBox>(R.id.check)
        val But = findViewById<Button>(R.id.button)
        val nam = findViewById<EditText>(R.id.Name)
        var count:Int = 0

        But.setOnClickListener{
            count = 0
            val Roll = Dice()
            die1.setText("Dice #1 Results: "+Roll.dice1)
            die2.setText("Dice #2 Results: "+Roll.dice2)
            die3.setText("Dice #3 Results: "+Roll.dice3)
            if (Roll.dice1Result==true){
                lnum1.setText("Win")
                count++
            } else {
                lnum1.setText("Lose")
            }
            if (Roll.dice2Result==true){
                lnum2.setText("Win")
                count++
            } else {
                lnum2.setText("Lose")
            }
            if (Roll.dice3Result==true){
                lnum3.setText("Win")
                count++
            } else {
                lnum3.setText("Lose")
            }
            if (Ch.isChecked){
                if (count!=0){
                    val toast = Toast.makeText(applicationContext,nam.text.toString()+", Won "+count.toString()+"/3!",Toast.LENGTH_SHORT)
                    toast.show()
                } else {
                    val toast = Toast.makeText(applicationContext,nam.text.toString()+", Try Again ",Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }
    }
}