package uk.ac.mmu.game;

public class Player {
    private final Colour colour;
    private Position position;
    private final Position start;
    private final Position end;

    /**
     * Creates a new player with the given colour, start and end positions.
     * 
     * @param colour the player's colour
     * @param start the starting position
     * @param end the end/home position
     */
    public Player(Colour colour, Position start, Position end) {
        this.colour = colour;
        this.start = start;
        this.end = end;
        this.position = start;
    }

    /**
     * Gets the player's current position.
     * 
     * @return the current position
     */
    public Position getPosition() {
        return this.position;
    }

    /**
     * Updates the player's position after a move.
     * 
     * @param newPosition the new position
     */
    public void updateMove(Position newPosition) {
        this.position = newPosition;
    }

    /**
     * Gets the player's colour.
     * 
     * @return the colour
     */
    public Colour getColour() {
        return this.colour;
    }

    /**
     * Gets the player's start position.
     * 
     * @return the start position
     */
    public Position getStart() {
        return this.start;
    }

    /**
     * Gets the player's end position.
     * 
     * @return the end position
     */
    public Position getEnd() {
        return this.end;
    }

    @Override
    public String toString() {
        return String.format("%s at %s", colour.getEscString(), position);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Player other)) return false;
        return this.colour.equals(other.colour);
    }

    @Override
    public int hashCode() {
        return colour.hashCode();
    }
}