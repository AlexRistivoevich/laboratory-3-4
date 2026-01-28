package org.intmo.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lesson1();
        lesson2();
        lesson3();
        lesson4();
        int[] array = {3, -3, 7, 4, 5, 4, 3};
        System.out.println("array = " + Arrays.toString(array));
        System.out.println(lesson5(array));
        System.out.println(lesson6(array));
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(lesson7(array2));
        lesson8();
        int[] array3 = {1, 2, 6, 7};
        System.out.println("Array 1: " + Arrays.toString(array3));
        lesson9(array3);
        System.out.println("Array 1: " + Arrays.toString(array3));
        int[] array4 = {1, 2, 3, 1, 2, 4};
        Integer result = lesson10(array4);
        System.out.println("Уникальное число: " + result);
    }

    public static void lesson1() {
        int number = 100;
        for (int i = 1; i < number; i++) {
            System.out.println(i);
        }
    }

    public static void lesson2() {
        int number = 100;
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) {
                System.out.println("Делится на 3 и на 5:" + i);
            } else if (i % 3 == 0) {
                System.out.println("Делится на 3:" + i);
            } else if (i % 5 == 0) {
                System.out.println("Делится на 5:" + i);
            }
        }
    }

    public static void lesson3() {
        System.out.println("Введите по порядку 5, 10 и 15");
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sum = num1 + num2;
        boolean ravno = sum == num3;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(ravno);
    }

    public static void lesson4() {
        System.out.println("Введите по порядку 5, 10 и 15");
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        boolean ravno;
        if (num2 > num1 && num3 > num2) {
            ravno = true;
        } else {
            ravno = false;
        }
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(ravno);

    }

    public static boolean lesson5(int[] array) {
        if (array.length >= 2) {
            return array[0] == 3 || array[array.length - 1] == 3;
        } else {
            return false;
        }
    }

    public static boolean lesson6(int[] array) {
        for (int ar : array) {
            if (ar == 1 || ar == 3) {
                return true;
            }
        }
        return false;
    }

    public static String lesson7(int[] array2) {

        for (int i = 0; i < array2.length - 1; i++) {
            if (array2[i] > array2[i + 1]) {
                return "Please, try again";
            }
        }
        return "ОК";
    }

    public static void lesson8() {
        System.out.println("Введите цифру чтобы назначить длину массива:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        System.out.println("Array length: " + num);
        System.out.println("Введите числа согласно размеру масива");
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Result:" + Arrays.toString(array));
    }

    public static void lesson9(int[] array3) {
        int temp = array3[0];
        array3[0] = array3[array3.length - 1];
        array3[array3.length - 1] = temp;
    }

    public static Integer lesson10(int[] array4) {

        for (int i = 0; i < array4.length; i++) {
            boolean Unique = true;
            for (int j = 0; j < array4.length; j++) {
                if (i != j && array4[i] == array4[j]) {
                    Unique = false;
                    break;
                }
            }
            if (Unique) {
                return array4[i];
            }
        }
        return null;
    }
}




