package Assignment4;

import java.util.Scanner;

public class Assignment1{
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the divident: ");
            int Dividend = in.nextInt();
            System.out.println("Enter the divisor: ");
            int Divisor = in.nextInt();
            int result;
            result=Dividend/Divisor;

            System.out.println("Answer is : "+result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Exception (if any) was handled!!! ");


    }
}