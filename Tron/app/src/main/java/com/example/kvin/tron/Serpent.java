package com.example.kvin.tron;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Kévin on 25/10/2017.
 */

public class Serpent {

    private char direction;

    private int teteI ;
    private int teteJ;

    private Date duree = new Date(100);



    public Serpent(char direction, int teteI, int teteJ) {
        this.direction= direction;
        this.teteI=teteI;
        this.teteJ= teteJ;
    }

    public void avancer(){

        TimerTask task = new TimerTask()
        {
            @Override
            public void run()
            {
                deplacement();

            }
        };

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    public void deplacement(){
        switch (direction) {
            case 'N':
                teteJ--;
                break;
            case 'S':
                teteJ++;
                break;
            case 'O':
                teteI--;
                break;
            case 'E':
                teteI++;
                break;
           /*/ default:

                break;/*/
        }


    }


    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public int getTeteI() {
        return teteI;
    }

    public void setTeteX(int teteI) {
        this.teteI = teteI;
    }

    public int getTeteJ() {
        return teteJ;
    }

    public void setTeteJ(int teteJ) {
        this.teteJ = teteJ;
    }
}
