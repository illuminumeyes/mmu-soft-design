public class Player(){
    int x_placement;
    int y_placement;
    int player;

    public Player(int player_number){
        this.player = player_number;
    }
    public Player(int player_number, int x_start = 0, int y_start = 0){
        this.player = player_number;
        this.x_placement = x_start;
        this.y_placement = y_start;
    }
    public void moveUp(){};

    public void moveDown(){};

    public void moveLeft(){};

    public void moveRight(){};

    public boolean shareSpace(){};

    public int rollDice(){};


}