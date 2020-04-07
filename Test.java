import Dice;

public class Test {
    public static void main(String[] Args) {
        for(int i = 0; i < 20; i++)
        {
            System.out.print(Dice.d6().toString()+" ");
        }
    }
}