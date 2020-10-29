package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecievedMessageActivity extends AppCompatActivity {

    private TextView recieved_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_message);
        recieved_message = findViewById(R.id.textViewRecievedMessage);
        Intent intent2 = getIntent();
        String show_message = intent2.getStringExtra("message");
        recieved_message.setText(show_message);
    }
}