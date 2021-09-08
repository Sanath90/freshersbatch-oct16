package Assignment5;

import java.util.HashMap;

public class Assignment5 {

    public static void main(String[] args) {
        Double d=0.0;
        HashMap<Integer, Double> hashMap1 = new HashMap<Integer, Double>();
        for (Integer i = 0;i<10;i++)
        {
            hashMap1.put(i,d++);
        }
        System.out.println(hashMap1);
    }

}