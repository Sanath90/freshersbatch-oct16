import java.util.Scanner;

public class Assignment9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] marks = new int[3][3];
        int tmark=0,tsub1=0,tsub2=0,tsub3=0;
        System.out.println("");

        for(int i = 0;i< marks.length;i++)
        {   tmark = 0;
            System.out.println("Entering the details of "+(i+1)+" student. ");
            for (int j=0;j<marks[i].length;j++)
            {
                System.out.println("Enter the mark in subject "+(j+1));
                marks[i][j]= in.nextInt();
                tmark+=marks[i][j];
                if (j==0)
                    tsub1+=marks[i][j];
                else if (j==1)
                    tsub2+=marks[i][j];
                else
                    tsub3+=marks[i][j];
            }

            System.out.println("----------------------------------------------------");
            System.out.println("TOTAL MARKS OBTAINED BY STUDENT "+(i+1)+" is "+tmark);
            System.out.println("AVERAGE MARKS OBTAINED BY STUDENT "+(i+1)+" is "+(tmark/3));
            System.out.println("---------------------------------------------------- \n");

        }
        System.out.println("Total Marks in Subject 1   : " +tsub1 );
        System.out.println("Average Marks in Subject 1 : " +(tsub1/3) );
        System.out.println("Total Marks in Subject 2   : " +tsub2 );
        System.out.println("Average Marks in Subject 1 : " +(tsub2/3) );
        System.out.println("Total Marks in Subject 3   : " +tsub3 );
        System.out.println("Average Marks in Subject 3 : " +(tsub3/3) );
    }
}