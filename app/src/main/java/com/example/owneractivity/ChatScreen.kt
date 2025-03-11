package com.example.owneractivity

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.collectLatest

/*@Composable
fun ChatScreen(role: String, chatViewModel: ChatViewModel, onSendMessage: (String) -> Unit) {
    var message by remember { mutableStateOf("") }
    val messages by chatViewModel.messages.collectAsState()

    Column(modifier = Modifier.padding(16.dp)) {
        Text("$role - Chat", style = MaterialTheme.typography.headlineSmall)
        LazyColumn(modifier = Modifier.weight(1f)) {
            items(messages) { msg ->
                Text(msg, modifier = Modifier.padding(4.dp))
            }
        }
        Row {
            TextField(value = message, onValueChange = { message = it })
            Button(onClick = {
                if (message.isNotEmpty()) {
                    onSendMessage(message)
                    chatViewModel.sendMessage("$role: $message")
                    message = ""
                }
            }) {
                Text("Enviar")
            }
        }
    }
}*/

@Composable
fun ChatScreen(role: String, chatViewModel: ChatViewModel, onSendMessage: (String) -> Unit) {
    var message by remember { mutableStateOf("") }
    val messages by chatViewModel.messages.collectAsState()

    Column(modifier = Modifier.padding(16.dp)) {
        Text("$role - Chat", style = MaterialTheme.typography.headlineSmall)
        LazyColumn(modifier = Modifier.weight(1f)) {
            items(messages) { msg ->
                Text(msg, modifier = Modifier.padding(4.dp))
            }
        }
        Row {
            TextField(value = message, onValueChange = { message = it })
            Button(onClick = {
                if (message.isNotEmpty()) {
                    onSendMessage(message)
                    message = ""
                }
            }) {
                Text("Enviar")
            }
        }
    }
}

