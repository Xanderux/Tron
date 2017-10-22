package com.example.kvin.tron;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public RelativeLayout fenetreprincipale;
    public int matrice[][] = new int[7][20];
    public int tailleCase;


    public ImageView Case;

    public Button ButDroitJ1;
    public Button ButDroitJ2;
    public Button ButGaucheJ1;
    public Button ButGaucheJ2;

    public TextView Score1;
    public TextView Score2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fenetreprincipale = (RelativeLayout) findViewById(R.id.fenetrePrincipale);

        ButDroitJ1 = (Button) findViewById(R.id.ButDroitJ1);
        ButDroitJ2 = (Button) findViewById(R.id.ButDroitJ2);
        ButGaucheJ1 = (Button) findViewById(R.id.ButGaucheJ1);
        ButGaucheJ2 = (Button) findViewById(R.id.ButGaucheJ2);
        Score1 = (TextView) findViewById(R.id.scorej);
        Score2 = (TextView) findViewById(R.id.scorej2);

        ButDroitJ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        initialiserMatriceNull();

        matrice[0][1] = 1;
        matrice[1][1] = 2;
        matrice[2][1] = 1;
        matrice[3][1] = 2;
        matrice[4][1] = 1;
        matrice[5][1] = 2;


        matrice[0][2] = 2;
        matrice[0][3] = 1;
        matrice[0][4] = 2;
        matrice[0][5] = 1;
        matrice[0][6] = 2;


       // matrice[1][2] = 2;
       // matrice[4][5] = 2;
        parcoursMatrice();
    }

    public void initialiserMatriceNull() {
        for (int largeur = 0; largeur < 6; largeur++) {
            for (int longueur = 0; longueur < 12; longueur++) {
                matrice[largeur][longueur] = 0;
            }
        }

    }

   public void parcoursMatrice(){
       tailleCase = (fenetreprincipale.getWidth()) / 6;
       for (int largeur = 0; largeur < 6; largeur++) {
           for (int longueur = 0; longueur < 12; longueur++) {
               if(matrice[largeur][longueur]!=0){
                   Case = new ImageView(this);
                   if(matrice[largeur][longueur]==1){
                       Case.setBackgroundResource(R.drawable.rouge);
                   }
                   if(matrice[largeur][longueur]==2){
                       Case.setBackgroundResource(R.drawable.bleu);
                   }
                   ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(tailleCase,tailleCase);
                   Case.setLayoutParams(params);

                   Case.setX(tailleCase*largeur);
                   Case.setY(tailleCase*longueur);

                   fenetreprincipale.addView(Case);
               }

           }
       }
   }

   public Boolean isEmpty(int x, int y){
       if(matrice[x][y]==0){
           return true;
       }
       else{
           return false;
       }
   }
}
