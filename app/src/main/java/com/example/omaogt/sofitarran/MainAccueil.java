package com.example.omaogt.sofitarran;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MainAccueil extends AppCompatActivity {
    public static BD bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_acceuil);
        //deleteDB(this);
        bd = new BD(this);
        bd.deleteDB();
        final ArrayList<String> liste = this.bd.getNomAllHistoire();
        insertIntoDB(this);
    }

    public void ActionStart(View view) {
        startActivity(new Intent(MainAccueil.this, TestStory.class));
    }
    public void ActionParams(View view) {
        startActivity(new Intent(MainAccueil.this, Reglages.class));
    }
    public void ActionCredits(View view) {
        startActivity(new Intent(MainAccueil.this, Pop.class));
    }
    public void insertIntoDB( MainAccueil v )
    {
        // Insertion dans la base de données.
//        if( et0.getText().length() != 0 )
//        {
        Resources res = getResources();
        String[] histoire1 = res.getStringArray(R.array.histoire1);
        String[] histoire2 = res.getStringArray(R.array.histoire2);
        String[] histoire3 = res.getStringArray(R.array.histoire3);
        String[] histoire4 = res.getStringArray(R.array.histoire4);
        String[] histoire5 = res.getStringArray(R.array.histoire5);
        String[] histoire6 = res.getStringArray(R.array.histoire6);
        String[] histoire7 = res.getStringArray(R.array.histoire7);
        String[] histoire8 = res.getStringArray(R.array.histoire8);
        bd.insertValue( histoire1[0],histoire1[1],histoire1[2],histoire1[3], histoire1[4],histoire1[5]);
        bd.insertValue( histoire2[0],histoire2[1],histoire2[2],histoire2[3], histoire2[4],histoire2[5]);
        bd.insertValue( histoire3[0],histoire3[1],histoire3[2],histoire3[3], histoire3[4],histoire3[5]);
        bd.insertValue( histoire4[0],histoire4[1],histoire4[2],histoire4[3], histoire4[4],histoire4[5]);
        bd.insertValue( histoire5[0],histoire5[1],histoire5[2],histoire5[3], histoire5[4],histoire5[5]);
        bd.insertValue( histoire6[0],histoire6[1],histoire6[2],histoire6[3], histoire6[4],histoire6[5]);
        bd.insertValue( histoire7[0],histoire7[1],histoire7[2],histoire7[3], histoire7[4],histoire7[5]);
        bd.insertValue( histoire8[0],histoire8[1],histoire8[2],histoire8[3], histoire8[4],histoire8[5]);

//            cursor.requery();
        //sca.notifyDataSetChanged();
//        }
    }
    public void deleteDB(MainAccueil v){
        bd.deleteDB();
        //sca.notifyDataSetChanged();

    }
}


