import java.util.ArrayList;
import java.util.Scanner;

public class Administrator {
    boolean access = false;
    String name;
    String password;
    ArrayList<Administrator> administrators = new ArrayList<Administrator>();
    BaseOfData bd = new BaseOfData("");
    Scanner scan = new Scanner(System.in);
    public void addministrator() {
        try {

            administrators.add(new Administrator("Billy","Oralcumshot"));
            System.out.println("Тестовый администратор добавлен!");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    public Administrator(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void dobavlenie() {
        System.out.println("Кого добавить:  1.Меннеджер  2.Исполнитель\n");
        switch (scan.nextInt()) {
            case (1):
                bd.addmennagers();
                System.out.println(bd.mennagers.size());
                break;
            case (2):
                bd.addispol();
                break;
        }
    }

    public void auth(String login, String password) {
        try {
            for (int i = 0; i < administrators.size(); i++) {
                if (administrators.get(i).name.equals(login)&administrators.get(i).password.equals(password)) {
                    access = true;
                } else {
                    access = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
