package com.example.loroco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //Get intent and string from previous activity
        Intent intent = getIntent();
        String message = "Hi " + intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //Set string as text view
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
