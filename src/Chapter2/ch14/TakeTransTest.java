package Chapter2.ch14;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Hyuk", 15000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        studentJ.takeBus(bus100);
        studentT.takeBus(bus500);

        Subway greenSubway = new Subway(2);
        studentT.takeSubway(greenSubway);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();
        bus500.showBusInfo();
        greenSubway.showBusInfo();
    }




}
