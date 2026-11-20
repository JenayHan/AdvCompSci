/*
 * REQ 01: answer both questions after you finish the lab.
 *
 * 1. Work out the tag for dog ID 459 by hand. Show the digit sum,
 *    the character code, and the letter.
 *    Answer: Digit sum = 18, Character code = 78, Letter = N
 *
 * 2. A program builds three dogs and no others, then calls
 *    Dog.getDogsCreated(). What does the call return? What would go
 *    wrong if dogsCreated were not static?
 *    Answer: It returns three. If it were not static, 
 *      then every single "Dog" created is independent. 
 *      It doesn't count a total.
 */
public class DogTester {
    public static void main(String[] args) {
        Dog plain = new Dog();
        System.out.println("new Dog() name (expect Unnamed): " + plain.getName());
        System.out.println("new Dog() tag (expect 100G): " + plain.getDogTag());

        Dog dog = new Dog("Spot", "Sandra", 1, 123);
System.out.println(dog.getName());
System.out.println(dog.getDogTag());
System.out.println(PawesomeUtils.hasValidTag(dog));
System.out.println(Dog.getDogsCreated());
    }
}
