package com.example.toastingandroidchris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var displayinfo:TextView
    private lateinit var editdata:EditText
    private lateinit var btn_submit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        displayinfo = findViewById(R.id.edttextview)
        editdata = findViewById(R.id.edtname)
        btn_submit = findViewById(R.id.edtbutton)

        //Toast.makeText(this, "chrisssss", Toast.LENGTH_SHORT).show()
        var userinput = editdata.toString().trim()
        //Toast.makeText(this,userinput,Toast.LENGTH_SHORT).show()
        displayinfo.text = userinput.toString()
    }

