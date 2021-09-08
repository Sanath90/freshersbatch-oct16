public class armstrongbetween {

    public static void main(String args[]){
        int rem,temp,i;
        double sum=0;
        System.out.println("Armstrong number between 100 and 999 are: \n");
        for(i =100;i<=999;i++)
        {
            sum=0;
            temp=i;
            //System.out.println(i);
            while(temp!=0)
            {
                rem=temp%10;                           //taking each digit of input
                sum=sum+(Math.pow(rem,3));
                temp/=10;

            }
            if (sum==i){                        //checking if the sum of cubes and the number are same
                System.out.println(i+"\n");
            }

        }


    }
}