// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();//вывод цифр сложением
        task2();//вывод цифр вычитанием
        task3();//четные числа
        task4();//цифры от 10 до -10
        task5();//високосный год
        task6();//вывод цифр сложением на 7
        task7();//вывод цифр умножением на 2
        task8();
        task9();
        task10();

    }

    private static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }
    private static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i+2){
            System.out.println(i);
        }
    }

    private static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    private static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    private static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i +7) {
            System.out.println(i);
        }
    }

    private static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    private static void task8(){
        System.out.println("Задача 8");
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++){
            total = total + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    private static void task9(){
        System.out.println("Задача 9");
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    private static void task10(){
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++){
            System.out.println("2*"+ i + "=" + 2*i);
        }
    }
}