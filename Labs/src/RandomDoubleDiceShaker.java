import java.util.Random;

public class RandomDoubleDiceShaker implements DiceShaker{
    private static final Random random1 = new Random();
    private static final Random random2 = new Random();

    @Override
    public int next() {
        return (random1.nextInt(6) + 1) + (random2.nextInt(6)+1);
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
