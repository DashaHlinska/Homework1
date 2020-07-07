package homework4;

public class Conditional {
    public void whileExmpl1 (int first) {
        while (first <= 10){
            System.out.println(first ++);
        }
    }
    public void forExmpl1 (int second) {
        for (int i = 1; i < second; i++) {
            System.out.println(i);
        }
    }

    public static void whileExmpl2 (int a, int b){
        while (a >= 0){
            System.out.println(a);
            a -= b;
        }
    }
    public static void forExmpl2 (int c) {
        for (int i = 100; i >= 0; i -= c) {
            System.out.println(i);
        }
    }
    public void ifExmpl1 (int [] array) {
        int x = array [0];
        for (int i = 0; i < array.length ; i++){
            if (array [i] >=x) {
                x = array [i];
            }
        }
        System.out.println("Max number:" + x);
    }
    public void ifExmpl2 (int [] array) {
        int y = array [0];
        for (int i = 0; i < array.length ; i++){
            if (array [i] <=y) {
                y = array[i];
            }
        }
        System.out.println("Min number:" + y);
    }
    public void exmpl1 (int [] array) {
        for (int i = 0; i < array.length ; i++) {
            if ((array [i] % 2) == 0) {
                System.out.println(array [i] + " - четное число ");
            }
            else {
                System.out.println(array [i] + " - нечетное число ");
            }

        }
    }
    public void exmpl2 (String text, int a) {
        do {
            System.out.println(text);
        } while (a == 0);

    }

   }


