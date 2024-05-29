package Chapter2.ch24;

public class StudentSubjectTest {

    public static void main(String[] args) {
        Student studentKim = new Student(1001, "Kim");

        studentKim.addSubject("국어", 100);
        studentKim.addSubject("수학", 50);

        Student studentLee = new Student(1002, "Lee");
        studentLee.addSubject("국어", 70);
        studentLee.addSubject("수학", 85);
        studentLee.addSubject("영어", 100);

        studentLee.showScoreInfo();
        System.out.println("================");
        studentKim.showScoreInfo();
    }
}
