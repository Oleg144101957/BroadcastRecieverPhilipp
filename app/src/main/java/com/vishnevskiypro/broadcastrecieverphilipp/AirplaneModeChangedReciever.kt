package com.vishnevskiypro.broadcastrecieverphilipp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReciever: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeAreEnabled = intent?.getBooleanExtra("state", false) ?: return

        if (isAirplaneModeAreEnabled){
            Toast.makeText(context, "Mode enabled", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "Mode disable", Toast.LENGTH_LONG).show()
        }


    }
}