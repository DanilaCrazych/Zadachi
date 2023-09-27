import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BD bd = new BD("", 0);
        Administrator administrator = new Administrator();
        Work work = new Work();


        while (true) {
            System.out.println("Выбор роли\n1.Меннеджер\n2.Исполнитель\n3.Администратор");
            switch (scan.nextInt()) {
                case (1):
//                    System.out.println("Введите имя: ");
//                    String name = scan.next();
                    bd.auth();

                    break;

                case (2):
                    break;

                case (3):

                    administrator.DobavlenieM();


                    break;
            }

        }
    }
}