package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Conditional {
    public void whileExmp1( int first, int second) {
        while (first > second) {
            System.out.println("first + second =" + (first + second));
            first--;
        }
        System.out.println("Exited");
    }

    public static void whileExmpl2(){
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        while (!exit.equals("x")){
            System.out.println(" Enter 'x' for exit.");
            exit = scanner.next();
        }
    }

    public void doWhileExmText (String text, int counter){
        do {
            System.out.println(text);
            counter--;
        } while (counter > 0);
        System.out.println("End");
    }
    public static void forExmpl1(int counter) {
        for (int i = 0; i < counter; i++) {
        // ctrl + shift + enter создает к-ю для for ()
            System.out.println("counter :" + counter);
        }
    }
    public static void forChangeWithWhile (int counter){
        int i = 0;
        while (i < counter){
            System.out.println("counter:" + counter);
            i++;
        }
    }
    public void forExmpl2(int[] array){
        System.out.println("Array length is:" + array.length);
        System.out.println("Receive array is: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] *= 5;
            System.out.println("Index of Array is: " + i);
            System.out.println("Changed array is (in process): " + Arrays.toString(array));
        }
        System.out.println("Changed array is: " + Arrays.toString(array));
    }


}


