package Chapter5.ch13;

import Chapter5.ch08.Point;

public class Member implements Comparable<Member> {

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
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member)obj;
            if (this.memberId == member.memberId) {
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public String toString() {
        return memberName + "회원님의 아이디는 " + memberId + "입니다. ";
    }


    @Override
    public int compareTo(Member member) {

        if (this.memberId > member.memberId) {
            return -1;
        }
        else if (this.memberId < member.memberId)
        {
            return 1;
        } else {
            return 0;

        }

    }
}
