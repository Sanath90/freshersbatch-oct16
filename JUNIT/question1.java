package Javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class result{                       
    int min;
    int max;

    public result(int min, int max) {
        this.min = min;

        this.max = max;
    }
}
class MinMaxFinder{

    public result FindMinMax(int[] a)
    {
        if (a.length==0)
            throw new ArrayStoreException("Array size is zero");

       int [] result = new int[10];
        Arrays.sort(a);
        /*result[0]=a[0];                     //question1 code
        result[1]=a[a.length-1];*/

        /*if (result[0]==result[1])
            throw new ArrayStoreException("all array elements are same..!!");*/
        result r = new result(a[0],a[a.length-1]);
        return r;

    }
}
public class question1 {

}