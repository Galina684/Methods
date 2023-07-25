import java.nio.file.attribute.UserPrincipalLookupService;

public class Main {
    public static void identifyLeapYear(int i) {
        if ((i % 100 != 0) && (i % 4 == 0) || (i % 400 == 0)) {
            System.out.println(i + " год - високосный");
        } else {
            System.out.println(i + " год - не високосный");
        }
    }

    public static void selectApplication(int year, int clientOs) {
        switch (clientOs) {
            case 0:
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("установите приложение для iOs по ссылке");
                }
                break;
            case 1:
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("установите приложение для Android по ссылке");
                }
                break;
            default:
                System.out.println("Тип операционной системы не определен");
                break;
        }
    }

    public static int deliverCards(int deliveryDistance) {
        int time = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки " + time + " день");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Срок доставки " + (time + 1) + " дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Срок доставки " + (time + 2) + " дня");
        } else if (deliveryDistance >= 100) {
            System.out.println("По вашему адресу доставка не осуществляется");
        }
        return time;

    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        identifyLeapYear(year);
    }

    public static void task2() {
        System.out.println(" Задача 2");
        int clientOs = 0;
        int clientDeviceYear = 2014;

        selectApplication(clientDeviceYear, clientOs);

    }

    public static void task3() {
        System.out.println(" Задача 3");
        int deliveryDistance = 95;
        deliverCards(deliveryDistance);
    }
}
