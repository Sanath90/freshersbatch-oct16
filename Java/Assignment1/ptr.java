import java.util.Scanner;

public class ptr {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);    //to take input from user
        int p,t;
        float r;
        System.out.println("enter the principle amount:");
        p = in.nextInt();
        System.out.println("enter the rate:");
        r = in.nextInt();
        r/=100;
        System.out.println("enter the time period:");
        t = in.nextInt();
        System.out.println("simple intrest: " +(p*r*t));
        double ci = (p*(Math.pow(1+r,t)))-p;
        System.out.println("Compound intrest: " + ci);
    }
}