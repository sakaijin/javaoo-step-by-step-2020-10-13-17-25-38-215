package practice06;

public class Teacher extends Person{
    private String name;
    private int age;
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
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

    public String introduce() {
        if (klass == 0){
            return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach No Class.";
        }
        else{
            return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach Class "+ klass + ".";
        }
    }
}
