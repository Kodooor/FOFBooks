package com.example.omaogt.sofitarran;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainAccueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("debug", "MainAccueil.onCreate");
        setContentView(R.layout.main_acceuil);
    }

//    public void ActionsParams(View view) {
//
//    }
    public void ActionStart(View view) {
        startActivity(new Intent(MainAccueil.this, Accueil.class));
    }
    public void ActionCredits(View view) {
        startActivity(new Intent(MainAccueil.this, Pop.class));
    }
}


