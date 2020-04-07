public class Dice {
    //symulacja rzutu (arg)k(x) dla standardowo spotykanych w RPG kości

    public static Integer d2(Integer arg) {
        Integer wynik = 0;
        for(int i = 0; i<arg; i++) {
            wynik+=(int)(Math.random()*2)+1;
        }
        return wynik;
    }

    public static Integer d2() {
        return d2(1);
    }

    public static Integer d4(Integer arg) {
        Integer wynik = 0;
        for(int i = 0; i<arg; i++) {
            wynik+=(int)(Math.random()*4)+1;
        }
        return wynik;
    }

    public static Integer d4() {
        return d4(1);
    }
    
    public static Integer d6(Integer arg) {
        Integer wynik = 0;
        for(int i = 0; i<arg; i++) {
            wynik+=(int)(Math.random()*6)+1;
        }
        return wynik;
    }

    public static Integer d6() {
        return d6(1);
    }

    public static Integer d8(Integer arg) {
        Integer wynik = 0;
        for(int i = 0; i<arg; i++) {
            wynik+=(int)(Math.random()*8)+1;
        }
        return wynik;
    }

    public static Integer d8() {
        return d8(1);
    }

    public static Integer d10(Integer arg) {
        Integer wynik = 0;
        for(int i = 0; i<arg; i++) {
            wynik+=(int)(Math.random()*10)+1;
        }
        return wynik;
    }

    public static Integer d10() {
        return d10(1);
    }

    public static Integer d12(Integer arg) {
        Integer wynik = 0;
        for(int i = 0; i<arg; i++) {
            wynik+=(int)(Math.random()*12)+1;
        }
        return wynik;
    }

    public static Integer d12() {
        return d12(1);
    }

    public static Integer d20(Integer arg) {
        Integer wynik = 0;
        for(int i = 0; i<arg; i++) {
            wynik+=(int)(Math.random()*20)+1;
        }
        return wynik;
    }

    public static Integer d20() {
        return d20(1);
    }

    public static Integer d100(Integer arg) {
        Integer wynik = 0;
        for(int i = 0; i<arg; i++) {
            wynik+=(int)(Math.random()*100)+1;
        }
        return wynik;
    }

    public static Integer d100() {
        return d100(1);
    }
}