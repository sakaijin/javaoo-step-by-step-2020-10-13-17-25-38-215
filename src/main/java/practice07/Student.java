package practice07;

public class Student extends Person{

    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old. I am a Student. I am at Class " + klass.getNumber() + ".";
    }
}
