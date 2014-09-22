import java.util.Scanner;

class Max4 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }
    public static void main(String[] args) {
        System.out.println("max4(1,2,3,4) = " + max4(1,2,3,4));
        System.out.println("max4(1,2,4,3) = " + max4(1,2,4,3));
        System.out.println("max4(1,4,2,3) = " + max4(1,4,2,3));
        System.out.println("max4(4,1,2,3) = " + max4(4,1,2,3));
        System.out.println("max4(2,2,2,3) = " + max4(2,2,2,3));
        System.out.println("max4(2,2,2,0) = " + max4(2,2,2,0));
        System.out.println("max4(0,0,0,0) = " + max4(0,0,0,0));
    }
}
