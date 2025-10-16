public class errorhandling{
    public static void main(String[]args){
        int[] marks = {24,87,91};

        try{
            System.out.println(marks[5]);
        }catch(Exception exception){
            System.out.println("Galat hai bhai");
        }
    }
}