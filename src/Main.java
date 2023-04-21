// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();//вывод цифр сложением
        task2();//вывод цифр вычитанием
        task3();//четные числа
        task4();//цифры от 10 до -10
        //task5();//високосный год
        //task6();//вывод цифр сложением на 7
        //task7();//вывод цифр умножением на 2
        //task8();
        //task9();
        //task10();

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


}