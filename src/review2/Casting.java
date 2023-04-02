package review2;

public class Casting {
    public static void main(String[] args) {
        System.out.println();

        /* Casting - convert 1 data type into another.
        */

        // widening ging from small to big
        double d = 5;
        System.out.println(d);// 5.0

        // narrowing going from big to small.
        int i = (int)5.0;
        System.out.println(i);//5

        byte b = (byte)128;
        System.out.println(b); //-128
    }
}
