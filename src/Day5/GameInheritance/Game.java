package Day5.GameInheritance;

public class Game {
    public String gameName;
    public int MaxNumberOfPlayers;

    public Game(String gameName, int MaxNumberOfPlayers) {
        this.gameName = gameName;
        this.MaxNumberOfPlayers = MaxNumberOfPlayers;
    }

    public String toString() {
        return "Maximum number of players for" + gameName + " is " + MaxNumberOfPlayers;
    }
}
