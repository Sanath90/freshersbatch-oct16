import java.util.Scanner;

public class Assignment7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("enter the number to be searched: ");
        int n = in.nextInt();
    boolean flag = true;
        for (int c:arr)
        {
            if(n==c)
            {
                System.out.println("element found !!");
                System.exit(0);
            }
            else
                flag=false;

        }
        if(!flag)
            System.out.println("Element not found !!");

        }
}