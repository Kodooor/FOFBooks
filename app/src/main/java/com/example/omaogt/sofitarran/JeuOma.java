package com.example.omaogt.sofitarran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by omaogt on 01/03/2018.
 */

public class JeuOma extends AppCompatActivity {

    Integer cpt = 0;

    //ici le String tex qui est récupérer de la bd
    private BD bd;

    TextView txt;
    String Titreselect;
    String Histoire;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeuoma1);

        bd = new BD(this);

        Intent intent = getIntent();
        Titreselect = intent.getStringExtra("Titreselect");
        Button prems = (Button) findViewById(R.id.button);


        txt = (TextView) findViewById(R.id.begin);


        final ArrayList<String> liste = this.bd.getHistoireById(Titreselect);
        Histoire = liste.get(5);
        Log.d("histoire", Histoire);


        prems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txt.setText(Histoire);
                txt.startAnimation(AnimationUtils.loadAnimation(JeuOma.this, android.R.anim.slide_in_left));

            }
        });


    }

    public void retourAccueil(View v){
        Intent intent = new Intent(JeuOma.this, TestStory.class);
        startActivity(intent);
    }

    //public void lancerTheEND() {
     //   Intent intent = new Intent(TheEND.this, JeuOma.class);
     //   startActivity(intent);
    //}
}

// faire un findById et un set text qui va chercher en fonction de la page actuelle celle page +1 ou -1 pour afficher le texte.
//tx3.setMovementMethod(new ScrollingMovementMethod());