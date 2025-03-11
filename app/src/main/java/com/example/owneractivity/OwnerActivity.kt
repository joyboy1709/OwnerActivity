package com.example.owneractivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider

class OwnerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val chatViewModel = (application as ChatApp).chatViewModel

        setContent {
            ChatScreen("Propietario", chatViewModel) { message ->
                chatViewModel.sendMessage("Propietario: $message")
            }
        }
    }

    private fun sendMessageToCaretaker(message: String) {
        val intent = Intent(this, CaretakerActivity::class.java).apply {
            putExtra("MESSAGE", message)
        }
        startActivity(intent)
    }
}
