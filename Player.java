public class Player {

    private String name;
    private String choice;

    public Player(String name){
        this.name = name;
        choice = RPSRules.randomChoice();
    }

    public String getName(){
        return name;
    }

    public String getChoice(){
        return choice;
    }

    public boolean choose(String typed){
        if (typed == null){
            return false;
        }
        if (typed.toLowerCase().equals("rock")
        || typed.toLowerCase().equals("scissors") 
        || typed.toLowerCase().equals("paper")){
            choice = typed.toLowerCase();
            return true;
        }

        else {
            return false;
        }
    }

    public String toString(){
        return name + " chose " + choice + ".";
    }

}
