public class ArithmeticExpressions {
    public static void main(String[] args) {
        System.out.println("--- Part 1: Time Breakdown ---");

        int totalSeconds = 7384;
        int hour = totalSeconds / 3600;
        int minutes = totalSeconds % 3600 /60;
        int remaining = totalSeconds % 3600 %60;
    
        System.out.println("Hours: " + hour);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + remaining);
        
        System.out.println("--- Part 2: Triangle Calculator ---");
        double sideA = 6.0;
        double sideB = 8.0;
        double sum = Math.sqrt(Math.pow(sideA, 2) + (Math.pow(sideB, 2)));
        double area = sideA * sideB/2;
        double perimeter = sideA + sideB + sum;

        System.out.print("Hypotenuse: ");
        System.out.println(sum);
        System.out.print("Area: ");
        System.out.println(area);
        System.out.print("Perimeter: ");
        System.out.println(perimeter);

        System.out.println("--- Part 3: Score Tracker ---");
        int score = 200;
        score += 150;
        score *= 2;
        score -= 50;
        score /= 5;

        System.out.println("Final Score: " + score);
        System.out.println("--- Part 4: Increment and Absolute Value ---");

        int counter = 10;
        int elevation = -300;
        counter ++;
        counter ++;
        counter --;
        elevation = Math.abs(elevation);

        System.out.println("Counter: " + counter);
        System.out.println("Depth: " + elevation);

        
    }
}
