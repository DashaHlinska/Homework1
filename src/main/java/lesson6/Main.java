package lesson6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Задание №1");
        String str = " Hillel is my feature. I will be developer ";
        System.out.println("str is empty: " + str.isEmpty());
        System.out.println("str.lenght: " + str.length());
        System.out.println("str.trim.lenght:" + str.trim().length());
        char[] chars = str.toCharArray();
        System.out.println("chars [23]: " + chars[23]);
        System.out.println("Last word: " + str.substring(32, 42));
        str = str.trim();
        str += "!";
        System.out.println(str);

        String str2 = "Hillel is my feature. I will be DEVELOPER!";
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println("str.toLowerCase: " + str.toLowerCase());
        System.out.println("str.toUpperCase: " + str.toUpperCase());

        System.out.println("Задание №2");
        char unicode = 11302;
        System.out.println("unicode: " + unicode);
        unicode = 11495;
        System.out.println("unicode: " + unicode);
        unicode = 11532;
        System.out.println("unicode: " + unicode);
        unicode = 20214;
        System.out.println("unicode: " + unicode);
        unicode = 12335;
        System.out.println("unicode: " + unicode);


        System.out.println("Задание №3");
        write();
        read();

        System.out.println("Задание №4");
        registration();

        System.out.println("Задание №5");
        login();

    }
    private static void write() throws IOException {
        String path = "src/main/resources/стих.txt";
        Path pathToFile = Paths.get(path);
        if (Files.exists(pathToFile.getParent())) {
            System.out.println("Cтих успешно записан");
        }
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write("Будь вечным лето, всё бы погорело,\n" +
                "Будь вечной осень, всё бы отсырело,\n" +
                "Зимою вечной всё б оледенело,\n" +
                "Вот вечная весна – другое дело.\n" );
        fileWriter.close();
    }
    private static void read () throws IOException {
        String path = "src/main/resources/стих.txt";
        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        fileReader.close();
        scanner.close();

    }
    private static void registration() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String username = sc.nextLine();
        System.out.println("Введите новый пароль: ");
        String password = sc.nextLine();
        System.out.println("Введите пароль повторно: ");
        String passwordchek = sc.nextLine();


        if (password.equals(passwordchek)){
            String fileName = "src/main/resources/users.txt";
            Path pathToFile = Paths.get(fileName);
            if (!Files.exists(pathToFile.getParent())){
                Files.createDirectories(pathToFile.getParent());
            }
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write( username + "\n" +
                    password + "\n");
            System.out.println("Поздравляем! Вы зарегистрированы!");
            fileWriter.close();

        }
        else {
            System.out.println("Пароль не подтвержден, проверьте написание");

        }
    }
    private static void login () throws IOException {
        String fileName = "src/main/resources/users.txt";
        Path pathToFile = Paths.get(fileName);
        if (!Files.exists(pathToFile.getParent())){
           return;
        }

        Scanner sc = new Scanner(System.in);
        int tryNumber = 3;

        while (tryNumber >= 1){
        System.out.println("Введите имя пользователя: ");
        String username = sc.nextLine();
        System.out.println("Введите пароль: ");
        String password = sc.nextLine();

        FileReader fileReader = new FileReader(fileName);
        Scanner scannerLogin = new Scanner(fileReader);
        while (scannerLogin.hasNextLine()) {
            String login = scannerLogin.nextLine();
            String pass = scannerLogin.nextLine();

            if (username.equalsIgnoreCase(login)) {
                if (password.equalsIgnoreCase(pass)) {
                    System.out.println("Добро пожаловать, " + username + "!");
                    return;
                }
            }

        }
        System.out.println("Данные не верны! Осталось " + (tryNumber - 1) + " попытки");
        tryNumber --;

        fileReader.close();
        scannerLogin.close();
        }
        System.out.println("Попытки исчерпаны. Попробуйте позже.");


    }


}

