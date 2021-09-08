abstract class shapes{

    public abstract void draw();
}

class line extends shapes{

    @Override
    public void draw() {
        System.out.println("drawing a line");
    }
}
class Rectangle extends shapes{

    @Override
    public void draw() {
        System.out.println("drawing a rectangle");
    }
}
class circle extends shapes{

    @Override
    public void draw() {
        System.out.println("drawing a circle");
    }
}
public class Assignment4 {
    public static void main(String[] args) {

        shapes rectangle = new Rectangle();
        circle circle1 = new circle();
        shapes line = new line();


        rectangle.draw();;
        circle1.draw();;
        line.draw();
    }
}