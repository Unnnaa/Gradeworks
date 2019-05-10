package com.example.grade

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // var java = 0
    // var network = 0
    // var database = 0
    // var total = 0
    // var ave = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //  java = editTextJava.text.toString().toInt()
        //  network = editTextNetwork.text.toString().toInt()
        //  database = editTextDatabase.text.toString().toInt()

        //   buttonTotal.setOnClickListener {
        //        total = java + network + database
        //        editTextTotal.setText(total)
        //    }
        //    buttonAve.setOnClickListener {
        //        ave = total /3
        //        editTextAve.setText(ave)
        //       if (ave >=90){
        //       ggrade.text = "A"
        //        }
        //     }


        var total = 0
        var ave: Int


        var java = editTextJava.text.toString().toInt()
        var net = editTextNetwork.text.toString().toInt()
        var database = editTextDatabase.text.toString().toInt()


        buttonTotal.setOnClickListener {
            total = java + net + database
            editTextTotal.setText(total)
        }

        buttonAve.setOnClickListener {
            ave = total / 3
            editTextAve.setText(ave)
            if (ave >= 90) {
                ggrade.text = "A"
            } else if (ave >= 80){
                ggrade.text = "B"
            }
            else if (ave >= 70){
                ggrade.text = "C"
            }
            else if (ave >=60){
                ggrade.text = "D"
            }
            else {
                ggrade.text = "F"

            }

        }
    }
}
