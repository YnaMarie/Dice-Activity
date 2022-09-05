package com.example.diceactivity

class Dice {
    var dice1 = (1..6).random()
    var dice2 = (1..12).random()
    var dice3 = (1..18).random()
    val y1 = 3
    val y2 = 6
    val y3 = 9
    var dice1Result:Boolean = false
    var dice2Result:Boolean = false
    var dice3Result:Boolean = false

    private fun numChecker(){
        if (dice1 == y1){
            dice1Result = true
        } else {
            dice1Result = false
        }
        if (dice2 == y2){
            dice2Result = true
        } else {
            dice2Result = false
        }
        if (dice3 == y3){
            dice3Result = true
        } else {
            dice3Result = false
        }
    }
    val callfun = numChecker()
}