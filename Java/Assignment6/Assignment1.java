package Ass6;

import java.util.*;

class contact{
    long phnumber;
    String name;
    String email;
    enum gender{
        male,female;
    }
    gender g1;

    public contact(long phnumber, String name, gender g1) {
        this.phnumber = phnumber;
        this.name = name;
        this.g1 = g1;
    }

    public long getPhnumber() {
        return phnumber;
    }

    public String toString(){
        return "Contact: " + this.name +" phone no: "+this.getPhnumber();
    }
}
public class Assignment1 {

    public static void main(String[] args) {
        long mnumber = 987660;
        TreeMap<Long,contact> TreeMap1 = new TreeMap<>(Collections.reverseOrder());
        contact[] contacts=new contact[10];
        long j = 80;
       /* for (int i=0;i<10;i++)
        {
            contacts[i] = new contact();
            contacts[i].phnumber=mnumber++;
            TreeMap1.put(j++,contacts[i]);
        }*/
        TreeMap1.put(10L,new contact(987654321,"rahul", contact.gender.male));
        TreeMap1.put(20L,new contact(987637342,"tanishka", contact.gender.female));

        System.out.println(TreeMap1.keySet());  //printing keys
        /*for(contact c :TreeMap1.values())
            System.out.println(c.name+" "+c.getPhnumber()+" "+c.g1);*/
        System.out.println(TreeMap1.values());  //printing values
        System.out.println(TreeMap1);  //printing both

        Iterator it = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
       /* for (Iterator i:it
             ) {
        }*/


    }
}