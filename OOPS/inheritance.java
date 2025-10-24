// class shape{
//     String color;
// }
// class triangle extends shape {

// }
class shape{
    public void display(){
        System.out.println("Display area");
    }
}
class triangle extends shape {
public void display(int l,int h){
System.out.println(1/2*l*h);
}
}
class hexagon extends triangle {
public void display(int l,int h){
System.out.println(1/2*l*h);
}
}

public class inheritance {
    public static void main(String[] args) {
        //  triangle t = new triangle();
        //  t.color = "black";
        // System.out.println(t.color);
    }
}
