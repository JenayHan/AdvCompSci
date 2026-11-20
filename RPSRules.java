public class RPSRules {

    public static boolean isValidChoice(String choice){
        if (choice == null){
            return false;
        }
        
        if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")){
            return true;
        }

        else {
            return false;
        }
    }

    public static String randomChoice(){
        double number = Math.random();
        if (number >= 2.0/3.0 && number < 1.0){
            return "rock";
        }

        else if (number >= 1.0/3.0 && number < 2.0/3.0){
            return "paper";
        }

        else{
            return "scissors";
        }
    }

    public static boolean beats(String mine, String theirs){
        if (mine.equals("rock") && theirs.equals("scissors")){
            return true;
        }
        
        if (mine.equals("paper") && theirs.equals("rock")){
            return true;
        }

        if (mine.equals("scissors") && theirs.equals("paper")){
            return true;
        }
        
        else {
            return false;
        }
    }
}
