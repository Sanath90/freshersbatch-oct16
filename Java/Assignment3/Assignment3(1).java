import java.util.Locale;

public class Assignment3 {

    public static void main(String[] args) {

        String s = "Java String pool refers to a collection of Strings which are stored in heap memory";
        System.out.println("Lowercase: "+s.toLowerCase());  //1
        System.out.println("uppercase: "+s.toUpperCase());  //2
        //String s1= s.replace('a','$');
        System.out.println("'a' replaced with '$: "+s.replace('a','$'));  //3
        System.out.println("Contains 'collection':  "+s.contains("collection"));  //4
        String s1= "java string pool refers to a collection of strings which are stored in heap memory";
        System.out.println("equal or not:  "+s.equals(s1));
        System.out.println("equal or not:  "+s.equalsIgnoreCase(s1)); //6



    }
}
