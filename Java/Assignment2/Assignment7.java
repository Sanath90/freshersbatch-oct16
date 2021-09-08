import java.util.Scanner;

abstract class dessertItem{                                 //mainclass
    String itemName;
    double cost;

    public abstract double getCost();                          //abstract method for cost

    public dessertItem(String itemName,double cost){            //constructor
        this.itemName=itemName;
        this.cost=cost;
    }
    public void display(){                                         //method to display
        System.out.println(this.itemName+"  :  "+this.getCost());

    }

}
class Candie extends dessertItem{
    public Candie(String itemName, int cost) {
        super(itemName, cost);
    }


    @Override
    public double getCost() {
        return (this.cost*60);
    }
}
class Cookie extends dessertItem{
    public Cookie(String itemName, double cost) {
        super(itemName, cost);
    }

    @Override
    public double getCost() {
        return (this.cost*70);
    }

}
class IceCream extends dessertItem{
    public IceCream(String itemName, double cost) {
        super(itemName, cost);
    }

    @Override
    public double getCost() {
        return this.cost;
    }
}
/*-----------------------------------------------------------------------*/

public class Assignment7 {


    public static void main(String[] args) {
        dessertItem[] candie=new Candie[20];
        dessertItem[] iceCream=new  IceCream[20];
        dessertItem[] cookie= new Cookie[20];
        int userCh;
        int cookieCount=0;
        int candieCount=0;
        int iceCreamCount=0;
        Scanner in = new Scanner(System.in);
        char flag ='y';
        while (flag=='y'){
            System.out.println("1.customer 2.owner");
            
            System.out.println("Enter your choice: ");
            userCh= in.nextInt();
            switch (userCh){
                case 1:
                    int cChoice;
                    System.out.println("hello customer!! What would you like to buy?");
                    displayItems();
                    System.out.println("Enter your choice: ");
                    cChoice=in.nextInt();
                    switch (cChoice){
                        case 1:
                            makeOrder(cookie,cookieCount);
                            break;
                        case 2:
                            makeOrder(candie,candieCount);
                            break;
                        case 3:
                            makeOrder(iceCream,iceCreamCount);

                    }
                    break;

                case 2:
                    int oChoice;
                    System.out.println("hello owner!! What would you like to add?");
                    displayItems();
                    System.out.println("Enter your choice: ");
                    oChoice=in.nextInt();
                    String name;

                    switch (oChoice){
                        case 1:
                            addItem(cookie,cookieCount);
                            cookieCount++;
                            break;
                        case 2:
                            addItem(candie,candieCount);
                            candieCount++;
                            break;
                        case 3:
                            addItem(iceCream,iceCreamCount);
                            iceCreamCount++;
                            break;
                        default:
                            System.out.println("invalid choice..!!");



                    }
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }

            System.out.println("\n\n\nDo you want to continue (y/n):");
            flag= in.next().charAt(0);


        }

    }

    private static void displayItems() {
        System.out.println("choose your item 1.cookie 2.candy 3.ice cream");
       
    }

    private static void addItem(dessertItem[] item,int cookieCount){
        Scanner in = new Scanner(System.in);
        String name;
        int cookieCost;
        System.out.println("enter the name of the item: ");
        name= in.next();
        System.out.println("enter the cost: ");
        cookieCost= in.nextInt();
        item[cookieCount]= new Cookie(name,cookieCost);
    }
    private static void makeOrder(dessertItem[] item,int count)
    {
        if (count<=0) {
            System.out.println("NO MORE ITEM LEFT under selected item. PLease ask OWNER to add some.");

        }
        else{
        Scanner in = new Scanner(System.in);
        System.out.println("AVAILABLE ITEMS:");
        for (int i =0;i< count;i++)
            item[i].display();
        String choice;
        System.out.println("Choose the ITEM you like to buy today :");
        choice= in.next();
        for (int i =0;i< count;i++)
            if (choice.equals(item[i].itemName)) {
                System.out.println("ORDER PLACED");
                System.out.println("Totalcost (Rs): "+item[i].getCost());
                break;
            }
            else{
                System.out.println("invalid choice");
                break;
            }
    }
    }

}