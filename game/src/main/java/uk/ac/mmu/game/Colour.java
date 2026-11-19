package uk.ac.mmu.game;

import java.util.Objects;

public class Colour {
    private final String colour;
    private final String escString;

    public Colour(String colour, String escString){
        this.colour = Objects.requireNonNull(colour, "Colour name cannot be null");
        this.escString = Objects.requireNonNull(escString, "Esc sequence cannot be null");
    }
    
    public String getColour(){ return colour;}

    public String getEscString(){ return escString;}

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Colour otherColour)) return false;
        if (this == otherColour) return true;
        return escString.equals(otherColour.escString) && colour.equalsIgnoreCase(otherColour.colour);
    }

    @Override 
    public int hashCode(){ return Objects.hashCode(colour);}

    @Override
    public String toString(){ return String.format("%s%s\u001B[0m", escString, colour);}
}
