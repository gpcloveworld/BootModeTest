package com.gpc.bootmodetest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootCompletedReceiver  extends BroadcastReceiver {
    private static final String TAG = "----BootCompletedReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        Log.d(TAG, "onReceive: "+action);
        if (action.equals(Intent.ACTION_BOOT_COMPLETED)) {
            Intent newIntent = new Intent(context, MainActivity.class);
            newIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(newIntent);
        }
    }
}
