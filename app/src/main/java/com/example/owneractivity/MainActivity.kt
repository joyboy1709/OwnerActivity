package com.example.owneractivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.padding(16.dp)) {
                Button(onClick = {
                    startActivity(Intent(this@MainActivity, OwnerActivity::class.java))
                }) {
                    Text("Ingresar como Propietario")
                }
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = {
                    startActivity(Intent(this@MainActivity, CaretakerActivity::class.java))
                }) {
                    Text("Ingresar como Cuidador")
                }
            }
        }
    }
}