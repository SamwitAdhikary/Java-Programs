class Number {
    double real, img;

    Number(double r, double i) {
        this.real = r;
        this.img = i;
    }

    public static Number sum(Number c1, Number c2) {
        Number temp = new Number(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
}

class Imaginary extends Number {
    Imaginary(double r, double i) {
            super(r, i);
        }

    public static void main(String[] args) {
        Imaginary c1 = new Imaginary(2.3, 4.2);
        Imaginary c2 = new Imaginary(3.2, 3.5);
        Number temp = sum(c1, c2);
        System.out.println("Sum is: "+ temp.real+" + "+ temp.img +"i");
    }
}