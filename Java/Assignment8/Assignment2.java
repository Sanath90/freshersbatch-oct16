package Assignment8;

import java.util.ArrayList;
import java.util.List;

class Orders{

    int orderid;
    int orderPrice;
    String status;

    public Orders(int orderid, int orderPrice, String status) {
        this.orderid = orderid;
        this.orderPrice = orderPrice;
        this.status = status;
    }

    /*public void display{
        System.out.println("order id :"+this.orderid+"\norderPrice: "+this.orderPrice+" \norderStatus: "+this.status);
    }*/
    public void display(){
        System.out.println("Orderid:"+this.orderid+"  Price: "+this.orderPrice+"  Status: "+this.status);
    }
}

interface checking{
    public void check(Orders obj);
}
public class Assignment2 {
    public static void main(String[] args) {
        Orders o1 = new Orders(1001,15000,"Accepted");
        Orders o2 = new Orders(1008,21500,"completed");
        Orders o3 = new Orders(1006,7500,"Accepted");
        Orders o4= new Orders(1079,15000,"dispatched");

        checking c1 = (Orders obj)->{
          if (obj.orderPrice>10000&&(obj.status.equalsIgnoreCase("accepted")||obj.status.equalsIgnoreCase("completed")))
              obj.display();
        };

        c1.check(o1);
        c1.check(o2);
        c1.check(o3);
        c1.check(o4);
        /*List<Integer> list = new ArrayList<>();
        list.add(c1.check(o1));
        list.add(c1.check(o2));
        list.add(c1.check(o3));
        list.add(c1.check(o4));
        for (int i=0;i<list.size();i++)
            if (list.get(i)==1)
        System.out.println(list);*/


    }
}