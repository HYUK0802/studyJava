package Chapter5.ch13;

import Chapter5.ch13.Member;

import java.util.TreeSet;


public class MemberTreeSetTest {

    public static void main(String[] args) {


        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김재혁");
        Member memberHong = new Member(1003, "홍길동");
        Member memberKang = new Member(1004, "강감찬");


        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberHong);
        memberTreeSet.addMember(memberKang);

        memberTreeSet.showAllMember();


    }
}
