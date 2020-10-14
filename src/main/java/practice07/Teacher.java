package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
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
        if (klass != null){
            return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach Class " + klass.getNumber() + ".";
        }
        else{
            return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach No Class.";
        }

    }

    public String introduceWith(Student studName) {
        if (klass.getNumber() == studName.getKlass().getNumber()){
            return "My name is " + name + ". I am " + age +" years old. I am a Teacher. I teach " + studName.getName() + ".";
        }
        else{
            return "My name is " + name + ". I am " + age +" years old. I am a Teacher. I don't teach " + studName.getName() + ".";
        }
    }
}
