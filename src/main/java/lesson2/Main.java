package lesson2;

import java.util.Arrays;

public class Main {
    /**
     * @param args
     * 1
     * 2
     */
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int a = 1;
        System.out.println(a--);
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(a++);
        System.out.println(--a);

        System.out.println("Задание №2");

        byte i = 1;
        char g = (char) i;
        short f = 3;
        byte s = (byte) f;
        char e = (char) f;
        float r = 2.47f;
        char w = (char) r;
        char q = 's';
        byte ii = (byte) q;
        long dd = 2;
        float ff = dd;
        double as = ff;
        double as2 = 2.456;
        float gf = (float) as2;

        System.out.println("g:" + g);
        System.out.println("s:" + s);
        System.out.println("w:" + w);
        System.out.println("ii:" + ii);

        System.out.println("Задание №3");
        byte aa = 2;
        short sb = 5;
        int hg = 8;
        float jh = 5.2456f;
        float lf = 65.256f;
        float ld = 236.23f;

        int fd = aa;
        int gfd = sb;
        float bv = hg;
        double lc = jh;
        double ms = lf;
        double pb = ld;

        double totalValue = fd + gfd + bv + lc + ms + pb;
        String concatString = totalValue + "";
        System.out.println(concatString);

        var s1 = String.valueOf(fd + gfd + bv + lc + ms + pb);
        System.out.println(s1);

        System.out.println("Задание №4");
//        линейный комментарий
        int qq = 1/*,ss = 2, ff = 3*/;
        // TODO: 23.06.2020

        System.out.println("Задание №5");

        int [] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("ints.lenght:"+ ints.length);
        System.out.println(Arrays.toString(ints));
        ints[0] = ints[0] - 2;
        ints[1] = ints[1] * 2;
        ints[2] = ints[2] - 2;
        ints[3] = ints[3] * 2;
        ints[4] = ints[4] - 2;
        ints[5] = ints[5] * 2;
        ints[6] = ints[6] - 2;
        ints[7] = ints[7] * 2;
        ints[8] = ints[8] - 2;
        ints[9] = ints[9] * 2;
        System.out.println(Arrays.toString(ints));

        System.out.println("Задание №6");

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(arr));
        int tempVar = arr[0][0];
        arr[0][0] = arr[2][2];
        arr[2][2] = tempVar;
        int tempVar1 = arr[0][1];
        arr[0][1] = arr[2][1];
        arr[2][1] = tempVar1;
        int tempVar2 = arr[0][2];
        arr[0][2] = arr[2][0];
        arr[2][0] = tempVar2;
        int tempVar3 = arr[1][0];
        arr[1][0] = arr[1][2];
        arr[1][2] = tempVar3;
        System.out.println(Arrays.deepToString(arr));






    }
}
