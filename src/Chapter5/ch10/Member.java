package Chapter5.ch10;

public class Member {

    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public Member setMemberId(int memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getMemberName() {
        return memberName;
    }

    public Member setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    @Override
    public String toString() {
        return memberName + "회원님의 아이디는 " + memberId + "입니다. ";
    }
}
