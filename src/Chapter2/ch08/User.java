package Chapter2.ch08;

public class User {

    public String name;
    public int height;
    public int weight;
    public int age;
    public String gender;

    public User() {

    }
    public User(String name, int height, int weight, int age, String gender) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }
    public String UserInfo() {
        return "키가 " + height +"이고 몸무게가 " + weight + "킬로인" + gender + "이 있습니다. 이름은 " + name + "이고 나이는 " + age +"입니다.";
    }
}
