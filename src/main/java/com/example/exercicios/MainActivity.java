package com.example.exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Creating an explicit intent for each activity
    public void AbrirActivity01(View view) {
        Intent intent = new Intent(this, RemetenteActivity.class);
        startActivity(intent);
    }

    public void AbrirActivity02(View view) {
        Intent intent = new Intent(this,SendEmail.class);
        startActivity(intent);
    }

    public void AbrirActivity03(View view) {
        Intent intent = new Intent(this,Principal.class);
        startActivity(intent);
    }
}