public class Rectangle {
    int length, breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(int length) {
        this.length = length;
        this.breadth = length;
    }

    void calculate() {
        System.out.println("Area: " + (length * breadth));
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5,2);
        Rectangle rectangle3 = new Rectangle(5);

        rectangle.calculate();
        rectangle2.calculate();
        rectangle3.calculate();
    }
}
