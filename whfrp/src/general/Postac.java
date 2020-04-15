package general;
public class Postac {
    //pola ################################################

   private Charakterystyka walkaWrecz;
   private Charakterystyka umiejetnosciStrzeleckie;
   private Charakterystyka krzepa;
   private Charakterystyka odpornosc;
   private Charakterystyka zrecznosc;
   private Charakterystyka intelekt;
   private Charakterystyka silaWoli;
   private Charakterystyka oglada;
   private Charakterystyka ataki;
   private Charakterystyka zywotnosc;
   private Charakterystyka sila;
   private Charakterystyka wytrzymalosc;
   private Charakterystyka szybkosc;
   private Charakterystyka magia;
   private Charakterystyka punktyObledu;
   private Charakterystyka punktyPrzeznaczenia;
   private Charakterystyka punktySzczescia;
   private Boolean jestZywy=true; //zywy = 1, martwy = 0
   private Integer pancerz; //brak = 0, lekki = 1, sredni = 3, ciezki = 5
   private Integer przytomnosc; //bezbronny = 0, ogluszony = 1, przytomny = 2

   //getter/setter###########################################
   public Integer getWalkaWrecz() {
       return getChwilowa();
   }

   public Integer umiejetnosciStrzeleckie() {
        return getChwilowa();
   }
   
   public Integer getKrzepa() {
        return getChwilowa();
   }

   public Integer getOdpornosc() {
        return getChwilowa();
    }

    public Integer getZrecznosc() {
        return getChwilowa();
    }

    public Integer getIntelekt() {
        return getChwilowa();
    }

    public Integer getSilaWoli() {
        return getChwilowa();
    }

    public Integer getOglada() {
        return getChwilowa();
    }

    public Integer getAtaki() {
        return getChwilowa();
    }

    public Integer getZywotnosc() {
        return getChwilowa();
    }

    public void setZywotnosc(Integer value) {
        zywotnosc.setChwilowa(value);
    }

    public Integer getSila() {
        return getChwilowa();
    }

    public Integer getWytrzymalosc() {
        return getChwilowa();
    }

    public Integer getSzybkosc() {
        return getChwilowa();
    }

    public Integer getMagia() {
        return getChwilowa();
    }

    public Integer getPunktyObledu() {
        return getChwilowa();
    }

    public void setPunktyObledu(Integer arg) {
        punktyObledu.setAktualna(arg);
        punktyObledu.setChwilowa(arg);
    }

    public Integer getPunktyPrzeznaczenia() {
        return getChwilowa();
    }

    public Integer getPunktySzczescia() {
        return getChwilowa();
    }

    public Boolean getJestZywy() {
        return jestZywy;
    }

    public Integer getPancerz() {
        return pancerz;
    }

    public Integer getPrzytomnosc() {
        return przytomnosc;
    }
//konstruktor#################################################################

    Postac(int[] charakterystyki){
        walkaWrecz = new Charakterystyka(charakterystyki[0]);
        umiejetnosciStrzeleckie = new Charakterystyka(charakterystyki[1]);
        krzepa = new Charakterystyka(charakterystyki[2]);
        odpornosc = new Charakterystyka(charakterystyki[3]);
        zrecznosc = new Charakterystyka(charakterystyki[4]);
        intelekt = new Charakterystyka(charakterystyki[5]);
        silaWoli = new Charakterystyka(charakterystyki[6]);
        oglada = new Charakterystyka(charakterystyki[7]);
        ataki = new Charakterystyka(charakterystyki[8]);
        zywotnosc = new Charakterystyka(charakterystyki[9]);
        sila = new Charakterystyka(charakterystyki[10]);
        wytrzymalosc = new Charakterystyka(charakterystyki[11]);
        szybkosc = new Charakterystyka(charakterystyki[12]);
        magia = new Charakterystyka(charakterystyki[13]);
        punktyObledu = new Charakterystyka(charakterystyki[14]);
        punktyPrzeznaczenia = new Charakterystyka(charakterystyki[15]);
        punktySzczescia = new Charakterystyka(charakterystyki[15]);
    }

    //metody walki#####################################################################

    public void rana(Integer arg)
    {

    }
}

//klasa pomocnicza Charakterystyka#########################################################

class Charakterystyka {
    private final Integer poczatkowa;
    private Integer aktualna;
    private Integer chwilowa;

    Charakterystyka(Integer wartosc) {
        poczatkowa = wartosc;
        aktualna = wartosc;
        chwilowa = wartosc;
    }

    public Integer getPoczatkowa() {
        return poczatkowa;
    }

    public Integer getAktualna() {
        return aktualna;
    }

    public void setAktualna(Integer wartosc) {
        aktualna = wartosc;
    }

    public Integer getChwilowa() {
        return chwilowa;
    }

    public void setChwilowa(Integer wartosc) {
        chwilowa = wartosc;
    }
}