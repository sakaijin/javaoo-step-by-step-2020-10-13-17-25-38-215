package practice05;

public class Student {
    private String name;
    private int age;
    private final int klass;

    public Student(String name, int age, int klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old. I am a Student. I am at Class " + klass + ".";
    }
}
