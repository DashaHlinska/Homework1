package lesson4;

public class Main {
    public static void main(String[] args) {
        Conditional conditional = new Conditional();
//conditional.whileExmp1(10,5);
//conditional.doWhileExmText("do-while", 12);
//shift+f6 переименование переменных
// Conditional.forExmpl1(10);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {10, 20, 30, 40, 50, 60, 70};
        //conditional.forExmpl2(array);
        //conditional.forExmpl2(array2);
        ifExmpl(21);
        ifExmpl2(18);
        ifExmpl3(15);
        continueBreakReturnExmpl(array);
    }

    private static void ifExmpl(int age) {
        if (age < 18) {
            System.out.println("You are so yang");
        } else {
            System.out.println("Can buy cigarettes");
        }
    }

    private static void ifExmpl2(int age) {
        if (age < 18) {
            System.out.println("You are so yang");
        }
        if (age < 21) {
            System.out.println("Can buy cigarettes");
        }
        if (age >= 21) {
            System.out.println("Can buy cigarettes and alcohol");
        }

    }
    private static void ifExmpl3 (int age){
        String result = age > 18 ? "You`re welcome" : "Don`t have access";
        System.out.println(result);

    }

    private static void continueBreakReturnExmpl(int[] array){
        for (int i = 0; i < array.length ; i++) {
            if (i % 2 == 0){
                continue;
            }
            if (i == 5){
                break;
            }
            if (i == 6){
                return;
            }
            System.out.println("Index is: " + i);
        }
        System.out.println("Exited");

    }
}