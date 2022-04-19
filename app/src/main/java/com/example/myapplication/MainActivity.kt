package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var value1 = 0.0
    var value2 = 0.0
    var operation = ""
    var DoubleValue: Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var monitor : TextView = findViewById(R.id.monitor)
        monitor.text = "0"
    }

    fun but1OnClick(view: View) {
        var but1 = 1.0
        push(but1)
    }

    fun but2OnClick(view: View) {
        var but1 = 2.0
        push(but1)
    }

    fun but3OnClick(view: View) {
        var but1 = 3.0
        push(but1)
    }

    fun but4OnClick(view: View) {
        var but1 = 4.0
        push(but1)
    }

    fun but5OnClick(view: View) {
        var but1 = 5.0
        push(but1)
    }

    fun but6OnClick(view: View) {
        var but1 = 6.0
        push(but1)
    }

    fun but7OnClick(view: View) {
        var but1 = 7.0
        push(but1)
    }

    fun but8OnClick(view: View) {
        var but1 = 8.0
        push(but1)
    }

    fun but9OnClick(view: View) {
        var but1 = 9.0
        push(but1)
    }

    fun but0OnClick(view: View) {
        var but1 = 0.0
        push(but1)
    }

    private fun push(int: Double) {
        var monitor : TextView = findViewById(R.id.monitor)
        if (value1==0.0){
            value1 = int
        }else{
            value1 = (value1*10)+int
        }
        monitor.text = value1.toInt().toString()
    }

    fun butPluseOnClick(view: View) {
        var oper = "+"
        operation(oper)
    }

    fun butMinusOnClick(view: View) {
        var oper = "-"
        operation(oper)
    }

    fun butUmnojOnClick(view: View) {
        var oper = "*"
        operation(oper)
    }

    fun butDelitOnClick(view: View) {
        var oper = "/"
        operation(oper)
    }

    fun operation(oper: String){
        if(operation=="") {
            value2 = value1
            value1 = 0.0
            operation = oper
        }
        else {
            operation = oper
        }
    }

    fun butRavnoOnClick(view: View){

        var monitor : TextView = findViewById(R.id.monitor)
        when(operation){
            "+" -> {
                value2 += value1
                DoubleValue = value2
                monitorBy(DoubleValue)
            }
            "-" -> {
                value2 -= value1
                DoubleValue = value2
                monitorBy(DoubleValue)
            }
            "/" -> {
                value2 /= value1
                DoubleValue = value2
                monitorBy(DoubleValue)
            }
            "*" -> {
                value2 *= value1
                DoubleValue = value2
                monitorBy(DoubleValue)
            }
        }

        value1 = value2
        operation = ""
    }

    private fun monitorBy(DoubleValue: Double) {
        var monitor : TextView = findViewById(R.id.monitor)
        var checkForDouble : String = DoubleValue.toString()
        if(checkForDouble[checkForDouble.length-1].equals("0")) {
            monitor.text = DoubleValue.toInt().toString()
        }
        else{
            monitor.text = DoubleValue.toString()
        }
    }

    fun butCOnClick(view: View){
        var monitor : TextView = findViewById(R.id.monitor)
        value1 = 0.0
        value2 = 0.0
        operation = ""
        monitor.text = value1.toString()
    }

    fun butClearOnClick(view: View){
        var monitor : TextView = findViewById(R.id.monitor)
        var clearBut : String = value1.toString()
        if (clearBut.length>1){
            value1.toString().substring(0,value1.toString().length - 1)
            value1 = clearBut.toDouble()
        }
        else{
            value1 = 0.0
        }
        monitor.text = value1.toString()
    }

}