package com.example.omaogt.sofitarran;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by omaogt on 01/03/2018.
 */

public class AccueilOma extends AppCompatActivity {
    Button alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueiloma);


        alert = (Button) findViewById(R.id.jouer);
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(AccueilOma.this);

                builder.setTitle("ERROR");
                builder.setMessage("Avez-vous plus de 18ans ?? ");
                builder.setCancelable(false);

                builder.setPositiveButton("oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "BIENVENUE DANS LA PURGE", Toast.LENGTH_LONG).show();

                        lancerJeu();

                    }
                });

                builder.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Désolée vous etes trop jeune pour jouer à ça... Regardez les autres jeux! ", Toast.LENGTH_LONG).show();

                        dialogInterface.cancel();
                        retourAccueil();
                    }
                });


                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });


    }

    public void lancerJeu(){
        Intent intent = new Intent(AccueilOma.this, JeuOma.class);
        startActivity(intent);
    }

    public void retourAccueil(){
        Intent intent = new Intent(AccueilOma.this, Accueil.class);
        startActivity(intent);
    }

    }






