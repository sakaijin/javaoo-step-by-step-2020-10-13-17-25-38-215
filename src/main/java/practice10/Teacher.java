package practice10;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teacher extends Person{

    private Klass klass;
    LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name,age);
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (classes != null && classes.size() > 0){
            String result = "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach Class ";
            for(Klass klass: classes){
                if (classes.getLast().equals(klass)){
                    result += klass.getNumber();
                }else{
                    result += klass.getNumber() + ", ";
                }
            }
            return result + ".";
        }
        else{
            return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student studName) {
        if (classes.stream().anyMatch(stud -> stud.equals(studName.getKlass()))){
            return "My name is " + name + ". I am " + age +" years old. I am a Teacher. I teach " + studName.getName() + ".";
        }
        else{
            return "My name is " + name + ". I am " + age +" years old. I am a Teacher. I don't teach " + studName.getName() + ".";
        }
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student studnName) {
        return classes.stream().anyMatch(stud -> stud.equals(studnName.getKlass()));
    }
}
