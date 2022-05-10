package game;

public class ScoreBoard {

    private Integer tie;
    private Integer wins;
    private Integer loses;

    public ScoreBoard(){
        this.tie = 0;
        this.wins = 0;
        this.loses = 0;
    }

    public Integer getTie() {
        return tie;
    }

    public void incrementTie() {
        this.tie++;
    }

    public Integer getWins() {
        return wins;
    }

    public void incrementWins() {
        this.wins++;
    }

    public Integer getLoses() {
        return loses;
    }

    public void incrementLoses() {
        this.loses++;
    }
}
