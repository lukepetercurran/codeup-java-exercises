package shapes;

public class Rectangle {
    protected int _length;
    protected int _width;

    public Rectangle(int l, int w) {
        this._length = l;
        this._width = w;
    }

    public int getArea(){
        return _length * _width;
    }

    public int getPerimeter(){
        return (2 * _length) + (2 * _width);
    }


}
