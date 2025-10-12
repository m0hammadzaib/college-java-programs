import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        boolean sunrise = true;
        if (sunrise) {
            System.out.println("Subha ho gyi maamu");
        }else{
            System.out.println("SO jaa bhai abhi");
        }
        
        // logical operaters
        // &&
        // ||
        // !

        Scanner one = new Scanner(System.in);
        System.out.println("How much money do you have ?");

        int cash = one.nextInt();

        if (cash<50) {
            System.out.println("Hatt gareeb");
        }else{
            System.out.println("How can i help you sir");
        }
    }
}
