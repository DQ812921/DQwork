package com.example.myapplication9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
      String s=intent.getAction();
        Log.i("接受","成功");
        Log.i(s,intent.getStringExtra("name"));


    }
}
