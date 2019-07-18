
//Measuring the area of the shape
public interface Measurable {
    public int area();

    default boolean sameArea(Measurable m2)
    {
        return this.area() == m2.area();
    }
}
