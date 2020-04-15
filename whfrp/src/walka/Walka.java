package walka;
import general.Postac;
import general.Dice;

public class Walka {
    
    public void atak(Postac ataker, Postac obronca) {
        switch(obronca.getPrzytomnosc())
        {
            default: //czyli obronca w pelni przytomny i moze sie bronic
                {
                int rzutTrafienie = Dice.d100();
                if(ataker.getWalkaWrecz()>=rzutTrafienie)
                    {
                        int dmg = ataker.getSila();
                        int rzutDmg = Dice.d10();
                        dmg+=rzutDmg;
                        while(rzutDmg ==10) //mechanizm furii
                        {
                            rzutDmg = Dice.d10();
                            dmg+=rzutDmg;
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
            if(!obronca.getJestZywy())
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

    public void ranaWWalce(Postac obronca, Postac ataker, Integer obrazenia)
    {
        if((obronca.getZywotnosc()-obrazenia+obronca.getWytrzymalosc()+obronca.getPancerz())<0)
        {
            setZywotnosc(0);
            //implementacja trafienia krytycznego
            //jeszcze niegotowa
            setPunktyObledu(getPunktyObledu()+1);
        }
        else 
        {
            setZywotnosc(getZywotnosc+getPancerz()+getWytrzymalosc()-obrazenia);
        }
    }
}