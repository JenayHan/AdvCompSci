/*
 * REQ 01: answer both questions before you write any other code.
 *
 * 1. What does Integer.parseInt("007") + 1 evaluate to? What does
 *    "007" + 1 evaluate to? Explain why the two answers differ.
 *    Answer: The first evluates to 8, but the second evlautes to 0071 
 *      because java treats the second sentence as a String once it sees a String
 *
 * 2. After Integer points = null; runs, what happens when Java runs
 *    int total = points + 5; ? Explain why.
 *    Answer: Java can't add an object with a primitive type
 *      so it must take the int value of the points, but this will crash because points is null. 
 */
public class QuizScoreTester {
    public static void main(String[] args) {
        System.out.println("toDouble(\"3.5\") (expect 3.5): " + ParseTools.toDouble("3.5"));
        System.out.println("toDouble(\"-12\") (expect -12.0): " + ParseTools.toDouble("-12"));
    }
}
