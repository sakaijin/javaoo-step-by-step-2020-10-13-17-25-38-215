package practice10;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList<Klass> klasses;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        if (klasses != null && klasses.size() > 0) {
            return  "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach Class " + formatAllClasses() + ".";
        }
        return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        if (klasses.stream().anyMatch(klass -> klass.equals(student.getKlass()))) {
            return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach " + student.getName() + ".";
        }
        return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public LinkedList<Klass> getClasses() {
        return klasses;
    }

    public boolean isTeaching(Student student) {
        return klasses.stream().anyMatch(klass -> klass.equals(student.getKlass()));
    }

    private String formatAllClasses(){
        return klasses.stream().map(Klass::getNumber).map(String::valueOf).collect(Collectors.joining(", "));
    }
}
