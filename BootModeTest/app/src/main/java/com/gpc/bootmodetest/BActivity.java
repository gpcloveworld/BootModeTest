package com.gpc.bootmodetest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class BActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "----BActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.d(TAG, "onCreate: ");
        findViewById(R.id.b1).setOnClickListener(this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.b1 :
                ActionUtils.toActivity(BActivity.this,CActivity.class);
                break;
            default:
                break;
        }
    }
}
