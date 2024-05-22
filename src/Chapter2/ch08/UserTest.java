package Chapter2.ch08;

public class UserTest {
    public static void main(String[] args) {

        User userKim = new User();
        userKim.name = "김재혁";
        userKim.height = 175;
        userKim.weight = 70;
        userKim.age = 27;
        userKim.gender = "남성";

        System.out.println(userKim.UserInfo());

        User userLee = new User("Lee",165,46,25,"여성");
        System.out.println(userLee.UserInfo());
    }
}
