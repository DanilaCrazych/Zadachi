import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BaseOfData bd = new BaseOfData("");
        Work work = new Work();
        while (true) {
            System.out.println("Выбор роли\n1.Меннеджер\n2.Исполнитель\n3.Администратор");
            switch (scan.nextInt()) {
                case (1):
                    if (bd.mennagers.size() == 0) {
                        System.out.println("Список меннеджеров пуст! ");
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
                            work.rabotaIsp(login);
                        }
                    }
                    break;

                case (3):
                    System.out.println("Выберите действие: 1.Добавить меннеджера  2.Добавить исполнителя");
                switch (scan.nextInt()){
                    case(1):
                        bd.addmennagers();
                        break;
                    case (2):
                        bd.addispol();
                        break;
                }
                    break;
            }

        }


    }

}