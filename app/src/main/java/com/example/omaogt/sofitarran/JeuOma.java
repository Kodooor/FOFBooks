package com.example.omaogt.sofitarran;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by omaogt on 01/03/2018.
 */

public class JeuOma extends AppCompatActivity  {

    TextView txt;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeuoma1);

        Button btn=(Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    txt = (TextView) findViewById(R.id.begin);
                    String tex="Année : 2022\n";
                    txt.setText(tex);
                    txt.startAnimation(AnimationUtils.loadAnimation(JeuOma.this, android.R.anim.slide_in_left));


                txt1 = (TextView) findViewById(R.id.begin1);
                    String tex1="Pays :  Etats Unis\n";
                    txt1.setText(tex1);
                    txt1.startAnimation(AnimationUtils.loadAnimation(JeuOma.this, android.R.anim.slide_in_left));



                txt2 = (TextView) findViewById(R.id.begin2);
                    String tex2="Lieu : Grande Maison bourgeoise sur-protégé.\n";
                    //String tex3="Profession du père :  Riche entrepreneur en développant des systèmes de sécurité domestiques\n"
                    txt2.setText(tex2);
                    txt2.startAnimation(AnimationUtils.loadAnimation(JeuOma.this, android.R.anim.slide_in_left));




                txt3 = (TextView) findViewById(R.id.begin3);
                    String tex4="Situation du pays: En 2022, les États-Unis renaissent, gouvernés par les Nouveaux Pères Fondateurs. \n Pour maintenir un faible taux de chômage et de criminalité tout au long de l'année, le gouvernement a mis en place une période annuelle de douze heures, au cours de laquelle toute activité criminelle est permise. \n Au cours de cette nuit, officiellement appelée « la Purge », chacun peut évacuer ses émotions négatives en réglant ses comptes, ou plus simplement en s'adonnant à la violence gratuite. ";
                    txt3.setText(tex4);
                    txt3.startAnimation(AnimationUtils.loadAnimation(JeuOma.this, android.R.anim.slide_in_left));


                    txt4 = (TextView) findViewById(R.id.begin4);
                    String tex5="Règles : Les seules règles sont l'interdiction d'attaquer tout membre du gouvernement ayant un niveau d’autorisation supérieur à 10 et la prohibition des armes de classe cinq ou de niveau supérieur (matériel explosif tel que les grenades ou les lance-roquettes). \n Les contrevenants sont exécutés publiquement par pendaison.";
                    txt4.setText(tex5);
                    txt4.startAnimation(AnimationUtils.loadAnimation(JeuOma.this, android.R.anim.slide_in_left));




            }
        });

        //txt.setMovementMethod(new ScrollingMovementMethod());
}

}
