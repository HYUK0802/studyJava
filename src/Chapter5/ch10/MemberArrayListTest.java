package Chapter5.ch10;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김재혁");
        Member memberHong = new Member(1003, "홍길동");
        Member memberKang = new Member(1004, "강감찬");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberHong);
        memberArrayList.addMember(memberKang);

        memberArrayList.showAllMember();
        memberArrayList.removeMember(memberKang.getMemberId());
        memberArrayList.showAllMember();
    }
}
