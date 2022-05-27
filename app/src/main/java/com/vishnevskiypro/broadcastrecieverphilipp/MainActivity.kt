package com.vishnevskiypro.broadcastrecieverphilipp

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var reciever: AirplaneModeChangedReciever


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reciever = AirplaneModeChangedReciever()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(reciever, it)
        }
    }


    override fun onStop() {
        super.onStop()
        unregisterReceiver(reciever)
    }
}