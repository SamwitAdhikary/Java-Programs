class A {
    int i, j;
    void showij() {
        System.out.println("i: " + i + " j: " + j);
    }
}

class B extends A {
    int k;
    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("Sum of i+j+k: " + (i+j+k));
    }
}


public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOB = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        subOB.i = 7;
        subOB.j = 8;
        subOB.k = 9;
        System.out.println("Contents of subOB: ");
        subOB.showij();
        subOB.showk();
        System.out.println();
        subOB.sum();
    }
}
