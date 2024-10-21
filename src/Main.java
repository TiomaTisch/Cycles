import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("_________Задание 1_________");

        int savings = 0;
        int month = 0;
        while (savings < 2459000){
            savings += 15000;
            month++;
            System.out.println("Месяц "+ month +", сумма накоплений равна " + savings +" рублей");
        }

        System.out.println("_________Задание 2_________");

        int i = 0;
        while (i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("_________Задание 3_________");

        int population = 12000000;
        for (int j = 1; j <= 10; j++) {
            population = population + (population/1000)*17 - (population/1000)*8;
            System.out.println("Год " + j +" численность населения составляет " +population);
        }

        System.out.println("_________Задание 4_________");

        int contribution = 15000;
        month = 0;
        while (contribution < 12000000) {
            month++;
            contribution = contribution + contribution*7/100;
            System.out.println("Месяц " + month + " накопления " + contribution);
        }

        System.out.println("_________Задание 5_________");

        contribution = 15000;
        month = 0;
        while (contribution < 12000000) {
            month++;
            contribution = contribution + contribution*7/100;
            if (month % 6 == 0) System.out.println("Месяц " + month + " накопления " + contribution);
        }

        System.out.println("_________Задание 6_________");

        contribution = 15000;
        month = 0;
        while (month < 9*12) {
            month++;
            contribution = contribution + contribution*7/100;
            if (month % 6 == 0) System.out.println("Месяц " + month + " накопления " + contribution);

        }

        System.out.println("_________Задание 7_________");

        Random random = new Random();
        int friday = random.nextInt(7)+1;
        for (int j = friday; j < 31; j+=7) {
            System.out.println("Сегодня пятница, " + j +"-е число. Необходимо подготовить отчет");
        }

        System.out.println("_________Задание 8_________");

        int currentYear = 2024;
        for (int j = 79; j <= currentYear+100; j+=79) {
           if (j > currentYear - 200 ) System.out.println(j);
        }

    }
}