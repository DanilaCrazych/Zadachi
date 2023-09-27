import java.time.chrono.IsoEra;
import java.util.ArrayList;
import java.util.Scanner;

public class BD {

    Scanner scan = new Scanner(System.in);
    ArrayList<BD> mennagers = new ArrayList<>();
    ArrayList<BD> ispolnitel = new ArrayList<>();
    String name;
    int id;

    public BD(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public void auth(){
        System.out.println(mennagers.get(0).name);
    }

    public void dobavlenieM() {
        try {
            System.out.println("Введите имя нового меннеджера: ");
            String nameV = scan.next();
            System.out.println("Введите id нового меннеджера: ");
            int idV = scan.nextInt();
            BD men = new BD(nameV, idV);
            mennagers.add(men);
            System.out.println("Меннеджер добавлен!!");
            System.out.println(mennagers.get(0).name);
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }

    public void dobavlenieI() {
        try {
            System.out.println("Введите имя нового Исполнителя: ");
            String nameV = scan.next();
            System.out.println("Введите id нового Исполнителя: ");
            int idV = scan.nextInt();
            BD men = new BD(nameV, idV);
            mennagers.add(men);
            System.out.println("Исполнитель добавлен!!");
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }

    public void prosmotrM() {
        try {
            for (int i = 0; i < mennagers.size(); i++) {
                System.out.println("Имя:" + mennagers.get(i).name + "\n" + "Id:" + mennagers.get(i).id);
            }
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }

    public void prosmotrI() {
        try {
            for (int i = 1; i <= ispolnitel.size(); i++) {
                System.out.println("Имя:" + ispolnitel.get(i - 1).name + "\n" + "Id:" + ispolnitel.get(i - 1).id);
            }
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }

//    public void auth(String name1){
//        try {
//            for (int i=0; i<=mennagers.size(); i++){
//                if (mennagers.get(i).name.equals(name1)){
//                    System.out.println("ВСЕ ЗАЕБИСЬ");
//                }else {
//                    System.out.println("Я хуй");
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("Пиздец!");
//        }
//    }


}
