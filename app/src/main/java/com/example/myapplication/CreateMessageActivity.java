package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextMessage);
    }

    public void SendMessage(View view) {
        String message= editText.getText().toString();
        Intent intent1 = new Intent (Intent.ACTION_SEND);
        intent1.setType("text/plain");
        intent1.putExtra(Intent.EXTRA_TEXT,message);
        Intent choosen_intent = Intent.createChooser(intent1, getString(R.string.chooser_title));
        startActivity(choosen_intent);

    }
}