package com.example.exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SendEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);
    }

    public void onClick02(View view) {

        //Referencing text field and button, from xml file
        TextView textView = findViewById(R.id.editText02);
        Button button = findViewById(R.id.button02);

        //Creating an implicit intent to send email
        Intent intent = new Intent();
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_TEXT, textView.getText().toString());
        intent.setAction(Intent.ACTION_SEND);

        //a chooser was used so that the user always chooses which app to use
        Intent SendIntent = Intent.createChooser(intent, "Compartilhar");
        startActivity(SendIntent);
    }
}