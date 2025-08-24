
public class Demo05 {
   
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setWidth(5); r.setHeight(4);
        System.out.println(r.area()); // 20
        Square s = new Square();
        s.setSide(4);
        System.out.println(s.area());    // 16
    }
}
