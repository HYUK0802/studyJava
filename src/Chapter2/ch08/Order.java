package Chapter2.ch08;

public class Order {

    public int orderNumber;
    public int phoneNumber;
    public String address;
    public int orderDate;
    public int orderTime;
    public int orderPrice;
    public int menuNumber;

    public Order() {

    }

    public Order(int orderNumber, int phoneNumber, String address, int orderDate, int orderTime, int orderPrice, int menuNumber) {
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuNumber = menuNumber;
    }
    public void OrderInfo() {
        System.out.println("주문 접수 번호 :" + orderNumber);
        System.out.println("주문 핸드폰 번호 :" + phoneNumber);
        System.out.println("주문 집 주소 :" + address);
        System.out.println("주문 날짜 :" + orderDate);
        System.out.println("주문 시간 :" + orderTime);
        System.out.println("주문 가격 :" + orderPrice);
        System.out.println("주문 번호 :" + menuNumber);
    }
}
