package Assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Assignment5 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("hey");
        list1.add("ernesto");
        list1.add("love");
        list1.add("luck");
        list1.add("osmosis");
        Consumer<List<String>> displaylist = list->list.forEach(System.out::println);
        System.out.println("list elements: ");
        displaylist.accept(list1);
        StringBuilder s1 = new StringBuilder();
        Consumer<List<String>> modify = list2->list2.forEach(s ->s1.append(s.charAt(0)));
        modify.accept(list1);

        System.out.println("String with first letter of list elements:");
        System.out.println(s1);


    }
}