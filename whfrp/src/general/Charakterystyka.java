package general;

public class Charakterystyka {
    private final Integer poczatkowa;
    private Integer aktualna;
    private Integer chwilowa;

    Charakterystyka(Integer wartosc) {
        poczatkowa = wartosc;
        aktualna = wartosc;
        chwilowa = wartosc;
    }

    public int getPoczatkowa() {
        return poczatkowa;
    }

    public int getAktualna() {
        return aktualna;
    }

    public void setAktualna(Integer wartosc) {
        aktualna = wartosc;
    }

    public int getChwilowa() {
        return chwilowa;
    }

    public void setChwilowa(Integer wartosc) {
        chwilowa = wartosc;
    }
}