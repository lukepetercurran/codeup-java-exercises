package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1.getArea()); //should be 20
        System.out.println(box1.getPerimeter()); //should be 18
        Rectangle box2 = new Square(5);
        System.out.println(box2.getArea()); //should be 25
        System.out.println(box2.getPerimeter()); //should be 20
    }

}
