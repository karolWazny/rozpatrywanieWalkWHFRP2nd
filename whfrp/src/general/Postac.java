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
       return walkaWrecz.getChwilowa();
   }

   public Integer umiejetnosciStrzeleckie() {
        return umiejetnosciStrzeleckie.getChwilowa();
   }
   
   public Integer getKrzepa() {
        return krzepa.getChwilowa();
   }

   public Integer getOdpornosc() {
        return odpornosc.getChwilowa();
    }

    public Integer getZrecznosc() {
        return zrecznosc.getChwilowa();
    }

    public Integer getIntelekt() {
        return intelekt.getChwilowa();
    }

    public Integer getSilaWoli() {
        return silaWoli.getChwilowa();
    }

    public Integer getOglada() {
        return oglada.getChwilowa();
    }

    public Integer getAtaki() {
        return ataki.getChwilowa();
    }

    public Integer getZywotnosc() {
        return zywotnosc.getChwilowa();
    }

    public void setZywotnosc(Integer value) {
        zywotnosc.setChwilowa(value);
    }

    public Integer getSila() {
        return sila.getChwilowa();
    }

    public Integer getWytrzymalosc() {
        return wytrzymalosc.getChwilowa();
    }

    public Integer getSzybkosc() {
        return szybkosc.getChwilowa();
    }

    public Integer getMagia() {
        return magia.getChwilowa();
    }

    public Integer getPunktyObledu() {
        return punktyObledu.getChwilowa();
    }

    public void setPunktyObledu(Integer arg) {
        punktyObledu.setAktualna(arg);
        punktyObledu.setChwilowa(arg);
    }

    public Integer getPunktyPrzeznaczenia() {
        return punktyPrzeznaczenia.getChwilowa();
    }

    public Integer getPunktySzczescia() {
        return punktySzczescia.getChwilowa();
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

    public Postac(int[] charakterystyki){
        bebechyKonstruktora(charakterystyki);
    }

    //konstruktor domyslny######################################################
    private void bebechyKonstruktora (int[] charakterystyki){
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
        przytomnosc = 2;
    }

   public Postac()
    {
        int[] charakterystyki = new int[16];
        for(int i = 0; i < 8; i++)
        {
            charakterystyki[i] = 31;
        }
        charakterystyki[8] = 1;
        charakterystyki[9] = 11;
        charakterystyki[10] = 3;
        charakterystyki[11] = 3;
        charakterystyki[12] = 4;
        charakterystyki[13] = 0;
        charakterystyki[14] = 0;
        charakterystyki[15] = 2;
        bebechyKonstruktora(charakterystyki);
    }

    //metody walki#####################################################################

    public void rana(Integer arg)
    {

    }
}

//klasa pomocnicza Charakterystyka#########################################################

