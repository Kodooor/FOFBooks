package com.example.omaogt.sofitarran;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by omaogt on 01/03/2018.
 */

public class AccueilOma extends AppCompatActivity {
    Button alert;
    private BD bd;

    TextView titre ;
    TextView annee ;
    TextView genre ;
    TextView auteur ;
    TextView resume ;
    String Titreselect;
    String tex="Année : 2022\n \n" +

            "Pays :  Etats Unis\n \n"+

            "Lieu : Grande Maison bourgeoise sur-protégé.\n \n"+

            "Situation du pays: En 2022, les États-Unis renaissent, gouvernés par les Nouveaux Pères Fondateurs. \n \n Pour maintenir un faible taux de chômage et de criminalité tout au long de l'année, le gouvernement a mis en place une période annuelle de douze heures, au cours de laquelle toute activité criminelle est permise. \n \n Au cours de cette nuit, officiellement appelée « la Purge », chacun peut évacuer ses émotions négatives en réglant ses comptes, ou plus simplement en s'adonnant à la violence gratuite.\n \n"+
            "Règles : Les seules règles sont l'interdiction d'attaquer tout membre du gouvernement ayant un niveau d’autorisation supérieur à 10 et la prohibition des armes de classe cinq ou de niveau supérieur (matériel explosif tel que les grenades ou les lance-roquettes). \n \n Les contrevenants sont exécutés publiquement par pendaison. \n ";

    ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueiloma);
        bd = new BD(this);

        Intent intent = getIntent();
        Titreselect = intent.getStringExtra("Titreselect");
        final ArrayList<String> liste = this.bd.getHistoireById(Titreselect);


        titre= (TextView) findViewById(R.id.titre);
        titre.setText(liste.get(3));

        annee= (TextView) findViewById(R.id.annee);
        annee.setText(liste.get(0));

        genre= (TextView) findViewById(R.id.genre);
        genre.setText(liste.get(2));

        auteur= (TextView) findViewById(R.id.auteur);
        auteur.setText(liste.get(1));

        resume= (TextView) findViewById(R.id.resume);
        resume.setText(liste.get(4));

        //txt.startAnimation(AnimationUtils.loadAnimation(AccueilOma.this, android.R.anim.slide_in_left));





        //txt.startAnimation(AnimationUtils.loadAnimation(AccueilOma.this, android.R.anim.slide_in_left));










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
                        annuler();
                    }
                });


                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });


    }

    public void lancerJeu(){
        Intent intent = new Intent(AccueilOma.this, JeuOma.class);
        intent.putExtra("Titreselect", Titreselect);
        startActivity(intent);
    }

    public void annuler(){
        Intent intent = new Intent(AccueilOma.this, TestStory.class);
        startActivity(intent);
    }
    public void retourAccueil(View v){
        Intent intent = new Intent(AccueilOma.this, TestStory.class);
        startActivity(intent);
    }

    }






