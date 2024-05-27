package Chapter2.ch15;

public class TakeTransTest {

    public static void main(String[] args) {
        Student studentK = new Student("Kim", 20000);
        Taxi wellTaxi = new Taxi("잘간다 운수");
        studentK.takeTaxi(wellTaxi);

        studentK.showInfo();
        wellTaxi.showTaxInfo();
    }
}
