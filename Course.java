public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents){
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName){
        this(courseName, new StudentRecord[0]);
    }

    public String getCourseName(){
        return courseName;
    }
    public StudentRecord[] getEnrolledStudents(){
        return enrolledStudents;
    }

    public String toString(){
        String name = "";
        name = "== " + courseName + " ==\n";
        for (int i = 1; i <= enrolledStudents.length; i++){
            name = name + i + ".) " + enrolledStudents[i-1];
            if (i-1 < enrolledStudents.length){
                name += "\n";
            }
        }

        //why not getEnrolledStudents
        return name;
    }

    public String findBestStudent(){
        StudentRecord best = enrolledStudents[0];
        //why do I need StudentRecord best and not just enrolledstudents <= etc
        for (int i = 0; i < enrolledStudents.length -1; i++){
            if (best.getTestScore(i) < enrolledStudents[i + 1].getTestScore(i)){
                best = enrolledStudents[i + 1];
            }
       }
        return best.getName();
    }

    public double calculateTestAverage(int testNumber){
        int totalSum = 0;
        for (int i = 0; i < enrolledStudents.length; i++){
            totalSum = totalSum + enrolledStudents[i].getTestScore(testNumber);
        }
        // wy need enrolledStudents[i]
        double average = 0;
        average = (double) totalSum/enrolledStudents.length;
        return average;
    }





}
