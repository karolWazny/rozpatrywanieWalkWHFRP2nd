public class Character {
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

    public getPoczatkowa() {
        return poczatkowa;
    }

    public getAktualna() {
        return aktualna;
    }

    public void setAktualna(Integer wartosc) {
        aktualna = wartosc;
    }

    public getChwilowa() {
        return chwilowa;
    }

    public void setChwilowa(Integer wartosc) {
        chwilowa = wartosc;
    }
}