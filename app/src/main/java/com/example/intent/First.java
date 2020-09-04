package com.example.intent;

import android.app.IntentService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
//        FOR INTENT SERVICE
//        Intent intent = new Intent(this, YashwinIntentService.class);
//        startService(intent);


//        FOR SERVICE CLASS
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void onClick(View view){
        Intent i = new Intent(this, Second.class);

        final EditText firstInput = (EditText) findViewById(R.id.firstInput);
        String userMessage = firstInput.getText().toString();
        i.putExtra("firstMessage", userMessage);

        startActivity(i);
    }
}
