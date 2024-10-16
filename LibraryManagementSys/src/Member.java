public class Member implements MemberIn {
    private int memberId;
    private String memberName;
     static int id=0;

    public Member(String memberName) {
        this.memberName = memberName;
        id+=id;
        this.memberId=id;
    }


    @Override
    public String memberName() {
        return memberName;
    }
}
