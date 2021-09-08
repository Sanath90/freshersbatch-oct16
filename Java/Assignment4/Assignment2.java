package Assignment4;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) throws ArithmeticException{
        try {
            divide();

        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Exception (if any) was handled!!! ");


    }

    private static void divide() throws ArithmeticException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int Dividend = in.nextInt();
        System.out.println("Enter the divisor: ");
        int Divisor = in.nextInt();
        if (Divisor==0)
            throw new UnsupportedOperationException("UnsupportedOperationException catched");
        int result;
        result=Dividend/Divisor;

        //System.out.println("Answer is : "+result);
    }
}