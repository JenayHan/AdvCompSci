public class ConditionalChallenge {
    public static void main(String[] args) {
        System.out.println("--- Part 1: Temperature Converter ---");

        double temperature = 75.0;
        boolean isCold = true;
        if (isCold = true) {
            temperature = temperature - 15;}
        else {temperature = temperature + 10;}
        
        System.out.print("Temperature: ");
        System.out.println(temperature);

        System.out.println("--- Part 2: Grade Calculator ---");
        
        int score = 85;
        if (score >= 70){
            System.out.print("Score: ");
            System.out.println(score);
            System.out.println("Passed");
        } else {System.out.println("Failed");
        }

        System.out.println("--- Part 3: Season Determiner ---");

        int temp = 65;
        System.out.print("Temperature: ");
        System.out.println(temp);
        if (temp > 80) {
            System.out.println("Season: Summer");
        }
        if (80 >= temp && temp >= 60) {
            System.out.println("Season: Spring");

        }if (59 >= temp && temp >= 40) {
            System.out.println("Season: Fall");
        }
        if (59 >= temp && temp >= 40) {
            System.out.println("Season: Winter");
        }


        System.out.println("--- Part 4: Number Classifier ---");
        int number = 42;
        System.out.println("Number: 42");
        if (number > 0) {
            System.out.print(number);
            System.out.println(" is Positive");
        }
        if (number < 0) {
            System.out.print(number);
            System.out.println(" is negative");
        }
        if (number == 0) {
            System.out.print(number);
            System.out.println(" is zero");
        }
        if (number % 2 == 0) {
            System.out.print(number);
            System.out.println(" is even");
        }
        if (number % 5 == 0) {
            System.out.print(number);
            System.out.println(" is a multiple of 5");
        }
        if (number % 5 != 0)
            System.out.print(number);
            System.out.println(" is not a multiple of 5");
        if (number % 3 == 0) {
            System.out.print(number);
            System.out.println(" is multiple of 3");
        }
        if (number % 3 != 0) {
            System.out.print(number);
            System.out.println(" is not a multiple of 3");
        }
    }
}

