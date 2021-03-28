package com.example.homework_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.set

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Task5*/
        //textView = findViewById(R.id.textView)
    }

    /*Task 3*/

    /*fun buttonCLickHandler(button: View){
        val login = findViewById<EditText>(R.id.login)
        val password = findViewById<EditText>(R.id.password)

        if(!(login.text.endsWith("@mail.ru") || login.text.endsWith("@gmail.com"))){
            Toast.makeText(this, "Invalid e-mail!!!", Toast.LENGTH_SHORT).show()
            return
        }

        if(password.text.length < 8 ||
           password.text.toString() == "00000000" ||
           password.text.toString() == "12345678" ||
           password.text.toString() == "87654321"){

            Toast.makeText(this, "Invalid password!!!", Toast.LENGTH_SHORT).show()
            return
        }

        Toast.makeText(this, "Login: ${login.text}\n Password: ${password.text}", Toast.LENGTH_SHORT).show()
        return
    }

    fun editTextClickHandler(view: View){
        val id = view.id
        val text = findViewById<EditText>(id).text

        if(text.toString() == getString(R.string.email) || text.toString() == getString(R.string.password)){
            if(view is EditText){
                view.setText("")
            }
        }
    }*/

    /*Task 4*/

    /*fun clickHandler(view: View){
        val button = findViewById<Button>(view.id)
        val result = findViewById<TextView>(R.id.result)
        val fText = findViewById<EditText>(R.id.f_number_edit).text
        val sText = findViewById<EditText>(R.id.s_number_edit).text
        if(fText.isEmpty() || sText.isEmpty()){
            return
        }

        val fNumber = fText.toString().toDouble()
        val sNumber = sText.toString().toDouble()

        when(button.text.toString()){
            "+" -> result.setText("${fNumber + sNumber}")
            "-" -> result.setText("${fNumber - sNumber}")
            "X" -> result.setText("${fNumber * sNumber}")
            "/" -> {
                if(sNumber == 0.0){
                    Toast.makeText(this, "Can't divide by 0", Toast.LENGTH_SHORT).show()
                    return
                }
                result.setText("${fNumber / sNumber}")
            }
        }
    }*/

    /*Task 5*/

    /*var fNumber: Double? = null
    var sNumber: Double? = null
    var result = 0.0
    var operation = ""

    fun numberClick(view: View){
        var text = ""
        if(view is Button){
            if(view.text.toString() == "0" && textView.text.toString().endsWith("0")){
                return
            }

            text = textView.text.toString() + view.text.toString()
            textView.text = text
        }
    }

    fun operationClick(view: View){
        var text = ""
        if(view is Button) {
            if(textView.text.toString().contains("X") ||
                    textView.text.toString().contains("+") ||
                    textView.text.toString().contains("-") ||
                    textView.text.toString().contains("/") ||
                    textView.text.toString().endsWith("%")){
                return
            }
            operation =  view.text.toString()
            fNumber = textView.text.toString().toDouble()
            text = textView.text.toString() + operation
            textView.text = text
        }
    }

    fun equalClick(view: View){
        val index = textView.text.indexOf(operation)
        sNumber = textView.text.substring(index + 1).toDouble()


        if(fNumber == null || sNumber == null || operation == ""){
            return
        }

        when(operation){
            "+" -> result = fNumber!! + sNumber!!
            "-" -> result = fNumber!! - sNumber!!
            "X" -> result = fNumber!! * sNumber!!
            "%" -> result = fNumber!! * sNumber!! / 100
            "/" -> {
                if(sNumber == 0.0){
                    Toast.makeText(this, "Can't divide by 0!!!", Toast.LENGTH_SHORT)
                    return
                }
                result = fNumber!! / sNumber!!
            }
        }

        textView.text = result.toString()
    }

    fun deleteClick(view: View){
        if(textView.text.isEmpty()){
            return
        }

        textView.text = textView.text.substring(0, textView.text.length - 1)
    }

    fun cClick(view: View){
        textView.text = ""
    }

    fun commaClick(view: View){
        if(operation == ""){
            if(!textView.text.contains(".")){
                textView.text = textView.text.toString() + "."
            }
            return
        }

        val index = textView.text.indexOf(operation)
        if(!textView.text.substring(index + 1).contains(".")){
            textView.text = textView.text.toString() + "."
        }
    }*/
}