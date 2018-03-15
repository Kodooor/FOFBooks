package com.example.omaogt.sofitarran;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,this.bd.getHistoireById("Men in black"));
        ListView lv0 = ( ListView )findViewById( R.id.listviewbis );
        lv0.setAdapter( ad );
    }

}
