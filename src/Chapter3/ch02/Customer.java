package Chapter3.ch02;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer() {

        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public int getCustomerID() {
        return customerID;
    }

    public Customer setCustomerID(int customerID) {
        this.customerID = customerID;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Customer setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public Customer setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
        return this;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public Customer setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
        return this;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public Customer setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
        return this;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
