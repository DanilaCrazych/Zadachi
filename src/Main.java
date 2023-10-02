import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BaseOfData bd = new BaseOfData("");
        Administrator administrator = new Administrator();
        Work work = new Work();


        while (true) {
            System.out.println("Выбор роли\n1.Меннеджер\n2.Исполнитель\n3.Администратор");
            switch (scan.nextInt()) {
                case (1):

                    System.out.println("Введите имя: ");
                    String login = scan.next();
                    bd.auth(login);
                    if (bd.access = true) {
                        work.rabotaMen(login);
                    }
                    break;

                case (2):
                    break;

                case (3):
                    bd.addmennagers();
                    break;
            }

        }


    }

}