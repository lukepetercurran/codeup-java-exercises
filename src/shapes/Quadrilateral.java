package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected int width;
    protected int length;

    public Quadrilateral(int width, int length) {
        this.width = width;
        this.length = length;
    }

}
