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
    private BD bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("debug", "MainAccueil.onCreate");
        setContentView(R.layout.main_acceuil);
        bd = new BD(this);
        insertIntoDB(this);
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
    public void insertIntoDB( MainAccueil v )
    {
        // Insertion dans la base de données.
//        if( et0.getText().length() != 0 )
//        {
        bd.insertValue( "2000","Sofiane","Horreur","La nuit des temps", "Ce film fait peur", " C'est l'histoire d'un vieil homme qui, parce que son fils ne peut pas s'en occuper en permanence, est obligé d'aller en maison de retraite.\n" +
                "- Ne me laisse pas ici à mourir à petit feu! dit le vieil homme à son fils.\n" +
                "-Papa, on en a parlé et reparlé: Il faut que tu ailles dans cette maison. Je te rendrais visite deux fois par semaine, et tu pourras toujours prendre le téléphone pour m'appeler.\n" +
                "Puis le fils s'en va et laisse son père dans sa chambre. Évidemment, dès le premier soir, le papa appelle son fils au téléphone:\n" +
                "- Tu dois venir me chercher. C'est terrible; je n'ai pas vu une seule infirmière, la bouffe est horrible, et je me sens tellement seul!\n" +
                "- Écoute papa, ça fait juste deux heures que je t'ai laissé là-bas! Comment peux-tu te faire une idée sur un endroit en si peu de temps? Reste encore quelque jours, et vraiment, si ça ne va pas, on trouvera une autre solution.\n" +
                "Alors le vieil homme raccroche, et finalement parvient à trouver le sommeil. Le lendemain matin, une infirmière vient le réveiller, le met dans son bain et lui fait sa toilette. A la grande surprise du vieil homme, ces attouchements de l'infirmière lui procurent une érection. Mieux encore, l'infirmière voyant l'effet qu'elle produit sur le vieil homme l'encourage en lui faisant une fellation! Dès que l'infirmière est partie, le vieil homme décroche son téléphone pour dire à son fils:\n" +
                "- Fils, cet maison est formidable! On mange bien, je me suis fait des amis, et je ne pouvais pas tomber dans un meilleur endroit!\n" +
                "- Ah, ce sont des bonnes nouvelles papa, j'espérais que tu trouverais cet endroit agréable.\n" +
                "Plus tard dans l'après-midi, le vieil homme est dans la pièce où tout le monde regarde la télé, lorsqu'il trébuche, tombe et perd connaissance. À ce moment, un autre résident surgit, baisse le pantalon du vieil homme et le sodomise en vitesse. Lorsque notre vieil homme reprend ses esprits, il remonte son pantalon, rentre dans sa chambre et téléphone tout de suite à son fils:\n" +
                "- Fils, viens me chercher, je t'en supplie! Viens tout de suite!\n" +
                "- Mais papa, il y a seulement quelques heures tu me disais le plus grand bien de cette maison, et maintenant, il faudrait que je vienne te chercher tout de suite?!?\n" +
                "- Fils, tu ne comprends pas: J'ai une érection, peut-être une fois par an, mais je tombe par terre au moins deux ou trois fois par jour!\n" +
                "\n" +
                "C'est une fois une femme qui entre dans un bar.\n" +
                "Elle se commande une bière et va prendre place à une table.\n" +
                "En face d'elle, il y a un homme qui n'arrête pas de mettre sa montre à son oreille.\n" +
                "Lorsqu'elle vient pour partir, elle va voir l'homme et lui dit:\n" +
                "- Qu'est-ce qu'elle a votre montre monsieur?\n" +
                "L'homme lui répond:\n" +
                "- Elle me parle!\n" +
                "- Comment ça elle vous parle, dit la femme ?\n" +
                "- Vous ne me croyez pas madame, dit l'homme, regardez, je vais vous le prouver.\n" +
                "L'homme approche sa montre à son oreille et dit à la femme:\n" +
                "- Vous avez 37 ans madame.\n" +
                "- Un coup de chance, dit-elle.\n" +
                "L'homme aproche sa montre à nouveau puis dit à la femme:\n" +
                "- Vous êtes célibataire.\n" +
                "- C'est encore un coup de chance, dit la dame.\n" +
                "L'homme approche sa montre à son oreille et dit à la femme:\n" +
                "- Vous, en ce moment, vous ne portez pas de sous-vêtements.\n" +
                "- Ha! Ha! Vous vous êtes trompé! dit la jeune femme.\n" +
                "Soudain l'homme donne une tape à sa montre et s'exclamme:\n" +
                "- Je m'exuse elle prend encore de l'avance!\n" +
                "\n" +
                "Un couple de parisiens décide de partir en week-end à la plage et de descendre au même hôtel qu'il y a 20 ans, lors de leur lune de miel.\n" +
                "Mais, au dernier moment, à cause d'un problème au travail, la femme ne peut pas prendre son jeudi.\n" +
                "Il est donc décidé que le mari prendrait l'avion le jeudi, et sa femme le lendemain.\n" +
                "\n" +
                "L'homme arrive comme prévu et après avoir loué la chambre d'hôtel, il se rend compte que dans la chambre, il y a un ordinateur avec connexion à Internet. Il décide alors d'envoyer un courrier à sa femme. Mais il se trompe en écrivant l'adresse.\n" +
                "\n" +
                "C'est ainsi qu'à Perpignan, une veuve qui vient de rentrer des funérailles de son mari mort d'une crise cardiaque reçoit l'Email.\n" +
                "\n" +
                "La veuve consulte sa boîte aux lettres électronique pour voir s'il n'y a pas de messages de la famille ou des amis. C'est ainsi qu'à la lecture du premier d'entre eux, elle s'évanouit. Son fils entre dans la chambre et trouve sa mère allongée sur le sol, sans connaissance, au pied de l'ordinateur.\n" +
                "\n" +
                "Sur l'écran, on peut lire le message suivant:\n" +
                "\n" +
                "'' A mon épouse bien-aimée, je suis bien arrivé.\n" +
                "\n" +
                "Tu seras certainement surprise de recevoir de mes nouvelles maintenant et de cette manière. Ici, ils ont des ordinateurs et tu peux envoyer des messages à ceux que tu aimes. Je viens d'arriver et j'ai vérifié que tout était prêt pour ton arrivée, demain vendredi.\n" +
                "\n" +
                "J'ai hâte de te revoir.\n" +
                "\n" +
                "J'espère que ton voyage se passera aussi bien que s'est passé le mien.\n" +
                "\n" +
                "P.S. : Il n'est pas nécessaire que tu apportes beaucoup de vêtements : il fait la chaleur d'enfer ici !\n" +
                "\n" +
                "Un type se tient debout sur le bord de la route au milieu d'une très sombre nuit en faisant du stop. En même temps une terrible tempête se déchaîne. Quelque temps plus tard personne ne s'est arrêté. La tempête et l'orage sont si forts qu'il est impossible de voir plus loin que 3 mètres devant soi. Tout à coup il voit une voiture qui s'approche lentement et qui s'arrête.\n" +
                "Le gars sans se poser de questions monte dans la voiture et ferme la porte, lorsqu'il se retourne il se rend compte qu'il n'y a personne à la place du conducteur.\n" +
                "La voiture démarre doucement, il voit que sur la route il y a un virage en approche, effrayé, il commence à prier. Le gars n'a pas fini d'êtr étonné lorsque juste avant d'arriver sur le virage, la porte du conducteur s'entre-ouvre et une main entre pour faire tourner le volant dans le virage.\n" +
                "Paralisé par sa peur il s'accroche avec toutes ses forces à son siège. Il reste immobile et voit que la même chose arrive à chaque fois qu'il y a un virage sur la route.\n" +
                "La tempête augmente en force, et le gars qui a sorti des forces de là où il n'en reste pas, descend de la voiture et part en courant jusqu'au village le plus proche, entre dans le bar, demande deux tequilas doubles et en tremblant commence à raconter à tous ce qui lui est arrivé. Environ une demi-heure plus tard arrivent deux gars complètement trempés, l'air extenués et l'un dit à l'autre :\n" +
                "- Regarde là-bas, c'est le connard qui est monté dans la voiture pendant qu'on la poussait ! ");
        bd.insertValue( "2001","Lucas","Thriller","Mais que vas t-il se passer??", "Ce film fait peur"," C'est l'histoire d'un vieil homme qui, parce que son fils ne peut pas s'en occuper en permanence, est obligé d'aller en maison de retraite.\n" +
                "- Ne me laisse pas ici à mourir à petit feu! dit le vieil homme à son fils.\n" +
                "-Papa, on en a parlé et reparlé: Il faut que tu ailles dans cette maison. Je te rendrais visite deux fois par semaine, et tu pourras toujours prendre le téléphone pour m'appeler.\n" +
                "Puis le fils s'en va et laisse son père dans sa chambre. Évidemment, dès le premier soir, le papa appelle son fils au téléphone:\n" +
                "- Tu dois venir me chercher. C'est terrible; je n'ai pas vu une seule infirmière, la bouffe est horrible, et je me sens tellement seul!\n" +
                "- Écoute papa, ça fait juste deux heures que je t'ai laissé là-bas! Comment peux-tu te faire une idée sur un endroit en si peu de temps? Reste encore quelque jours, et vraiment, si ça ne va pas, on trouvera une autre solution.\n" +
                "Alors le vieil homme raccroche, et finalement parvient à trouver le sommeil. Le lendemain matin, une infirmière vient le réveiller, le met dans son bain et lui fait sa toilette. A la grande surprise du vieil homme, ces attouchements de l'infirmière lui procurent une érection. Mieux encore, l'infirmière voyant l'effet qu'elle produit sur le vieil homme l'encourage en lui faisant une fellation! Dès que l'infirmière est partie, le vieil homme décroche son téléphone pour dire à son fils:\n" +
                "- Fils, cet maison est formidable! On mange bien, je me suis fait des amis, et je ne pouvais pas tomber dans un meilleur endroit!\n" +
                "- Ah, ce sont des bonnes nouvelles papa, j'espérais que tu trouverais cet endroit agréable.\n" +
                "Plus tard dans l'après-midi, le vieil homme est dans la pièce où tout le monde regarde la télé, lorsqu'il trébuche, tombe et perd connaissance. À ce moment, un autre résident surgit, baisse le pantalon du vieil homme et le sodomise en vitesse. Lorsque notre vieil homme reprend ses esprits, il remonte son pantalon, rentre dans sa chambre et téléphone tout de suite à son fils:\n" +
                "- Fils, viens me chercher, je t'en supplie! Viens tout de suite!\n" +
                "- Mais papa, il y a seulement quelques heures tu me disais le plus grand bien de cette maison, et maintenant, il faudrait que je vienne te chercher tout de suite?!?\n" +
                "- Fils, tu ne comprends pas: J'ai une érection, peut-être une fois par an, mais je tombe par terre au moins deux ou trois fois par jour!\n" +
                "\n" +
                "C'est une fois une femme qui entre dans un bar.\n" +
                "Elle se commande une bière et va prendre place à une table.\n" +
                "En face d'elle, il y a un homme qui n'arrête pas de mettre sa montre à son oreille.\n" +
                "Lorsqu'elle vient pour partir, elle va voir l'homme et lui dit:\n" +
                "- Qu'est-ce qu'elle a votre montre monsieur?\n" +
                "L'homme lui répond:\n" +
                "- Elle me parle!\n" +
                "- Comment ça elle vous parle, dit la femme ?\n" +
                "- Vous ne me croyez pas madame, dit l'homme, regardez, je vais vous le prouver.\n" +
                "L'homme approche sa montre à son oreille et dit à la femme:\n" +
                "- Vous avez 37 ans madame.\n" +
                "- Un coup de chance, dit-elle.\n" +
                "L'homme aproche sa montre à nouveau puis dit à la femme:\n" +
                "- Vous êtes célibataire.\n" +
                "- C'est encore un coup de chance, dit la dame.\n" +
                "L'homme approche sa montre à son oreille et dit à la femme:\n" +
                "- Vous, en ce moment, vous ne portez pas de sous-vêtements.\n" +
                "- Ha! Ha! Vous vous êtes trompé! dit la jeune femme.\n" +
                "Soudain l'homme donne une tape à sa montre et s'exclamme:\n" +
                "- Je m'exuse elle prend encore de l'avance!\n" +
                "\n" +
                "Un couple de parisiens décide de partir en week-end à la plage et de descendre au même hôtel qu'il y a 20 ans, lors de leur lune de miel.\n" +
                "Mais, au dernier moment, à cause d'un problème au travail, la femme ne peut pas prendre son jeudi.\n" +
                "Il est donc décidé que le mari prendrait l'avion le jeudi, et sa femme le lendemain.\n" +
                "\n" +
                "L'homme arrive comme prévu et après avoir loué la chambre d'hôtel, il se rend compte que dans la chambre, il y a un ordinateur avec connexion à Internet. Il décide alors d'envoyer un courrier à sa femme. Mais il se trompe en écrivant l'adresse.\n" +
                "\n" +
                "C'est ainsi qu'à Perpignan, une veuve qui vient de rentrer des funérailles de son mari mort d'une crise cardiaque reçoit l'Email.\n" +
                "\n" +
                "La veuve consulte sa boîte aux lettres électronique pour voir s'il n'y a pas de messages de la famille ou des amis. C'est ainsi qu'à la lecture du premier d'entre eux, elle s'évanouit. Son fils entre dans la chambre et trouve sa mère allongée sur le sol, sans connaissance, au pied de l'ordinateur.\n" +
                "\n" +
                "Sur l'écran, on peut lire le message suivant:\n" +
                "\n" +
                "'' A mon épouse bien-aimée, je suis bien arrivé.\n" +
                "\n" +
                "Tu seras certainement surprise de recevoir de mes nouvelles maintenant et de cette manière. Ici, ils ont des ordinateurs et tu peux envoyer des messages à ceux que tu aimes. Je viens d'arriver et j'ai vérifié que tout était prêt pour ton arrivée, demain vendredi.\n" +
                "\n" +
                "J'ai hâte de te revoir.\n" +
                "\n" +
                "J'espère que ton voyage se passera aussi bien que s'est passé le mien.\n" +
                "\n" +
                "P.S. : Il n'est pas nécessaire que tu apportes beaucoup de vêtements : il fait la chaleur d'enfer ici !\n" +
                "\n" +
                "Un type se tient debout sur le bord de la route au milieu d'une très sombre nuit en faisant du stop. En même temps une terrible tempête se déchaîne. Quelque temps plus tard personne ne s'est arrêté. La tempête et l'orage sont si forts qu'il est impossible de voir plus loin que 3 mètres devant soi. Tout à coup il voit une voiture qui s'approche lentement et qui s'arrête.\n" +
                "Le gars sans se poser de questions monte dans la voiture et ferme la porte, lorsqu'il se retourne il se rend compte qu'il n'y a personne à la place du conducteur.\n" +
                "La voiture démarre doucement, il voit que sur la route il y a un virage en approche, effrayé, il commence à prier. Le gars n'a pas fini d'êtr étonné lorsque juste avant d'arriver sur le virage, la porte du conducteur s'entre-ouvre et une main entre pour faire tourner le volant dans le virage.\n" +
                "Paralisé par sa peur il s'accroche avec toutes ses forces à son siège. Il reste immobile et voit que la même chose arrive à chaque fois qu'il y a un virage sur la route.\n" +
                "La tempête augmente en force, et le gars qui a sorti des forces de là où il n'en reste pas, descend de la voiture et part en courant jusqu'au village le plus proche, entre dans le bar, demande deux tequilas doubles et en tremblant commence à raconter à tous ce qui lui est arrivé. Environ une demi-heure plus tard arrivent deux gars complètement trempés, l'air extenués et l'un dit à l'autre :\n" +
                "- Regarde là-bas, c'est le connard qui est monté dans la voiture pendant qu'on la poussait ! " );
        bd.insertValue( "2002","Omayma","Action","Men in black", "Ce film fait peur"," C'est l'histoire d'un vieil homme qui, parce que son fils ne peut pas s'en occuper en permanence, est obligé d'aller en maison de retraite.\n" +
                "- Ne me laisse pas ici à mourir à petit feu! dit le vieil homme à son fils.\n" +
                "-Papa, on en a parlé et reparlé: Il faut que tu ailles dans cette maison. Je te rendrais visite deux fois par semaine, et tu pourras toujours prendre le téléphone pour m'appeler.\n" +
                "Puis le fils s'en va et laisse son père dans sa chambre. Évidemment, dès le premier soir, le papa appelle son fils au téléphone:\n" +
                "- Tu dois venir me chercher. C'est terrible; je n'ai pas vu une seule infirmière, la bouffe est horrible, et je me sens tellement seul!\n" +
                "- Écoute papa, ça fait juste deux heures que je t'ai laissé là-bas! Comment peux-tu te faire une idée sur un endroit en si peu de temps? Reste encore quelque jours, et vraiment, si ça ne va pas, on trouvera une autre solution.\n" +
                "Alors le vieil homme raccroche, et finalement parvient à trouver le sommeil. Le lendemain matin, une infirmière vient le réveiller, le met dans son bain et lui fait sa toilette. A la grande surprise du vieil homme, ces attouchements de l'infirmière lui procurent une érection. Mieux encore, l'infirmière voyant l'effet qu'elle produit sur le vieil homme l'encourage en lui faisant une fellation! Dès que l'infirmière est partie, le vieil homme décroche son téléphone pour dire à son fils:\n" +
                "- Fils, cet maison est formidable! On mange bien, je me suis fait des amis, et je ne pouvais pas tomber dans un meilleur endroit!\n" +
                "- Ah, ce sont des bonnes nouvelles papa, j'espérais que tu trouverais cet endroit agréable.\n" +
                "Plus tard dans l'après-midi, le vieil homme est dans la pièce où tout le monde regarde la télé, lorsqu'il trébuche, tombe et perd connaissance. À ce moment, un autre résident surgit, baisse le pantalon du vieil homme et le sodomise en vitesse. Lorsque notre vieil homme reprend ses esprits, il remonte son pantalon, rentre dans sa chambre et téléphone tout de suite à son fils:\n" +
                "- Fils, viens me chercher, je t'en supplie! Viens tout de suite!\n" +
                "- Mais papa, il y a seulement quelques heures tu me disais le plus grand bien de cette maison, et maintenant, il faudrait que je vienne te chercher tout de suite?!?\n" +
                "- Fils, tu ne comprends pas: J'ai une érection, peut-être une fois par an, mais je tombe par terre au moins deux ou trois fois par jour!\n" +
                "\n" +
                "C'est une fois une femme qui entre dans un bar.\n" +
                "Elle se commande une bière et va prendre place à une table.\n" +
                "En face d'elle, il y a un homme qui n'arrête pas de mettre sa montre à son oreille.\n" +
                "Lorsqu'elle vient pour partir, elle va voir l'homme et lui dit:\n" +
                "- Qu'est-ce qu'elle a votre montre monsieur?\n" +
                "L'homme lui répond:\n" +
                "- Elle me parle!\n" +
                "- Comment ça elle vous parle, dit la femme ?\n" +
                "- Vous ne me croyez pas madame, dit l'homme, regardez, je vais vous le prouver.\n" +
                "L'homme approche sa montre à son oreille et dit à la femme:\n" +
                "- Vous avez 37 ans madame.\n" +
                "- Un coup de chance, dit-elle.\n" +
                "L'homme aproche sa montre à nouveau puis dit à la femme:\n" +
                "- Vous êtes célibataire.\n" +
                "- C'est encore un coup de chance, dit la dame.\n" +
                "L'homme approche sa montre à son oreille et dit à la femme:\n" +
                "- Vous, en ce moment, vous ne portez pas de sous-vêtements.\n" +
                "- Ha! Ha! Vous vous êtes trompé! dit la jeune femme.\n" +
                "Soudain l'homme donne une tape à sa montre et s'exclamme:\n" +
                "- Je m'exuse elle prend encore de l'avance!\n" +
                "\n" +
                "Un couple de parisiens décide de partir en week-end à la plage et de descendre au même hôtel qu'il y a 20 ans, lors de leur lune de miel.\n" +
                "Mais, au dernier moment, à cause d'un problème au travail, la femme ne peut pas prendre son jeudi.\n" +
                "Il est donc décidé que le mari prendrait l'avion le jeudi, et sa femme le lendemain.\n" +
                "\n" +
                "L'homme arrive comme prévu et après avoir loué la chambre d'hôtel, il se rend compte que dans la chambre, il y a un ordinateur avec connexion à Internet. Il décide alors d'envoyer un courrier à sa femme. Mais il se trompe en écrivant l'adresse.\n" +
                "\n" +
                "C'est ainsi qu'à Perpignan, une veuve qui vient de rentrer des funérailles de son mari mort d'une crise cardiaque reçoit l'Email.\n" +
                "\n" +
                "La veuve consulte sa boîte aux lettres électronique pour voir s'il n'y a pas de messages de la famille ou des amis. C'est ainsi qu'à la lecture du premier d'entre eux, elle s'évanouit. Son fils entre dans la chambre et trouve sa mère allongée sur le sol, sans connaissance, au pied de l'ordinateur.\n" +
                "\n" +
                "Sur l'écran, on peut lire le message suivant:\n" +
                "\n" +
                "'' A mon épouse bien-aimée, je suis bien arrivé.\n" +
                "\n" +
                "Tu seras certainement surprise de recevoir de mes nouvelles maintenant et de cette manière. Ici, ils ont des ordinateurs et tu peux envoyer des messages à ceux que tu aimes. Je viens d'arriver et j'ai vérifié que tout était prêt pour ton arrivée, demain vendredi.\n" +
                "\n" +
                "J'ai hâte de te revoir.\n" +
                "\n" +
                "J'espère que ton voyage se passera aussi bien que s'est passé le mien.\n" +
                "\n" +
                "P.S. : Il n'est pas nécessaire que tu apportes beaucoup de vêtements : il fait la chaleur d'enfer ici !\n" +
                "\n" +
                "Un type se tient debout sur le bord de la route au milieu d'une très sombre nuit en faisant du stop. En même temps une terrible tempête se déchaîne. Quelque temps plus tard personne ne s'est arrêté. La tempête et l'orage sont si forts qu'il est impossible de voir plus loin que 3 mètres devant soi. Tout à coup il voit une voiture qui s'approche lentement et qui s'arrête.\n" +
                "Le gars sans se poser de questions monte dans la voiture et ferme la porte, lorsqu'il se retourne il se rend compte qu'il n'y a personne à la place du conducteur.\n" +
                "La voiture démarre doucement, il voit que sur la route il y a un virage en approche, effrayé, il commence à prier. Le gars n'a pas fini d'êtr étonné lorsque juste avant d'arriver sur le virage, la porte du conducteur s'entre-ouvre et une main entre pour faire tourner le volant dans le virage.\n" +
                "Paralisé par sa peur il s'accroche avec toutes ses forces à son siège. Il reste immobile et voit que la même chose arrive à chaque fois qu'il y a un virage sur la route.\n" +
                "La tempête augmente en force, et le gars qui a sorti des forces de là où il n'en reste pas, descend de la voiture et part en courant jusqu'au village le plus proche, entre dans le bar, demande deux tequilas doubles et en tremblant commence à raconter à tous ce qui lui est arrivé. Environ une demi-heure plus tard arrivent deux gars complètement trempés, l'air extenués et l'un dit à l'autre :\n" +
                "- Regarde là-bas, c'est le connard qui est monté dans la voiture pendant qu'on la poussait ! " );

//            cursor.requery();
        Toast.makeText(getApplicationContext(), "insertIntoDB", Toast.LENGTH_LONG).show();
        //sca.notifyDataSetChanged();
//        }
        Log.d("BD_TEST", "insert");
    }
    public void deleteDB(MainAccueil v){
        bd.deleteDB();
        //sca.notifyDataSetChanged();
        Toast.makeText(getApplicationContext(), "deleteDB", Toast.LENGTH_LONG).show();

    }
}


