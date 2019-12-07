package com.nat.image_steps

import kotlinx.android.synthetic.main.activity_main.*


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageSteps.setSteps(R.drawable.signin,R.drawable.debitcard,R.drawable.receive, R.drawable.icon)
//        imageSteps.setSteps(R.drawable.signin,R.drawable.clipboard,R.drawable.debitcard,R.drawable.receive)
//        imageSteps.setSteps(R.drawable.ic_leaf,R.drawable.icon_users,R.drawable.ic_check,R.drawable.ic_check)


        //Duracion de la animacion y escala de icono
        imageSteps.scaleUp = 5.5f
        imageSteps.animationDuration = 500


        previous.setOnClickListener { imageSteps.previous() }
        next.setOnClickListener { imageSteps.next() }



    }
}
