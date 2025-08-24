public class Square extends Shape {
    protected int side;
    void setSide(int side){ this.side = side; }
    int area(){ return side*side; }
}