package jp.techacademy.yuya.ishikawa.calcapp

import android.app.AlertDialog
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
                }
            } else {
                //計算へ
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