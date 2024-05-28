package Chapter2.ch19;

public class Car {

    private static int serialNumber = 10000;
    private int carNum;

    public Car() {
        serialNumber++;
        carNum = serialNumber;
    }

    public int getCarNum() {
        return carNum;
    }

    public Car setCarNum(int carNum) {
        this.carNum = carNum;
        return this;
    }
}
