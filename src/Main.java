//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Task #1
        System.out.println();
        System.out.println("          Задача №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

//        Task #2
        System.out.println();
        System.out.println("          Задача №2");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

//        Task #3
        System.out.println();
        System.out.println("          Задача №3");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName.replace('ё','е'));


    }
}