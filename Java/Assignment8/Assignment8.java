package Assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Assignment8 {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(5);
        list1.add(20);
        list1.add(14);
        list1.add(7);
        list1.add(17);
        Consumer<List<Integer>> display = list2->list2.forEach(System.out::println);
        Thread t = new Thread();
        t.run();
    }
}