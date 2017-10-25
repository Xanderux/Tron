package com.example.kvin.tron;

import java.util.Timer;

/**
 * Created by Kévin on 25/10/2017.
 */

public class Jeu {
    Serpent J1, J2;
    Boolean finPartie = false;

    public Jeu(){

    }

    public void init(){
        this.J1 = new Serpent('N', 3,5);
        this.J2 = new Serpent('S', 3,0);
    }

    public Serpent getJ1() {
        return J1;
    }

    public Serpent getJ2() {
        return J2;
    }

    public Boolean getFinPartie() {
        return finPartie;
    }

    public void setFinPartie(Boolean finPartie) {
        this.finPartie = finPartie;
    }

    public void setFinPartie() {
        this.finPartie=true;
    }
}
