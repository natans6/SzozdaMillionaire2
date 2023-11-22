public class Player {
    private String playerName;
    private int score;

    public Player(String playerName) {
        this.playerName = playerName;
        this.score = 0;
    }

    // Methods to update player data
    public void increaseMoney(int points) {
        this.score = points;
    }

    public int getMoney(){
        return score;
    }
    // Other player-related methods
}
