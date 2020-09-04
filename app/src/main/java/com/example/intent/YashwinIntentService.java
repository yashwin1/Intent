package com.example.intent;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class YashwinIntentService extends IntentService{

    private static final String TAG = "com.example.intent";

    public YashwinIntentService (){
        super("YashwinIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
//      This is what this service does
        Log.i(TAG, "The service has now started");
    }
}
