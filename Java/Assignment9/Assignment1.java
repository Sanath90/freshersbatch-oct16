package Assignment9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class fruit{
    String name;int calories;
    int price;
    String color;

    public fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }
}

class News {
    String postedByUser;
    int newsId;
    String comment;
    String commentByUser;

    public News(String postedByUser, int newsId, String comment, String commentByUser) {
        this.postedByUser = postedByUser;
        this.newsId = newsId;
        this.comment = comment;
        this.commentByUser = commentByUser;
    }
}

class Trader{
    String name;
    String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }
}

class Transaction{
    Trader trader;
    int year;
    int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
}
public class Assignment1{

    public static void main(String[] args) {

        List<fruit> fruits = Arrays.asList(
                new fruit("Apple",300,200,"red"),
                new fruit("Orange",39,100,"orange"),
                new fruit("Lemon",140,40,"yellow"),
                new fruit("Banana",40,80,"yellow")

        );
        System.out.println("Fruitnames with low calories in descending order..");
        fruits.stream()
                .filter(p->p.calories<100)
                .sorted((o1, o2) -> (o1.calories> o2.calories)?-1: (o1.calories< o2.calories)?1:0)
                .forEach(p->System.out.println(p.name));
        System.out.println("-----------------------------------------------------");

        System.out.println("color wise list of fruitnames");
        fruits.stream()
                .sorted((o1, o2) -> (o1.color.equals(o2.color))?1:-1)
                .forEach(p->System.out.println(p.name+" "+p.color));

    }
}