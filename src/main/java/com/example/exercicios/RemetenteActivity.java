package com.example.exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RemetenteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remetente);
    }

    public void onClick(View view) {

        //Referencing text field and button, from xml file
        TextView textView = findViewById(R.id.editText01);
        Button button = findViewById(R.id.button01);

        //Creating an implicit intent to send email
        Intent intent = new Intent();
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, textView.getText().toString());
        intent.setAction(Intent.ACTION_SEND);

        //initializing the intent
        startActivity(intent);
    }
}