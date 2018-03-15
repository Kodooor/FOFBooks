package com.example.omaogt.sofitarran;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

//
//        final Button oma = (Button) findViewById(R.id.o);
//        oma.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Accueil.this, AccueilOma.class);
//                startActivity(intent);
//            }
//        });
    }

    public void lancerActiviter(View view) {
        Intent intent = new Intent(this, MainAccueil.class);
        startActivity(intent);
    }

}


