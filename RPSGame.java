import java.util.Scanner;

public class RPSGame {
    private Player player;
    private Player computer;  
    
    public RPSGame(Player player, Player computer){
        this.player = player;
        this.computer = computer;
    }

    public Player getPlayer(){
        return player;
    }
    public Player getComputer(){
        return computer;
    }
    
    public String winner(){
        if (RPSRules.beats(computer.getChoice(), player.getChoice()) == true){
            return "Computer";
        }

        if (computer.getChoice().equals(player.getChoice())){
            return "tie";
            }

        else {
            return player.getName();

        }
    }

    public static int readRounds(Scanner input){
        // Scanner keyboard = new Scanner(System.in);
        System.out.println("How many rounds?");
        String rounds = input.nextLine();
        input.close();
        return Integer.parseInt(rounds);
    }

    public void readChoice(Scanner input){
        System.out.println("Rock, paper, or scissors?");
        String choice = input.nextLine();
        while (player.choose(choice) == false){
            System.out.println("Rock, paper, or scissors?");
            choice = input.nextLine();
        }

    }



}
