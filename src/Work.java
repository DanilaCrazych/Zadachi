import java.util.Scanner;

public class Work {
    Scanner scan = new Scanner(System.in);
    Main main = new Main();
    Zadachi zad = new Zadachi("","","");

    public void rabotaMen(String name){
    boolean rab = true;
    System.out.println("Здравствуйте "+name+"!");
        while (rab==true) {
            System.out.println("\nВыберите действие: 1.Добавить задачу 2.Просмотр сушествующих задач 3.Выход");
            switch (scan.nextInt()){
                case(1):
                    zad.zadachiList(name);
                    break;
                case(2):
                    if(zad.zadachis.size()==0){
                        System.out.println("Нет доступных задач!");
                    }else {
                        zad.prosmotrZadachMenagers(name);
                    }
                    break;
                case(3):
                    rab = false;
                    break;
            }
        }
    }
    public void rabotaIsp(String name){
        boolean rab = true;
        System.out.println("Здравствуйте "+name+"!");
        while (rab==true) {
            System.out.println("\nВыберите действие: 1.Просмотр доступных задач 2.Выход");
            switch (scan.nextInt()){
                case(1):
                    if(zad.zadachis.size()==0){
                        System.out.println("Нет доступных задач!");
                    }else {
                        zad.prosmotrZadachIspolnitel(name);
                    }
                    break;
                case(2):
                    rab = false;
                    break;
            }
        }

    }
}
