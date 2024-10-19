public class Main {
    public static void main(String[] args) {

        System.out.println("_______Задание 1_______");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("_______Задание 2_______");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("_______Задание 3_______");

        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) System.out.println(i);
        }

        System.out.println("_______Задание 4_______");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("_______Задание 5_______");

        for (int i = 1904; i <= 2096; i+=4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("_______Задание 6_______");

        for (int i = 7; i < 100; i += 7) {
            System.out.println(i);
        }

        System.out.println("_______Задание 7_______");

        for (int i = 1; i < 1000; i *= 2) {
            System.out.println(i);
        }

        System.out.println("_______Задание 8_______");


        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + 29000 * i+ " рублей");
        }

        System.out.println("_______Задание 9_______");
        float savings = 0;
        for (int i = 1; i <= 12; i++) {
            savings += 29000;
            savings += savings/100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }

        System.out.println("_______Задание 10_______");

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + " * 2 = "+ i * 2);
        }
    }
}