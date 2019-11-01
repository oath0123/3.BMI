package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("High:");
        double num1 = scanner.nextDouble()/100;
        System.out.println("Wight:");
        double num2 = scanner.nextDouble();
        double num3 = Math.pow(num1, 2);
        double num4 = num2/num3;
        System.out.println("BMI:" + num4);


    }

}
