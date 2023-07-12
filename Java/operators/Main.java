package Java.operators;

public class Main {

    public static void main(String[] args) {
        int var = 10;
        int i = -10;
        System.out.println("i = " + var);
        System.out.println("i2 = " + i);
        int var1 = 10 + 1;
        System.out.println("i7 = " + var1);
        System.out.println();
        int res3 = 10;
        res3 += 2;
        System.out.println(res3);
        int res = 10;
        int res2 = 20;
        System.out.println(res == res2);
        System.out.println(res != res2);
        System.out.println(res > res2);
        System.out.println(res < res2);
        System.out.println(res >= res2);
        System.out.println(res <= res2);
        System.out.println();
        System.out.println("4 & 5 = " + (4 & 5));
        System.out.println("4 | 5 = " + (4 | 5));
        System.out.println("4 ^ 5 = " + (4 ^ 5));
        System.out.println("~1 = " + ~1);
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
        System.out.println((byte) 0b11111110);

    }

}
