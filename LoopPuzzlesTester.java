public class LoopPuzzlesTester {

    public static void main(String[] args) {
        
        LoopPuzzles puzzles = new LoopPuzzles();

        System.out.println("stepsToOne(6): [" + puzzles.stepsToOne(6) + "]");
        System.out.println("stepsToOne(1): [" + puzzles.stepsToOne(1) + "]");
        System.out.println("stepsToOne(0): [" + puzzles.stepsToOne(0) + "]");
        System.out.println("stepsToOne(7): [" + puzzles.stepsToOne(7) + "]");
        System.out.println("stepsToOne(2): [" + puzzles.stepsToOne(2) + "]");
        System.out.println("stepsToOne(-5): [" + puzzles.stepsToOne(-5) + "]");

        System.out.println("sumDigits(4092): [" + puzzles.sumDigits(4092) + "]");
        System.out.println("sumDigits(-47): [" + puzzles.sumDigits(-47) + "]");
        System.out.println("sumDigits(999): [" + puzzles.sumDigits(999) + "]");
        System.out.println("sumDigits(7): [" + puzzles.sumDigits(7) + "]");
        System.out.println("sumDigits(0): [" + puzzles.sumDigits(0) + "]");

        System.out.println("reverseDigits(1200): [" + puzzles.reverseDigits(1200) + "]");
        System.out.println("reverseDigits(-123): [" + puzzles.reverseDigits(-123) + "]");
        System.out.println("reverseDigits(1234): [" + puzzles.reverseDigits(1234) + "]");
        System.out.println("reverseDigits(5): [" + puzzles.reverseDigits(5) + "]");
        System.out.println("reverseDigits(0): [" + puzzles.reverseDigits(0) + "]");

        //System.out.println("isPowerOfThree(81): [" + puzzles.isPowerOfThree(81) + "]");
        //System.out.println("isPowerOfThree(10): [" + puzzles.isPowerOfThree(10) + "]");
        //System.out.println("isPowerOfThree(1): [" + puzzles.isPowerOfThree(1) + "]");
        //System.out.println("isPowerOfThree(6): [" + puzzles.isPowerOfThree(6) + "]");
        //System.out.println("isPowerOfThree(0): [" + puzzles.isPowerOfThree(0) + "]");
        //System.out.println("isPowerOfThree(-9): [" + puzzles.isPowerOfThree(-9) + "]");

        System.out.println("firstRunningTotalAbove(10): ["
                 + puzzles.firstRunningTotalAbove(10) + "]");
        System.out.println("firstRunningTotalAbove(-4): ["
                 + puzzles.firstRunningTotalAbove(-4) + "]");
        System.out.println("firstRunningTotalAbove(20): ["
                 + puzzles.firstRunningTotalAbove(20) + "]");
        System.out.println("firstRunningTotalAbove(1): ["
                 + puzzles.firstRunningTotalAbove(1) + "]");
        System.out.println("firstRunningTotalAbove(0): ["
                 + puzzles.firstRunningTotalAbove(0) + "]");

        System.out.println("readUntilSentinel(\"red,blue,stop,green\", \"stop\"): ["
                 + puzzles.readUntilSentinel("red,blue,stop,green", "stop") + "]");
        System.out.println("readUntilSentinel(\"stop,a,b\", \"stop\"): ["
                 + puzzles.readUntilSentinel("stop,a,b", "stop") + "]");
    }
}
