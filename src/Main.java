import java.nio.file.attribute.UserPrincipalLookupService;

public class Main {
    public static int identifyLeapYear(int i) {
        if ((i % 100 != 0) && (i % 4 == 0) || (i % 400 == 0)) {
            System.out.println(i + " год - високосный");
        } else {
            System.out.println(i + " год - не високосный");
        }
        return i;
    }

    public static String selectApplication(String name) {
        if (name.equals("iOS")) {
            System.out.println("Установите приложение для Android");

        } else {
            System.out.println("Установите приложение для iOS");

        }
        return "";
    }

    public static void main(String[] args) {
        task1();
        task2();
        //task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        identifyLeapYear(year);
    }

    public static void task2() {
        System.out.println(" Задача 2");


        String clientOs = "Android";


        selectApplication(clientOs);

    }
    //public static void task3() {

    //}
    }
