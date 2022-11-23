package com.example.exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void onClick03(View view) {

        //Referencing text field and button, from xml file
        TextView textView = findViewById(R.id.editText03);
        Button button = findViewById(R.id.button04);

        //Creating an implicit intent to send email
        Intent intent = new Intent();
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, textView.getText().toString());
        intent.setAction(Intent.ACTION_SEND);

        //initializing the intent
        startActivity(intent);
    }

    //All lifecycle methods of an Android activity
    //in each method I'm declaring an Activity state variable that receives an xml textView, keeping the current state of the activity in it and displaying it on the screen

    @Override
    protected void onStart() {
        super.onStart();
        final TextView estadoActivity = (TextView) findViewById(R.id.editTextTextPersonName);
        String text = estadoActivity.getText().toString();
        estadoActivity.setText(text + "    " + "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        final TextView estadoActivity = (TextView) findViewById(R.id.editTextTextPersonName);
        String text = estadoActivity.getText().toString();
        estadoActivity.setText(text + "    " + "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        final TextView estadoActivity = (TextView) findViewById(R.id.editTextTextPersonName);
        String text = estadoActivity.getText().toString();
        estadoActivity.setText(text + "    " + "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        final TextView estadoActivity = (TextView) findViewById(R.id.editTextTextPersonName);
        String text = estadoActivity.getText().toString();
        estadoActivity.setText(text + "    " + "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        final TextView estadoActivity = (TextView) findViewById(R.id.editTextTextPersonName);
        String text = estadoActivity.getText().toString();
        estadoActivity.setText(text + "    " + "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        final TextView estadoActivity = (TextView) findViewById(R.id.editTextTextPersonName);
        String text = estadoActivity.getText().toString();
        estadoActivity.setText(text + "    " + "onDestroy");
    }
}