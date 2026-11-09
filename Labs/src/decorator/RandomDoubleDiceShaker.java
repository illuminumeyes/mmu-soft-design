package decorator;

import java.util.Random;

class RandomDoubleDiceShaker implements DiceShaker {
    private final Random random = new Random();
    private final DiceShaker singleShaker;

    public RandomDoubleDiceShaker(DiceShaker singleShaker){
        this.singleShaker = singleShaker;
    }
    @Override
    public int shake(){
        return singleShaker.shake() + random.nextInt(6) + 1;
    }
    
}
