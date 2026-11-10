package main.java.uk.ac.mmu.game.dice;
import java.util.Random;

public class Die implements DiceRoller {
    private final int sides;
    private final Random random;

    public Die(int sides){
        if (sides < 2) throw new IllegalArgumentException("Sides must be >= 2"); 
        this.sides = sides;
        this.random = new Random();
    }

    public Die(int sides, Random random){
        if (sides < 2) throw new IllegalArgumentException("Sides must be >= 2"); 
        this.sides = sides;
        this.random = random;
    }

    @Override 
    public int roll(){return random.nextInt(sides) + 1;}
}
