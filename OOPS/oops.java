class student{
    String name;
    int age;

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class oops {
    public static void main(String[] args) {
        student boy = new student("Zaib", 21);
        student girl = new student("Aliya", 22);

        boy.info();
        girl.info();
    }
}
