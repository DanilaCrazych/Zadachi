import java.util.ArrayList;
import java.util.Scanner;

public class BaseOfData {
    Scanner scan = new Scanner(System.in);
    ArrayList<BaseOfData> mennagers = new ArrayList<BaseOfData>();
    ArrayList<BaseOfData> ispolnitel = new ArrayList<BaseOfData>();
    String name;
    boolean access = false;

    public BaseOfData(String name) {
        this.name = name;
    }

    public void addmennagers() {
        try {
            System.out.println("Введите имя: ");
            String nameV = scan.next();
            mennagers.add(new BaseOfData(nameV));
            System.out.println("Меннеджер добавлен!");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void auth(String login) {
        try {
            for (int i = 0; i<mennagers.size(); i++) {
                if (mennagers.get(i).name.equals(login)) {
                    access = true;
                } else {
                    access = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

    public void addispol() {
        try {
            System.out.println("Введите имя: ");
            String nameV = scan.next();
            ispolnitel.add(new BaseOfData(nameV));
            System.out.println("Исполнитель добавлен!");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void authIsp(String login) {
        try {
            for (int i = 0; i<ispolnitel.size(); i++) {
                if (ispolnitel.get(i).name.equals(login)) {
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
