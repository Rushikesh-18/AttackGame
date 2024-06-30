import java.util.Random;

public class Dice {
    private static final int SIDES = 6;
    private Random random;
    //Pick one Random
    public Dice() {
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(SIDES) + 1;
    }
}