
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
            int clientOS = 1;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        System.out.println("________");

        System.out.println("Задача 2");
            int clientDeviceYear = 2014;
            if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            System.out.println("________");

        System.out.println("Задача 3");
            int year = 2021;
            if (year >= 1584 && year % 4 == 0 && year % 100 != 0){
                System.out.println(year + " год является високосным");
            } else if (year >= 1584 && year % 400 == 0){
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        System.out.println("________");

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: " + (deliveryDays +1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays +2));
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("________");

        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1 , 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
        System.out.println("________");

    }
}