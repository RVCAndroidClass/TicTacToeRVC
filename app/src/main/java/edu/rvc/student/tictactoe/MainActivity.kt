package edu.rvc.student.tictactoe

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.timerTask


class MainActivity : AppCompatActivity() {

   private val homeicons = intArrayOf(R.drawable.x,R.drawable.o)

    var b1:ImageButton?=null
    var b2:ImageButton?=null
    var b3:ImageButton?=null
    var b4:ImageButton?=null
    var b5:ImageButton?=null
    var b6:ImageButton?=null
    var b7:ImageButton?=null
    var b8:ImageButton?=null
    var b9:ImageButton?=null

    var bx1 = 0.0
    var bx2 = 0.0
    var bx3 = 0.0
    var bx4 = 0.0
    var bx5 = 0.0
    var bx6 = 0.0
    var bx7 = 0.0
    var bx8 = 0.0
    var bx9 = 0.0


    val handler = Handler()
    var xtime = 1.0
    val timer = Timer()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1 = findViewById<ImageButton>(R.id.b1)
        b2 = findViewById<ImageButton>(R.id.b2)
        b3 = findViewById<ImageButton>(R.id.b3)
        b4 = findViewById<ImageButton>(R.id.b4)
        b5 = findViewById<ImageButton>(R.id.b5)
        b6 = findViewById<ImageButton>(R.id.b6)
        b7 = findViewById<ImageButton>(R.id.b7)
        b8 = findViewById<ImageButton>(R.id.b8)
        b9 = findViewById<ImageButton>(R.id.b9)
        var btnStart = findViewById<Button>(R.id.btnStart)

        btnStart.setOnClickListener(){
            b1?.setImageResource(0)
            b2?.setImageResource(0)
            b3?.setImageResource(0)
            b4?.setImageResource(0)
            b5?.setImageResource(0)
            b6?.setImageResource(0)
            b7?.setImageResource(0)
            b8?.setImageResource(0)
            b9?.setImageResource(0)
            timer.schedule(timerTask { showchoice() }, 3000)

        }
//
        b1?.setOnClickListener(){
            b1?.setImageResource(R.drawable.x)
            bx1 = 1.0
            showchoice()
        }
        b2?.setOnClickListener(){
            b2?.setImageResource(R.drawable.x)
            bx2 = 2.0
            showchoice()
        }

        b3?.setOnClickListener(){
            b3?.setImageResource(R.drawable.x)
            bx3 = 3.0
            showchoice()
        }

        b4?.setOnClickListener(){
            b4?.setImageResource(R.drawable.x)
            bx4 = 4.0
            showchoice()
        }

        b5?.setOnClickListener(){
            b5?.setImageResource(R.drawable.x)
            bx5 = 5.0
            showchoice()
        }

        b6?.setOnClickListener(){
            b6?.setImageResource(R.drawable.x)
            bx6 = 6.0
            showchoice()
        }

        b7?.setOnClickListener(){
            b7?.setImageResource(R.drawable.x)
            bx7 =7.0
            showchoice()
        }

        b8?.setOnClickListener(){
            b8?.setImageResource(R.drawable.x)
            bx8 = 8.0
            showchoice()
        }

        b9?.setOnClickListener(){
            b9?.setImageResource(R.drawable.x)
            bx9 = 9.0
            showchoice()
        }
       //handler.postDelayed(ShowXOrO,1500)

        //return view
    }

    internal var ShowXOrO:Runnable = Runnable {
        // your code to do after handler completes
        //b2?.setImageResource(R.drawable.o)
        xtime = Math.floor(Math.random() * 9.0 + 1.0)
        while (xtime == bx1 || xtime == bx2 || xtime == bx3 || xtime == bx4 || xtime == bx5 || xtime == bx6 || xtime == bx7 || xtime == bx8 || xtime == bx9) {
            xtime = Math.floor(Math.random() * 9.0 + 1.0)
        }
        if (xtime == 1.0) {
            bx1 = 1.0
            b1?.setImageResource(R.drawable.o)
        }
        if (xtime == 2.0) {
            bx2 = 2.0
            b2?.setImageResource(R.drawable.o)
        }
        if (xtime == 3.0) {
            bx3 = 3.0
            b3?.setImageResource(R.drawable.o)
        }
        if (xtime == 4.0) {
            bx4 = 4.0
            b4?.setImageResource(R.drawable.o)
        }
        if (xtime == 5.0) {
            bx5 = 5.0
            b5?.setImageResource(R.drawable.o)
        }
        if (xtime == 6.0) {
            bx6 = 6.0
            b6?.setImageResource(R.drawable.o)
        }
        if (xtime == 7.0) {
            bx7 = 7.0
            b7?.setImageResource(R.drawable.o)
        }
        if (xtime == 8.0) {
            bx8 = 8.0
            b8?.setImageResource(R.drawable.o)
        }
        if (xtime == 9.0) {
            bx9 = 9.0
            b9?.setImageResource(R.drawable.o)
        }
    }

    fun showchoice(){
        handler.postDelayed(ShowXOrO,1000)
        //timer.schedule(timerTask { showchoice() }, 3000)
    }

}
