package practice09;

public class Klass {
    int number;
    Student leader;
    Student member;

    public Student getMember() {
        return member;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student member){
        this.member = member;
    }

    public void assignLeader(Student leader) {
        if (leader.equals(member)){
            this.leader = leader;
        }else{
            System.out.print("It is not one of us.\n");
        }
    }
}
