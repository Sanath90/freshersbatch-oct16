import java.util.Scanner;

public class Armstrong {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);    
        System.out.println("Enter the number to check if it is an ARMSTRONG or not: ");
        int inputNumber= in.nextInt();      
        int rem;
        int temp;
        double sum=0;
        temp = inputNumber;            
        while(inputNumber!=0)
        {
            rem=inputNumber%10;         
            sum=sum+(Math.pow(rem,3));
            inputNumber/=10;

        }
         if (sum==temp){                        
             System.out.println(temp+ " is a ARMSTRONG number..!");
        }
         else {
             System.out.println(temp+ " is not a ARMSTRONG number..!");
         }
    }
}