package Chapter3.ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar() {
        System.out.println("시동을 겁니다.");
    }
    public void stopCar() {
        System.out.println("시동을 끕니다.");
    }
    public void washCar() {}
    final void run() {
        startCar();
        drive();
        wiper();
        stop();
        stopCar();
        washCar();
    }
}
