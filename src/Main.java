import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BaseOfData bd = new BaseOfData("");
        Administrator administrator = new Administrator("", "");
        Work work = new Work();

        while (true) {
            System.out.println("Выбор роли\n1.Меннеджер\n2.Исполнитель\n3.Администратор");
            System.out.println(bd.mennagers.size());
            switch (scan.nextInt()) {
                case (1):
                    if (bd.mennagers.size() == 0) {
                        System.out.println("Сптсок меннеджеров пуст! ");
                    } else {
                        System.out.println("Введите имя: ");
                        String login = scan.next();
                        bd.auth(login);
                        if (bd.access == true) {
                            work.rabotaMen(login);
                        }
                    }
                    break;

                case (2):
                    if (bd.ispolnitel.size() == 0) {
                        System.out.println("Список исполнителей пуст!");
                    } else {
                        System.out.println("Введите имя: ");
                        String login = scan.next();
                        bd.authIsp(login);
                        if (bd.access == true) {
                            work.rabotaMen(login);
                        }
                    }
                    break;

                case (3):
                    administrator.addministrator();
                    System.out.println("Login: ");
                    String login = scan.next();
                    System.out.println("Password: ");
                    String password = scan.next();
                    administrator.auth(login, password);
                    if (administrator.access == true) {
                        System.out.println("Выберите действие:  1.Добавление");
                        switch (scan.nextInt()) {
                            case (1):
                                administrator.dobavlenie();
                                break;
                        }
                    } else {
                        System.out.println("неверный логин или пароль!");
                    }
                    break;
            }

        }


    }

}