package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var diceImage : ImageView = findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        //val dice_image: ImageView = findViewById(R.id.dice_image)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 =findViewById(R.id.dice_image)
    }

    private fun rollDice(){
       /* val diceImage: ImageView = findViewById(R.id.dice_image)
        //val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
       val drawableRes = when (randomInt){
           1 -> R.drawable.dice_1
           2 -> R.drawable.dice_2
           3 -> R.drawable.dice_3
           4 -> R.drawable.dice_4
           5 -> R.drawable.dice_5
           else -> R.drawable.dice_6
       }*/
       // diceImage.setImageResource(drawableRes)

       /* resultText.text = randomInt.toString()

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()


        if(resultText.text == "Hello World!"){
            resultText.text = "1"
        }
        else{
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()
            }
        }*/

        diceImage.setImageResource(drawableRes())

        diceImage2.setImageResource(drawableRes())


    }
    private fun drawableRes(): Int{
        val randomInt = (1..6).random()
        val drawableRes = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableRes

    }
}
