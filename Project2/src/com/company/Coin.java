package com.company;

import java.util.Random;

public class Coin
{
    private String sideUp;

    public void tossIt() {
        Random rand = new Random();
        int randNum;
        randNum = rand.nextInt(2);
        if (randNum == 1) {
            sideUp = "Heads";
        }//close if statement
        else
        {
            sideUp = "Tails";
        }
    }//close toss function

    public String getSide()
    {
        return sideUp;
    }//close getSide()

    public Coin()
    {
        tossIt();
    }
} //close nickel class
