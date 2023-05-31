package com.example.photoframeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var currentimage = 0

    lateinit var image : ImageView
    //0 1 2 3 -> 0 1 2 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val prev=findViewById<ImageButton>(R.id.imgPrevious)
        val nex=findViewById<ImageButton>(R.id.imgNext)

        prev.setOnClickListener {

            val idOfCurrentImageString= "img$currentimage"
            //convert string id into integer address associated with it
            val idCurrentImageInt=this.resources.getIdentifier(idOfCurrentImageString,"id",packageName)

            image = findViewById(idCurrentImageInt)
            image.alpha=0f


            currentimage = (4 + currentimage -1)%4
            val idImageToShowString= "img$currentimage"
            //convert string id into integer address associated with it
            val idImageYoShowInt=this.resources.getIdentifier(idImageToShowString,"id",packageName)

            image =findViewById(idImageYoShowInt)
            image.alpha= 1f

        }

    }
}