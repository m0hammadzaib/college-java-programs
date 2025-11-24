import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int[] arr = {10, 20, 30, 40, 54};

       System.out.print("Enter number to search: ");
         int target = input.nextInt();

         boolean found = false;
         for(int num:arr){
            if(num == target){
                found = true;
                break;
            }
         }
         if(found){
            System.out.println( "Number found in the array");
         } else {
            System.out.println("Number not found in the array");
         }
    }
}

