package main.java.uk.ac.mmu.game.dice;
import java.util.List;

public class MultiDice implements DiceRoller{
    private final List<DiceRoller> dice;

    public MultiDice(DiceRoller... die) {
        this.dice = List.of(die);
    }
    
    @Override
    public int roll(){
        int total = 0;
        for (DiceRoller die : dice){
            total += die.roll();
        }
        return total;
    }
}
