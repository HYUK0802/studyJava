package Chapter2.ch08;

public class OrderTest {

    public static void main(String[] args) {

        Order order1 = new Order();
        order1.orderNumber = 20242212;
        order1.phoneNumber = 01033232232;
        order1.address = "대구시 달서구 이곡동";
        order1.orderDate = 20241010;
        order1.orderTime = 121202;
        order1.orderPrice = 100020;
        order1.menuNumber = 1;

        order1.OrderInfo();

        Order order2 = new Order(20123,103322223,"대구시 달서구 용산동",20241102,123010,19199,0002);
        order2.OrderInfo();
    }
}
