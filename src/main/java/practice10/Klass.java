package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> students = new ArrayList<>();

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

    public void appendMember(Student student){
        this.students.add(student);
    }

    public void assignLeader(Student leader) {
        if (students.stream().anyMatch(student -> student.getName().equals(leader.getName()))){
            this.leader = leader;
        }else{
            System.out.print("It is not one of us.\n");
        }
    }
}
