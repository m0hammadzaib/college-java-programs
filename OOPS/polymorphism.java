class student{
    String name;
    int age;

   public void detail(String name){
     System.out.println(name);
   }
   public void detail(int age){
     System.out.println(age);
   }
   public void detail(String name,int age){
     System.out.println(name+" "+age);
   }
}

public class polymorphism {
    public static void main(String[] args) {
        student boy = new student();
        student girl = new student();

        boy.detail("Zaib", 21);
    }
}
