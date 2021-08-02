public class test{
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 10;

        int sum = (++z)+(y)-(y)+(z)+(x++);
        System.out.println(sum);
    }
}