package Chapter5.ch12;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김재혁");
        Member memberHong = new Member(1003, "홍길동");


        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberHong);

        Member memberKang = new Member(1003, "강감찬");
        memberHashSet.addMember(memberKang);

        memberHashSet.showAllMember();


    }
}
