package jp.techacademy.yuya.ishikawa.calcapp

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }
    override fun onClick(v: View) {

        if (editText1.text.toString() != "" && editText2.text.toString() != ""){
            if (v.id == R.id.button4) {
                if (editText2.text.toString().toDouble() == 0.0) {
                    AlertDialog.Builder(this)
                        .setTitle("ERROR！")
                        .setMessage("0で除算できません。")
                        .setPositiveButton("OK"){ dialog, which -> }
                        .show()
                } else {
                    //計算へ
                    val intent = Intent(this, MainActivity2::class.java)
                    intent.putExtra("VALUE1", editText1.text.toString().toDouble())
                    intent.putExtra("VALUE2", editText2.text.toString().toDouble())
                    intent.putExtra("VALUE3", "div")
                    startActivity(intent)
                }
            } else {
                //計算へ
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("VALUE1", editText1.text.toString().toDouble())
                intent.putExtra("VALUE2", editText2.text.toString().toDouble())

                when {
                    v.id == R.id.button1 -> {
                        intent.putExtra("VALUE3", "add")
                    }
                    v.id == R.id.button2 -> {
                        intent.putExtra("VALUE3", "min")
                    }
                    v.id == R.id.button3 -> {
                        intent.putExtra("VALUE3", "mul")
                    }
                }
                startActivity(intent)
            }
        } else {
            AlertDialog.Builder(this)
                .setTitle("ERROR！")
                .setMessage("数値を２つとも入力してください。")
                .setPositiveButton("OK"){ dialog, which -> }
                .show()
        }
    }




}