package Assignment5;

class GenericTest<T,K>{
    private T key;
    private K value;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }
}




public class Assignment2{
    public static <T> void main(String[] args) {


        //int key,value;
        int[] key = new int[]{1,2,3,4,5,6,7,8,9,0};
        double[] value = new double[]{0,9,8,7,6,5,4,3,2,1};
        GenericTest<int[], double[]> genericTest1 = new GenericTest<>();
        genericTest1.setKey(key);
        genericTest1.setValue(value);
        for (int k:genericTest1.getKey()
             ) { System.out.println(k);

        }

        for (double k:genericTest1.getValue()
        ) { System.out.println(k);

        }
        //GenericTest<Integer,double> = new GenericTest<>(key,value);


    }
}