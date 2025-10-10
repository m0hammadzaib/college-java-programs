import java.util.Arrays;

public class Array {
    public static void main(String[]args){

     int[] marks = new int[3];
     marks[0] = 23;
     marks[1] = 45;
     marks[2] = 71;
     
     System.out.println(marks[2]);
     System.out.println(marks.length);
     
     Arrays.sort(marks);

     System.out.println(Arrays.toString(marks));
     
    }
}
