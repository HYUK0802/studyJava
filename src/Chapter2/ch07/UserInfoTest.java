package Chapter2.ch07;

public class UserInfoTest {
    public static void main(String[] args) {

        UserInfo userKim = new UserInfo();
        userKim.userId = "tig05205";
        userKim.userPassword = "1234";
        userKim.userName ="김재혁";
        userKim.phoneNumber = "01012341234";
        userKim.userAddress = "Daegu, korea";

        System.out.println(userKim.showUserInfo());

        UserInfo userLee = new UserInfo("a1234", "00123", "Lee");
        System.out.println(userLee.showUserInfo());
    }
}
