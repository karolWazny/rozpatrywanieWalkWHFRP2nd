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

    public Integer getPunktyPrzeznaczenia() {
        return getChwilowa();
    }

    public Integer getPunktySzczescia() {
        return getChwilowa();
    }

//konstruktor#################################################################

Postac(){}
}



protected class Charakterystyka {
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