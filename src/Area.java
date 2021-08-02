public class Area {
    int length, breadth;
    double radius;

    void area(int length) {
        this.length = length;
        System.out.println("Area of square: " + (length * length));
    }

    void area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Area of rectangle: " + (length * breadth));
    }
    
    void area(double radius) {
        this.radius = radius;
        System.out.println("Area of circle: " + (2 * 3.14 * (radius*radius)));
    }

    public static void main(String[] args) {
        Area obArea = new Area();

        obArea.area(5);
        obArea.area(5, 5);
        obArea.area(5.0);
    }

}
