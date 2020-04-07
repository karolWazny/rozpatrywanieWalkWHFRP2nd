import Postac;
import Dice;

public class Walka {
    
    public void atak(Postac ataker, Postac obronca) {
        switch(obronca.getPrzytomnosc)
        {
            default: {//czyli obronca w pelni przytomny i moze sie bronic
                if(ataker.getWalkaWrecz()>=d100())
                    {
                        int dmg = ataker.getSila();
                        int rzut = d10;
                        while(rzut ==10)
                        {

                        }
                    }
                } break;
        }

    }

    public Integer atakWielokrotny(Postac ataker, Postac obronca) {
        Integer k = 0;
        for(int i = 0; (i < ataker.getAtaki()); i++)
        {
            atak(ataker, obronca);
            if(!obronca.getStan())
            {
                k=ataker.getAtaki()-i-1;
                break;
            }
        }
        return k;
    }

    public void strzal() {

    }

    public void parowanie() {
        
    }
}