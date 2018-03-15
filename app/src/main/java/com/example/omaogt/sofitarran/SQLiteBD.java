package com.example.omaogt.sofitarran;

/**
 * Created by fittipaldi on 14/03/18.
 */


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.CursorAdapter;
import android.widget.SimpleCursorAdapter;
import android.database.Cursor;
import java.util.List;
import android.util.Log;


public class SQLiteBD extends Activity
{
    private BD bd;

    private Cursor cursor;
    private SimpleCursorAdapter sca;

    private EditText et0;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basededonnees);

        // Création/Ouverture de la base de données.
        bd = new BD(this);

        et0 = (EditText)findViewById(R.id.editText);

        ListView lv0 = ( ListView )findViewById( R.id.listview );

        cursor = bd.getCursor();

        String[] columns = {"value"};

//        int[] views = {R.id.};

//        sca = new SimpleCursorAdapter(this,
//                R.layout.simple_list_item_1,
//                cursor,
//                new String[] {"value"},
//                new int[] { R.id.view },
//                CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER
//        );
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,this.bd.getValues());

        lv0.setAdapter( ad );
    }

    public void insertIntoDB( View v )
    {
        // Insertion dans la base de données.
//        if( et0.getText().length() != 0 )
//        {
            bd.insertValue("1999", "soso","horreur","film horreur","ceci est un film horrifiant" );
//            cursor.requery();
//            sca.notifyDataSetChanged();
//        }
        Log.d("BD_TEST", "insert");
    }

}
