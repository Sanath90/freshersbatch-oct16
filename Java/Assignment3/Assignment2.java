public class Assignment2 {

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("StringBuffer");
        /*1st question on StringBuffer*/
        System.out.println("string:  "+s);
        System.out.println("Using append function: "+s.append("is a peer class of String."));
        System.out.println("Using append function again: "+s.append("that provides much of"));
        System.out.println("Using append function again: "+s.append("the functionality of string."));

        /*2nd question on StringBuffer*/
        StringBuffer s1 = new StringBuffer("it is used to at the specific position.");
        System.out.println("string:  "+s1);
        System.out.println("Using  insert function: "+s1.insert(13,"insert text "));

        /*3rd question on stringBuffer*/

        StringBuffer s2 = new StringBuffer("this method returns reversed string");
        System.out.println("Using revers function: "+s2.reverse());



        //stringbuilder is same as string buffer



    }
}