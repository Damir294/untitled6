import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        doTask1();
        doTask2();
        doTask3();
    }

    // Задание 1
    public static void doTask1() {

        int numberOfYear = 2021;
        isLeapYear(numberOfYear);
    }

    public static void isLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год\n");
        } else {
            System.out.println(year + " - не високосный год\n");
        }
    }

    // Задание 2
    public static void doTask2() {

        System.out.println("Homework 11 Task 2");
        int phoneOS = 1;
        int currentYear = LocalDate.now().getYear();
        installApp(currentYear, phoneOS);
    }

    public static void installApp(int clientDeviceYear, int clientOS) {

        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        }
    }

    // Задание 3
    public static void doTask3() {



        int getDistance = 95;
        deliverABankCard(getDistance);
    }
    public static void deliverABankCard(int deliveryDistance) {

        int deliveryTimeDay = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTimeDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTimeDay + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryTimeDay + 2));
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}
