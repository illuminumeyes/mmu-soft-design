package main.java.uk.ac.mmu.game.dice;
import java.util.List;

// This class used for demonstrating game variations with Exact End, Hit and TP rules

public class FixedSequenceRoller implements DiceRoller {
    private final List<Integer> rolls;
    private int next = 0;

    public FixedSequenceRoller(int... rolls){
        this.rolls = java.util.Arrays.stream(rolls).boxed().toList();
    }

    public FixedSequenceRoller(List<Integer> rolls){
        this.rolls = List.copyOf(rolls);
    }

    @Override 
    public int roll(){
        if (next >= rolls.size()){
            throw new IllegalStateException("Fixed sequence exhausted after " + rolls.size() + "rolls");
        }
        return rolls.get(next++);
    }
}
