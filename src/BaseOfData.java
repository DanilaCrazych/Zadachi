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
            for (int i = 0; i < mennagers.size(); i++) {
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
            for (int i = 0; i < ispolnitel.size(); i++) {
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

class Zadachi {
    Scanner scan = new Scanner(System.in);
    String mennager, ispolnitel, zadacha;
    ArrayList<Zadachi> zadachis = new ArrayList<Zadachi>();

    public Zadachi(String mennager, String ispolnitel, String zadacha) {
        this.mennager = mennager;
        this.ispolnitel = ispolnitel;
        this.zadacha = zadacha;
    }

    public void zadachiList(String name) {
        String nameM = name;
        System.out.println("Исполнитель: ");
        String nameI = scan.next();
        System.out.println("Задача: ");
        scan.nextLine();
        String zadachaV = scan.nextLine();
        zadachis.add(new Zadachi(nameM, nameI, zadachaV));
    }

    public void prosmotrZadachMenagers(String name) {
        for (int i = 0; i < zadachis.size(); i++) {
            if (zadachis.get(i).mennager.equals(name)) {
                System.out.println("Cписок задач меннеджера: " + zadachis.get(i).mennager + "\nИсполнитель:" + zadachis.get(i).ispolnitel+"\n"+
                        zadachis.get(i).zadacha);
            }
        }
    }

    public void prosmotrZadachIspolnitel(String name) {
        for (int i = 0; i < zadachis.size(); i++) {
            if (zadachis.get(i).ispolnitel.equals(name)) {
                System.out.println("Cписок задач для исполнителя: " + zadachis.get(i).ispolnitel + " от меннеджера: " +
                        zadachis.get(i).mennager+
                        "\nЗадача: "+ zadachis.get(i).zadacha);
                System.out.println("1.Закрыть задачу 2.Выход");
                switch (scan.nextInt()){
                    case(1):
                        zadachis.remove(i);
                        System.out.println("Задача успешно выполнена!");
                        break;
                    case (2):
                        break;
                }

            }
        }
    }
}
