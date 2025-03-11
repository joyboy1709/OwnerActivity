package com.example.owneractivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider

class CaretakerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       /* val chatViewModel = ViewModelProvider(this).get(ChatViewModel::class.java)

        setContent {
            ChatScreen("Cuidador", chatViewModel) { message ->
                sendMessageToOwner(message)
            }
        }
    */
        val chatViewModel = (application as ChatApp).chatViewModel

        setContent {
            ChatScreen("Cuidador", chatViewModel) { message ->
                chatViewModel.sendMessage("Cuidador: $message")
            }
        }
    }

    private fun sendMessageToOwner(message: String) {
        val intent = Intent(this, OwnerActivity::class.java).apply {
            putExtra("MESSAGE", message)
        }
        startActivity(intent)
    }
}