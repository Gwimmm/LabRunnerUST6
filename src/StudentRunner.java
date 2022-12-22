public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student("Lauren", "Jim", 202);
        student.addTestScore(95);
        student.addTestScore(98);
        System.out.println(student.getStudentInfo());


    }
}
