package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle firstData = getIntent().getExtras();     //For getting extra information
        if(firstData == null){
            return;                 //So that if no text is passed then the text does not change
        }
        String firstMessage = firstData.getString("firstMessage");
        final TextView secondText = (TextView) findViewById(R.id.secondText);
        secondText.setText(firstMessage);
    }

    public void onClick(View view){
        Intent i = new Intent(this, First.class);
        startActivity(i);
    }
}
