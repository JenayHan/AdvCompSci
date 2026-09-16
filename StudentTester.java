public class StudentTester {
    public static void main(String[] args) {
        Student Daisy = new Student("Daisy");
        Student Keegan  = new Student("Keegan");
        Student Teris = new Student ("Teris", 7);
        Student Grace = new Student("Grace", 4);
        System.out.println(Daisy.toString());
        System.out.println(Keegan.toString());
        System.out.println(Teris.toString());
        System.out.println(Grace.toString());
        Teris.setGrade(10);
        Grace.setName("Jenay");
        System.out.println("Grade: " + Teris.getGrade());
        System.out.println("Name: " + Grace.getName());
        System.out.println(Grace.equals(Teris));
        

    }
}
