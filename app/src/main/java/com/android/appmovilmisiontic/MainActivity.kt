package com.android.appmovilmisiontic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.appmovilmisiontic.R
import com.android.appmovilmisiontic.activities.InicioSesionActivity
import com.android.appmovilmisiontic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIngresoApp.setOnClickListener { irPantallaIngreso() }
    }

    fun irPantallaIngreso() {
        startActivity( Intent(this, InicioSesionActivity::class.java) )
    }
}