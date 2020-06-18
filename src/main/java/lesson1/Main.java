package lesson1;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Создайте все известные примитивы и строку двумя разными способами.");

        System.out.println("Hello all");
        String hello = "Hello";
        String hello1 = "Hello";// строка продублирована control + d
        String hello2 = new String("Hello");

        byte byteName = 50;
        short shortName = -2768;
        long longName = 1000000;
        float floatName = 18.98F;
        char charName = 's';
        boolean booleanName = true;
        int first = 23647, second = 83647, third = 448347;
        double first1 = 11.15, second1 = 12.95, third1 = 66.35;

        System.out.println("2. С созданными переменными напишите 10 примеров с двумя любыми арифметическими операциями в каждом.");

        System.out.println(byteName - shortName + longName);
        System.out.println(byteName + 10 / 2 );
        System.out.println((shortName + 2769) * longName);
        System.out.println(first + second - third);
        System.out.println(longName / byteName * 2);
        System.out.println(byteName + first1 - second);
        System.out.println(first1 / 2 - 1);
        System.out.println(second1 / third1 + floatName);
        System.out.println(third1 - second1 + 99.99);
        System.out.println(floatName % 2 + second1);

        System.out.println("3. Напишите 10 примеров с арифметическими операциями с присвоением и выведите результат.");

        int ok = 100;
        ok += 3;
        ok -= 5;
        ok /= 2;
        ok *= 4;
        ok %= 10;
        System.out.println("ok:" + ok);

        double ty = 547.893;
        ty -= 0.67;
        ty += 2.54;
        ty *= 0.67;
        ty /= 2.54;
        ty %= 2;
        System.out.println("ty:"+ ty);

        double ty1 = 547.893;
        ty1 += 0.67;
        ty1 /= 0.67;
        ty1 -= 2;
        System.out.println("ty1:"+ ty1);

        int ii = 10;
        ii += 2;
        System.out.println("ii:" + ii);

        long gg = 1000000;
        gg %= 9;
        System.out.println("gg:" + gg);

        int rr = 999;
        rr -= 998;
        System.out.println("rr:" + rr);

        double ff = 523;
        ff /= 347;
        System.out.println("ff:" + ff);

        int hh = 2;
        hh *= 2;
        System.out.println("hh:" + hh);

        byte bt = 125;
        bt += 2;
        System.out.println("bt:" + bt);

        int df = 652;
        df %= 5;
        System.out.println("df:" + df);

        System.out.println("4. Напишите не менее 5 разных примеров используя логические операции с выводом результатов.");

        System.out.println(gg == rr);
        System.out.println(bt < ty1);
        System.out.println(ty != ff);
        System.out.println(hh <= 2);
        System.out.println(hh >= 5);
        System.out.println(df > 999);

        System.out.println("Line");//проверка изменений















      }
}
