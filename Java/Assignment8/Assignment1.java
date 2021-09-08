package Assignment8;
@FunctionalInterface
interface Arthemetic{
    public int operation(int a, int b);
}
public class Assignment1 {
    public static void main(String[] args) {

        Arthemetic add=(int a, int b)->a+b;
        System.out.println("Sum: "+add.operation(7,3));


        Arthemetic s = (int val1, int val2)->val1-val2;
        System.out.println("Difference: "+s.operation(7,3));

        Arthemetic m = (int val1, int val2)->val1*val2;
        System.out.println("Product: "+m.operation(7,3));

        Arthemetic d = (int val1, int val2)->val1/val2;
        System.out.println("Division result: "+d.operation(7,3));
    }
}