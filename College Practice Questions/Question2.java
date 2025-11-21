// program to print sum of two numbers that is input from user
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int result = a + b;
        System.out.println("Sum is"+" "+result);
    }
}
