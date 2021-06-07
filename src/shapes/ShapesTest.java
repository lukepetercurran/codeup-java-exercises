package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea()); //should be 20
//        System.out.println(box1.getPerimeter()); //should be 18
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea()); //should be 25
//        System.out.println(box2.getPerimeter()); //should be 20

        Measurable myShape = new Rectangle(4, 5);
//        Measurable myShape = new Square(5);


        Quadrilateral theirShape = new Rectangle(3,4);

        System.out.println(myShape.getArea()); // should expect 20 for rectangle, 25 for square
        System.out.println(myShape.getPerimeter()); // should expect 18, 20 for square

        System.out.println(theirShape.getLength());
        System.out.println(theirShape.getWidth());
    }

    // TODO: Wht does the code fail to compile if you leave of f the getPerimeter method in Rectangle?
    // Because its defined in the Measurable interface and is an abstract method, its required in
    // Rectangle to show its implementation

    // TODO: What happens if you try to call the getLenght or getWidth methods of the myShape variable? Why?
    // The getters should only be accessible in Quadrilateral because that is where they are defined. Therefore,
    // if we wanted to use these methods we would need to reference the Quadrilateral type.
}

