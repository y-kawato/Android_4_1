package jp.co.stv_tech.android_4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btClick = findViewById<Button>(R.id.btClick)
        val listener = HelloListener()
        btClick.setOnClickListener(listener)

        val btClear = findViewById<Button>(R.id.btClear)
        btClear.setOnClickListener(listener)
    }

    private inner class HelloListener : View.OnClickListener {
        override  fun onClick(view: View) {

            val input =findViewById<EditText>(R.id.etName)
            val outout = findViewById<TextView>(R.id.tvOutput)

            when(view.id) {
                R.id.btClick -> {
                    val inputStr = input.text.toString()
                    outout.text = inputStr + "さん、こんにちわ！"
                }

                R.id.btClear -> {
                    input.setText("")
                    outout.text = ""
                }
            }

        }
    }
}
