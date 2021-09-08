import java.util.Scanner;

public class Assignment4 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int m1,m2,m3;
        System.out.println("enter the mark of first subject: ");
        m1 = in.nextInt();
        System.out.println("enter the mark of second subject: ");
        m2 = in.nextInt();
        System.out.println("enter the mark of third subject: ");
        m3 = in.nextInt();

        if(m1>60&&m2>60&&m3>60)
            System.out.println("PASSED");
        else if((m1>60&&m2>60)||(m1>60&&m3>60)||(m2>60&&m3>60))
            System.out.println("PROMOTED");
        else
            System.out.println("FAILED");

    }
}
© 2021 GitHub