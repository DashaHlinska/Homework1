package homework4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        Conditional conditional = new Conditional();
        conditional.whileExmpl1(1);

        System.out.println("Задание №2");
        conditional.forExmpl1(11);

        System.out.println("Задание №3");
        Conditional.whileExmpl2(100, 10);

        System.out.println("Задание №4");
        Conditional.forExmpl2(10);

        int[] array = {1,20,50,135,-4,8,45,-10,54,10};

        System.out.println("Задание №5");
        conditional.ifExmpl1(array);

        System.out.println("Задание №6");
        conditional.ifExmpl2(array);

        System.out.println("Задание №7");
        conditional.exmpl2("Hillel the Best", 5);

        System.out.println("Задание №8");
        conditional.exmpl1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});





    }


}
