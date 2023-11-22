public class Player {
    private String playerName;
    private int score;
    private int lifeLinesTotal;

    public Player(String playerName) {
        this.playerName = playerName;
        this.score = 0;
        this.lifeLinesTotal = 2;
    }

    // Methods to update player data
    public void increaseMoney(int points) {
        this.score = points;
    }

    public int getMoney(){
        return score;
    }
    // Other player-related methods
    public void decreaseLifeline(int lifelines){
        this.lifeLinesTotal -= lifelines;
    }
    public int getLifeLinesTotal(){
        return lifeLinesTotal;
    }
}
