package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("What is the radius of said circle?");
        Input in = new Input();

        Circle c = new Circle(in.getDouble());

       System.out.println(c.getArea());
       System.out.println(c.getCircumference());
    }
}
