package practice10;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

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


    public String introduce() {
        if (klass.getLeader() != this){
            return "My name is " + name + ". I am " + age + " years old. I am a Student. I am at Class " + klass.getNumber() + ".";
        }
        else{
            return "My name is " + name + ". I am " + age + " years old. I am a Student. I am Leader of Class " + klass.getNumber() + ".";
        }
    }
}
