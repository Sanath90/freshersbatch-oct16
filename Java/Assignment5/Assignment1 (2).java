package Assignment5;

import java.util.HashSet;
import java.util.Iterator;

class employee{
    int id;
    String name,dept;
    private double salary;
    HashSet<employee> set1 = new HashSet<>();

    public employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    void displaydetails(){
        System.out.println("name:"+this.name);
        System.out.println("dept:"+this.dept);
        System.out.println("id:"+this.id);
    }
    public <T> void addtoHash(T object){
        set1.add((employee) object);
        System.out.println(set1);
    }
    public String toString(){
        return "Employee name:"+this.name;
    }
}
public class Assignment1 {
    public static void main(String[] args) {

        employee emp1 = new employee(101,"rahul","cse",20000);
        employee emp2 = new employee(102,"raul","cse",20090);
        emp1.addtoHash(emp1);
        emp2.addtoHash(emp2);
        //System.out.println(obj1.size());
    }
}