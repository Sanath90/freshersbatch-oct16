package Assignment7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Date;

class Develpers{
    int DeveloperId;
    String name;
    String supervisor;

    @Info()
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public Develpers(int developerId, String name) {
        DeveloperId = developerId;
        this.name = name;
    }
}


@interface Info{
    int AuthorId() default 0;
    String date() default "00.00.00";
    String time() default "00.00";
    int version()default 0;

}



public class Assignment7 {
    public static void main(String[] args) {


    }
}