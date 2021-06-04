package shapes;

import org.w3c.dom.css.Rect;

public class Rectangle { // your method
//    protected int _length;
//    protected int _width;
//
//    public Rectangle(int l, int w) {
//        this._length = l;
//        this._width = w;
//    }
//
//    public int getArea(){
//        return _length * _width;
//    }
//
//    public int getPerimeter(){
//        return (2 * _length) + (2 * _width);
//    }

    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        // double area = thisgetLength() * this.getWidth();
        // return area;
        return this.getLength() * this.getWidth();
    }

    public double getPerimeter(){
//        double perimeter = (2 * this.getWidth() * (2 * this.getWidth()));
//        return perimeter;
        return (2 * this.getWidth() * (2 * this.getWidth()));
    }
}
