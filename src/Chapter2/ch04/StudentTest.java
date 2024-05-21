package Chapter2.ch04;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student();

        student.studentID = 12345;
        student.studentName = "김재혁";
        student.address = "대구 달서구";

        student.showStudentInfo();

        Student student1 = new Student();

        student.studentID = 54321;
        student.studentName = "김혀";
        student.address = "대구 달서구";

        student.showStudentInfo();


    }
}
