public class Shapemain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 3);
        Triangle t = new Triangle(10, 20);
        System.out.println(r.sameArea(t));
    }
}