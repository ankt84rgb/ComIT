public class Triangle implements Measurable {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int area() {
        return ((base * height) / 2);
    }
}
