package com.example.owneractivity

import android.app.Application

class ChatApp : Application() {
    val chatViewModel by lazy { ChatViewModel(this) }
}