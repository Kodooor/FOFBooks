package com.example.omaogt.sofitarran;

/**
 * Created by fittipaldi on 14/03/18.
 */
import android.app.Activity;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import android.widget.SimpleCursorAdapter;
import android.content.Context;
import android.content.ContentValues;
import android.util.Log;
import java.util.List;
import java.util.ArrayList;


public class BD extends SQLiteOpenHelper {

//    private static final String DB_PATH = "/"
    private static final String DB_NAME = "DB";             // Nom de la base.
    private static final String DB_TABLE_NAME = "Histoires";  // Nom de la table.

    private SQLiteDatabase db;                              // Base de données

    private Context context;

    BD(Context context) {
        // Appel au constructeur qui s'occupe de créer ou ouvrir la base.
        super(context, DB_NAME, null, 2);
        this.context = context;
        // Récupération de la base de données.
        db = getWritableDatabase();
    }

    /**
     * Méthode appelée si la base n'existe pas.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + DB_TABLE_NAME+ " (_id integer primary key autoincrement, annee text, auteur text, genre text, titre text, resume text, histoire text );");
    }

    /**
     * Méthode pour passer d'une version de SQLite à une nouvelle version.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {

    }

    /**
     * Insertion d'une chaîne dans la table.
     */
    public void insertValue( String annee, String auteur, String genre, String titre, String resume, String histoire) {
        // La chaîne n'est pas directement ajoutée dans la base.
        // Il faut passer par la création d'une structure intermédiaire ContenValues.
        ContentValues content = new ContentValues();
        // Insertion de la chaîne dans l'instance de ContentValues
        content.put("annee", annee);
        content.put("auteur", auteur);
        content.put("genre", genre);
        content.put("titre", titre);
        content.put("resume", resume);
        content.put("histoire", histoire);




        // Insertion dans la base de l'instance de ContentValues contenant la chapine.
        db.insert(DB_TABLE_NAME, null, content);
    }

    /**
     * Récupération des chaînes de la table.
     */
    public List<String> getValues() {
        List<String> list = new ArrayList<String>();
        String[] columns = {"annee","auteur","genre","titre","resume","histoire"};
        // Exécution de la requête pour obtenir les chaînes et récupération d'un curseur sur ces données.
        Cursor cursor = db.query(DB_TABLE_NAME, columns, null, null, null, null, null);
        // Curseur placé en début des chaînes récupérées.
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            // Récupération d'une chaîne et insertion dans une liste.
            list.add(cursor.getString(0));
            list.add(cursor.getString(1));
            list.add(cursor.getString(2));
            list.add(cursor.getString(3));
            list.add(cursor.getString(4));
            list.add(cursor.getString(5));
            // Passage à l'entrée suivante.
            cursor.moveToNext();
        }
        // Fermeture du curseur.
        cursor.close();

        return list;
    }
    public void deleteDB(){
        db.delete(DB_TABLE_NAME, null, null);
    }

    public Cursor getCursor()
    {
        String[] columns = {"annee","auteur","genre","titre","resume","histoire"};

        Cursor cursor = db.query(DB_TABLE_NAME, columns, null, null, null, null, null);
        //cursor.moveToFirst();

        Log.d("SQLiteDemo", "cursor " + cursor);

        return cursor;
    }

//    public SimpleCursorAdapter getAdapter()
//    {String annee, String auteur, String genre, String titre, String resume
//        String[] columns = {"value"};
//        int[] views = { R.id.text1 };
//        Cursor cursor = db.query(DB_TABLE_NAME, columns, null, null, null, null, null);
//        //cursor.moveToFirst();
//
//        return new SimpleCursorAdapter(context,
//                R.layout.simple_list_item_1,
//                cursor,
//                columns,
//                views);

//    }

    public List<String> getHistoireById(String titre) {
        List<String> list = new ArrayList<String>();
        String[] columns = {"annee","auteur","genre","titre","resume","histoire"};
        if (db == null) {
            return null;
        }
        ContentValues row = new ContentValues();
        Cursor cur = db.rawQuery("select * from Histoires where titre=?", new String[] { String.valueOf(titre) });
        if (cur.moveToNext()) {
            list.add(cur.getString(0));
            list.add(cur.getString(1));
            list.add(cur.getString(2));
            list.add(cur.getString(3));
            list.add(cur.getString(4));
            list.add(cur.getString(5));
        }
        cur.close();
        db.close();
        return list;
    }

}