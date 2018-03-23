package com.example.omaogt.sofitarran;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView.OnItemSelectedListener;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by filleul on 15/03/18.
 */

public class Reglages extends AppCompatActivity{
    String langue_choisie;
    Locale myLocale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reglages);
        Spinner spinner = (Spinner) findViewById(R.id.langchoose);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.language_choose, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
                                              public void onItemSelected(AdapterView<?> parent, View view,int pos, long id) {
                                                  if (pos == 1) {
                                                      Toast.makeText(parent.getContext(),
                                                              "Vous avez choisis le Français", Toast.LENGTH_SHORT)
                                                              .show();
                                                      setLocale("fr");
                                                  } else if (pos == 2) {

                                                      Toast.makeText(parent.getContext(),
                                                              "You have selected English", Toast.LENGTH_SHORT)
                                                              .show();
                                                      setLocale("en");
                                                  }
                                              }

                                              public void onNothingSelected(AdapterView<?> arg0) {
                                                  // TODO Auto-generated method stub
                                              }
                                          }


        );

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int heigth = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(heigth*.6));

    }

    public void setLocale(String lang) {
        myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, MainAccueil.class);
        startActivity(refresh);
    }

}
