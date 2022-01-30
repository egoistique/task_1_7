package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину стороны ");
        double a = sc.nextDouble();
        double part1 = (a/2) * (a/2);
        double part2 = (a * a - Math.PI * (a/2) * (a/2)) / 4;
        
        System.out.printf("Ответ : %.03f%n", part1 + part2);
    }
}
