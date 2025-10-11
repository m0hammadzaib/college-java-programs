public class Casting {
    public static void main(String[] args) {

        double price = 100.00;
        double finalprice = price + 18;
        System.out.println(finalprice);

        int p = 100;
        int Fp = p +(int)18.0;
        System.out.println(Fp);

        // constants
        final float  PI = 3.14F;
        PI = 1.3F; //it will give an error coz the PI is using final keyword
    }
}
