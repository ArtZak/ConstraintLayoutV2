package com.example.constraintlayoutv2

import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    /*tic-tac-toe*/
    var arr = mutableListOf<Button>()
    var pNumber = 1
    var flag = 0
    lateinit var stateText: TextView

    /*Dice*/
    /*lateinit var image: ImageView
    val dices = mutableListOf<Drawable>()*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tic_tac_toe)

        /*Dice*/
        /*image = findViewById(R.id.dice_image)

        for(i in 1..6){
            var imageId = "dice_$i"
            var resId = resources.getIdentifier(imageId, "drawable", packageName)
            dices.add(resources.getDrawable(resId))
        }*/

        /*tic-tac-toe*/
        for (i in 1..9){
            var buttonId = "button_"+"$i"
            var resId = resources.getIdentifier(buttonId, "id", packageName)
            arr.add(findViewById(resId))
        }

        stateText = findViewById(R.id.game_state)
        stateText.text = "Player ${pNumber % 2}"
    }

    /*Dice*/
    /*fun rollHandler(view: View){
        val rnd = Random
        if(view is Button) {
            val image = findViewById<ImageView>(R.id.dice_image)
            image.setImageDrawable(dices[rnd.nextInt(0, 6)])
        }
    }*/

    /*Tic-tac-toe*/
    fun fieldHandler(view: View){
        if(flag == 0 && view is Button){
            if(view.text == "X" || view.text == "O"){
                return
            }

            when(pNumber % 2){
                1 -> {
                    view.text = "X"
                    pNumber++
                }
                0 ->{
                    view.text = "O"
                    pNumber++
                }
            }

            stateText.text = "Player ${(pNumber + 1) % 2 + 1}"
            flag = checkWin(arr, pNumber)
            if(flag == 1){
                stateText.text = "Player ${pNumber % 2 + 1} Wins!!!"
            }
            else if(flag == -1){
                stateText.text = "Draw!!!"
            }
        }
    }

    fun resetHandler(view: View){
        for(i in 0..8){
            arr[i].text = ""
        }
        flag = 0
        pNumber = 1
        stateText.text = "Player ${(pNumber + 1) % 2 + 1}"
    }

    private fun checkWin(arr: MutableList<Button>, count: Int): Int{
        if(arr[0].text.toString() == arr[1].text.toString() && arr[1].text.toString() == arr[2].text.toString() && arr[1].text.toString() != ""
                || arr[3].text.toString() == arr[4].text.toString() && arr[4].text.toString() == arr[5].text.toString() && arr[3].text.toString() != ""
                || arr[6].text.toString() == arr[7].text.toString() && arr[7].text.toString() == arr[8].text.toString() && arr[6].text.toString() != ""

                || arr[0].text.toString() == arr[3].text.toString() && arr[3].text.toString() == arr[6].text.toString() && arr[0].text.toString() != ""
                || arr[1].text.toString() == arr[4].text.toString() && arr[4].text.toString() == arr[7].text.toString() && arr[1].text.toString() != ""
                || arr[2].text.toString() == arr[5].text.toString() && arr[5].text.toString() == arr[8].text.toString() && arr[2].text.toString() != ""

                || arr[0].text.toString() == arr[4].text.toString() && arr[4].text.toString() == arr[8].text.toString() && arr[0].text.toString() != ""
                || arr[2].text.toString() == arr[4].text.toString() && arr[4].text.toString() == arr[6].text.toString() && arr[2].text.toString() != ""){
            return 1
        }
        else if(count > 9){
            return -1
        }
        return 0
    }
}
