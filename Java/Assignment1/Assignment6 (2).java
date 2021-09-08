import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        int c=0;
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        String[][] cred = {
                {"user1","pass1"},{"user2","pass2"}
        };
        String uname,pass;

        while(c<=3) {
            if (c==3) {
                System.out.println("Contact ADMIN");
                System.exit(0);
            }
            System.out.println("enter the username:");
            uname= in.next();
            System.out.println("enter the password:");
            pass= in.next();

            for (int i = 0; i < cred.length; i++)
                if (uname.equals(cred[i][0]) && pass.equals(cred[i][1])) {
                    System.out.println("welcome " + cred[i][0]);
                    System.exit(0);
                }
                else {
                    flag=false;
                }
                if (!flag){
                System.out.println("Invalid Credentials! No of attempts left: " + (3 - c - 1));
                c++;
            }
        }

    }
}