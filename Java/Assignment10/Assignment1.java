package Assignment10;

import java.util.function.Consumer;
class Si{
    int princple;
    double rate;
    int time;

    public Si(int princple, double rate, int time) {
        this.princple = princple;
        this.rate = rate;
        this.time = time;
    }
}
public class Assignment1 {

    public static void main(String[] args) {

        Si obj1 = new Si(123000,5.2,10);

        Consumer<Si> calculate = p->{
            var tamt=p.time*p.princple* p.rate;
            tamt/=100;
            System.out.println(t);};
        calculate.accept(obj1);
    }
}