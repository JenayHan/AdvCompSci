public class TicketBooth {

    private String showName;
    private int showHour;
    private int seatsLeft;

    // Creates a booth selling one showing.
    // to-do: store all three values in the instance variables
    public TicketBooth(String newShowName, int newShowHour, int newSeatsLeft) {
        showName = newShowName;
        showHour = newShowHour;
        seatsLeft = newSeatsLeft;
    }

    public String getShowName() {
        return showName;
    }

    public int getShowHour() {
        return showHour;
    }

    public int getSeatsLeft() {
        return seatsLeft;
    }

    public String priceCategory(int age) {
        if (age <= 12){
            return "child";
        }
        else if (age >= 13 && age <=17){
            return"student";
        }
        else if (age >= 18 & age <= 64){
            return"adult";
        }
        else if (age >= 65){
            return"senior";
        }
        else {
            return "missing return statement";
        }
    }

    public int ticketPrice(int age, boolean isMember) {
        if (age <= 12 && isMember == true){
            return 6;
        }
        else if (age <= 12 && isMember == false) {
            return 8;
        }

        else if (age >= 13 && age <=17 && isMember == true){

            if (matinee == true){
                return 7;
            }
            else {
                return 10;
            }

            return 10;
        }

        else if (age >= 13 && age <=17 & isMember == false) {
            if (matinee == true){
                return 9;
            }
            else {
                return 12;
            }

            return 12;
        }

        else if (age >= 18 && age <= 64 && isMember == true){
            if (matinee == true){
                return 13;
            }
            else {
                return 16;
            }

            return 16;
        }

        else if (age >= 18 && age <= 64 && isMember == false) {
            if (showHour <=matinee == true){
                return 15;
            }
            else {
                return 18;
            }

            return 18;
        }
        
        else if (age >= 65 && isMember == true){
            return 8;
        }

        else if (age >= 65 && isMember == false) {
            return 10;
        }

        else {
            return 5;
        }

        }


    public String showtimeLabel() {
        if (showHour >= 17) {
            return "evening";
        } else if (showHour >= 12) {
            return "matinee";
        } else {
            return "morning";
        }
    }

    public String wristband(int age) {
        String color = "green";
        if (age <= 12) {
            color = "red";
        }
        else if (age <= 17 && age >= 13) {
            color = "yellow";
        }
        else {
            color = "green";
        }
        return color;
    }

    public int memberDiscount(boolean isMember) {
        if (isMember == true) {
            return 2;
        }
        return 0;
    }


    public void setShowHour(int newShowHour) {
        if (newShowHour < 10){
        System.out.println("Invalid show hour: " + newShowHour);
    
        } else if (newShowHour > 23){
            System.out.println("Invalid show hour: " + newShowHour);
            return;
        }

        else {
            showHour = newShowHour;
            return;
        }

    }

    public void setSeatsLeft(int newSeatsLeft) {
        if (newSeatsLeft < 0){
            System.out.println("Invalid seat count: " + newSeatsLeft);
            return;
        }
        else if (newSeatsLeft > 200){
            System.out.println("Invalid seat count: " + newSeatsLeft);
            return;
        }
        else {
            seatsLeft = newSeatsLeft;
        }
    }

    public void setShowName(String newShowName) {
        if (newShowName == null){
            System.out.println("Invalid show name");
            return;
        }
        if (newShowName.length() == 0){
            System.out.println("Invalid show name");
            return;
        }
        else {
            showName = newShowName;
        }
    }


    
    public void sell(int groupSize) {
        if (groupSize < 1){
            System.out.println("Invalid group size: " + groupSize);
            return;
        }
        if (groupSize > seatsLeft){
            System.out.println("Not enough seats for " + groupSize);
            return;
        }
        else {
            seatsLeft =  seatsLeft - groupSize; 
            return;
        }
    }
}
