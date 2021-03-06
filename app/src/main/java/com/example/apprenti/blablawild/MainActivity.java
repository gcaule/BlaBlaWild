package com.example.apprenti.blablawild;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button demarrage = findViewById(R.id.button2);
        demarrage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recherche = new Intent(MainActivity.this, SearchItinaryActivity.class);
                startActivity(recherche);
            }
        });

        Button soumettre = findViewById(R.id.button3);
        soumettre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proposer = new Intent(MainActivity.this, SubmitItineraryActivity.class);
                startActivity(proposer);
            }
        });

    }
}