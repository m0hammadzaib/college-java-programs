import java.util.Scanner;

public class practiceLoops {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
           
        int value;
        do {
            System.out.println("Input a number");
            value = input.nextInt();
            System.out.println("Your number is : " + value);
        } while (value<100);

        System.out.println("End ho gaya");
    }
}
