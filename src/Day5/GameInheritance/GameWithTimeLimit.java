package Day5.GameInheritance;

public class GameWithTimeLimit extends Game {
    int TimeLimit;
    GameWithTimeLimit(String gameName,int MaxNumberOfPlayers, int TimeLimit){
        super(gameName,MaxNumberOfPlayers);
        this.TimeLimit = TimeLimit;
    }

    @Override
    public String toString(){
        System.out.println(super.toString());
        return "Time Limit for "+gameName+ " is "+TimeLimit;
    }

}
