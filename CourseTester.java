// REQ 03: answer after REQ 02
/*
 * 1. new StudentRecord("Dana Lee") runs a constructor whose only line
 *    is this(name, new int[0]). Which constructor's body finishes
 *    first? Why does only the two-parameter constructor need to set
 *    name and scores?
 *    Answer: the constructor: public StudentRecord(String name, int[] scores) finishes first
 *      because we can always just use "this(...)" to refer back to it, not need to repeat

 *
 * 2. StudentRecord will have both getAverage() and
 *    getAverage(int first, int last). Why does Java allow two methods
 *    with the same name? Why would it reject a third method,
 *    public int getAverage()?
 *    Answer: It has both because given the input, it can identify which method to use
 *          but the third method is exactly the same as the first, so it can't identify which to use
 */
public class CourseTester {
    public static void main(String[] args) {
        StudentRecord john = new StudentRecord("John Doe", new int[] { 80, 90, 100, 95 });
        System.out.println("john.getName() (expect John Doe): " + john.getName());
        StudentRecord dana = new StudentRecord("Dana Lee");
        System.out.println("dana.getScores().length (expect 0): " + dana.getScores().length);
        System.out.println("dana.getName() (expect Dana Lee): " + dana.getName());
        StudentRecord sam = new StudentRecord("Sam Ortiz", null);
        System.out.println("dana.getScores().length (expect 0): " + dana.getScores().length);
    }
}
