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