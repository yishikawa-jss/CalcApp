package jp.techacademy.yuya.ishikawa.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    var result :Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)
        val value3 = intent.getStringExtra("VALUE3")



        when (value3) {
            "add" -> {
                this.result = value1 + value2
            }
            "min" -> {
                this.result = value1 - value2
            }
            "mul" -> {
                this.result = value1 * value2
            }
            "div" -> {
                this.result = value1 / value2
            }
        }

        textView1.text = "答えは" + "${Regex(".0+\$").replace(this.result.toString(), "")}" + "です。"


    }
}