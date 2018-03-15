package com.example.omaogt.sofitarran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by omaogt on 01/03/2018.
 */

public class JeuOma extends AppCompatActivity  {

    Integer cpt=0;

    //ici le String tex qui est récupérer de la bd

    TextView txt ;
    String tex="En 2022, les États-Unis renaissent, gouvernés par les Nouveaux Pères Fondateurs. " +
            "Pour maintenir un faible taux de chômage et de criminalité tout au long de l'année, le gouvernement a mis en place une période annuelle de douze heures, au cours de laquelle toute activité criminelle est permise. " +
            "Au cours de cette nuit, officiellement appelée « la Purge », chacun peut évacuer ses émotions négatives en réglant ses comptes, ou plus simplement en s'adonnant à la violence gratuite. " +
            "Les seules règles s'appliquant à la Purge sont l'interdiction d'attaquer tout membre du gouvernement ayant un niveau d’autorisation supérieur à 10 et la prohibition des armes de classe cinq ou de niveau supérieur (matériel explosif tel que les grenades ou les lance-roquettes). " +
            "Les contrevenants sont exécutés publiquement par pendaison."
    ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeuoma1);
        Button prems=(Button) findViewById(R.id.button);
        txt= (TextView) findViewById(R.id.begin);

        prems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txt.setText(tex);
                txt.startAnimation(AnimationUtils.loadAnimation(JeuOma.this, android.R.anim.slide_in_left));

            }
        });


}

    public void pageSuivante(View v){
        // max de page de l'histoire stoper if (cpt>=)
        cpt++;
        //afficher en fonction du compteur le text avec la bd
        String tex1="James Sandin, un riche entrepreneur, a parfaitement tiré parti de la situation en développant des systèmes de sécurité domestiques en prévision de la Purge. Père de deux enfants, habitant un quartier huppé et tranquille, il considère la Purge comme un mal nécessaire, à la différence de sa femme Mary et de son fils Charlie, beaucoup plus réservés à ce sujet. " +
                "Sa fille Zoey aimerait pouvoir vivre son amour pour Henry, un jeune homme plus âgé qu'elle, que son père lui interdit formellement de voir. Mais alors que la journée s'achève, les préparatifs pour la Purge s'accélèrent. " +
                "Certains voisins fourbissent leurs armes, d'autres se barricadent, les derniers semblent se préparer à une fête.";
        //setContentView(R.layout.jeuoma1);
        txt= (TextView) findViewById(R.id.begin);
        txt.setText(tex1);
        txt.startAnimation(AnimationUtils.loadAnimation(JeuOma.this, android.R.anim.slide_in_left));

            }



    public void pagePrecedante(View v){
        if (cpt==0){
            Toast.makeText(getApplicationContext(),"Désolé vous etes à la premiere page.", Toast.LENGTH_LONG).show();
        }
        else {
            cpt -= 1;

            // récupérer le text du cpt actuelle via la bd
            //setContentView(R.layout.jeuoma1);
            String tex2="salut toi";
            txt= (TextView) findViewById(R.id.begin);
            txt.setText(tex2);
            txt.startAnimation(AnimationUtils.loadAnimation(JeuOma.this, android.R.anim.slide_in_left));

                }


        }

    }

// faire un findById et un set text qui va chercher en fonction de la page actuelle celle page +1 ou -1 pour afficher le texte.
//tx3.setMovementMethod(new ScrollingMovementMethod());