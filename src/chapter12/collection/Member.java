package chapter12.collection;

import java.util.Collection;

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

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + "입니다";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;

            if (this.memberId == member.memberId) {
                return true;
            }
            return false;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }


    @Override
    public int compareTo(Member member) {
        // 양수를 어떻게 만들어서 반환할 것인가 (기존에 있는 것이 더 크게 만들고 싶기 때문에 오름차순 정렬)
        return (this.memberId - member.memberId);
    }
}
