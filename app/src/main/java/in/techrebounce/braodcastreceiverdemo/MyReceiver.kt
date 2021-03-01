package `in`.techrebounce.braodcastreceiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    
    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val boolean = intent.getBooleanExtra("state", false)
        Toast.makeText(context, boolean.toString(), Toast.LENGTH_LONG).show()


    }
}