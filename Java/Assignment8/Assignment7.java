package Assignment8;

import java.util.HashMap;
import java.util.Set;

public class Assignment7 {

    public static void main(String[] args) {

        HashMap<Integer,String > hashMap1 = new HashMap<>();

        hashMap1.put(1,"first");
        hashMap1.put(2,"second");
        hashMap1.put(3,"third");
        hashMap1.put(4,"fourth");
        hashMap1.put(5,"fifth");

        Set s = hashMap1.entrySet();
        StringBuilder str = new StringBuilder();

        s.forEach(str1->str.append(str1));

        System.out.println(str);

    }
}