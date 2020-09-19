package com.company;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner gm = new Scanner(System.in);
                System.out.print("Да начнется игра, сынок! Какое число я загадал?: ");
                int count = gm.nextInt();
                int min = 0;
                int max = 20;
                int random_number = min + (int) (Math.random() * max);
                for (int i = 1; i < 4; i++) {
                    if (random_number > count) {
                        System.out.println("Не верно:)! Мое число больше > твоего ");
                        System.out.print("Какое число я загадал?: ");
                         count = gm.nextInt();


                    } else if (random_number < count) {
                        System.out.println("Не верно:)! Мое число меньше < твоего ");
                        System.out.print("Какое число я загадал?: ");
                        count = gm.nextInt();

                    } else {
                        System.out.println("Урааа, ты угадал это число!: " + random_number);
                        break;
                    }
                }
    }
}
