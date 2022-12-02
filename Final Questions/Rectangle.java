public class Rectangle {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean contains(double x, double y) {
        if (x > x1 && x < x2
                && y > y1 && y < y2) {
            return true;
        } else {
            return false;

        }
    }

    @Override
    public String toString() {

        String str = String.format("(%.1f,%.1f),(%.1f,%.1f)", x1, y1, x2, y2);
        return str;
    }

    public static void main(String[] args) {

        Rectangle Rectangle1 = new Rectangle(0, 0, 2, 4);
        boolean contains1 = Rectangle1.contains(1, 1);
        Rectangle Rectangle2 = new Rectangle(0, 0, 3, 5);
        boolean contains2 = Rectangle2.contains(4, 5);
        System.out.println(contains1?"Testing point(1,1) is inside of Rectangle1 "+Rectangle1:"Testing point(1,1) is outside of Rectangle1 "+Rectangle1);
        System.out.println(contains2?"Testing point(4,5) is inside of Rectangle2 "+Rectangle2:"Testing point(4,5) is outside of Rectangle2 "+Rectangle2);
    }

}
