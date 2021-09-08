package Assignment7;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface Execute{
    int sequence();
}
public class Assignment71 {

    public static void main(String[] args) {

        /*//Class c = this.getClass();
        Annotation an = getAnnotation(Execute.method);
        Execute e = (Execute) an;*/



    }
    @Execute( sequence = 2)
    public static void method1(){
        System.out.println("Executing method1");
    }
    @Execute( sequence = 1)
    public static void method2(){
        System.out.println("Executing method2");
    }
    @Execute( sequence = 3)
    public static void method3(){
        System.out.println("Executing method3");
    }
}