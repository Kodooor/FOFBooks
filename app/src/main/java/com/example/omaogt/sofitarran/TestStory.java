package com.example.omaogt.sofitarran;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by filleul on 15/03/18.
 */

public class TestStory extends AppCompatActivity {
    private BD bd;
    private SQLiteDatabase db;                              // Base de données
    private Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storytest);

        bd = new BD(this);
        cursor = bd.getCursor();
        final ArrayList<String> liste = this.bd.getNomAllHistoire();

        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, liste);
        ListView lv0 = (ListView) findViewById(R.id.listviewbis);
        lv0.setAdapter(ad);

        lv0.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedStory = liste.get(i);
                LancerDescHistoire(selectedStory);

            }
        });
    }
    public void LancerDescHistoire(String selectedStory) {
        Log.d("test", "lancement activité 2");
        Intent intent = new Intent(this, AccueilOma.class);
        intent.putExtra("Titreselect", selectedStory);
        startActivity(intent);

    }
    public void RetourMainAccueil(View v){
        Intent intent = new Intent(TestStory.this, MainAccueil.class);
        startActivity(intent);
    }



}
