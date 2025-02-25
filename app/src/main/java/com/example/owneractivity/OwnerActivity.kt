package com.example.owneractivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider

class OwnerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val chatViewModel = ViewModelProvider(this).get(ChatViewModel::class.java)

        setContent {
            ChatScreen("Propietario", chatViewModel) { message ->
                sendMessageToCaretaker(message)
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
