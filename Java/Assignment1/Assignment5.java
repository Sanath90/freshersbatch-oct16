import java.util.Scanner;

public class Assignment5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your salary: ");
        long sal = in.nextInt();
        double total_sal = sal;
        if (sal>=0&&sal<=180000) {
            System.out.println("tax percentage: nil");
            total_sal=sal;
        }
        else if(sal>=180001&&sal<=300000){
            System.out.println("tax percentage: 10%");
            total_sal=sal-(sal*.1);
        }
        else if(sal>=300001&&sal<=500000){
            System.out.println("tax percentage: 20%");
            total_sal=sal-(sal*.2);
        }
        else if(sal>=500001&&sal<=1000000){
            System.out.println("tax percentage: 10%");
            total_sal=sal-(sal*.3);
        }
        else{
            System.out.println("not defined");
        }
        System.out.println("Total salary after tax deduction:"+total_sal);

    }
}