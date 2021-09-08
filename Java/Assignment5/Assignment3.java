package Assignment5;

public class Assignment3 {
    public static <E> E[] exchArr(E[] arr, int p1, int p2){

    E temp = arr[p1];
    arr[p1]=arr[p2];
    arr[p2]=temp;

    return arr;



    }
    public static void main(String[] args) {

        Integer[] intarr = new Integer[]{2,3,5,4,1,6,9,7,8};
        //Integer[] arr2=exchArr(intarr,0,3);

        for (int i:exchArr(intarr,0,3)
             ) {
            System.out.println(i);

        }
    }



}