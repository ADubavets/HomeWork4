package org.itstep;

import java.util.Random;

public class FirstTask {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static int size = 10;
    public static int a[] = new int[size];
    public static int b[] = new int[size];
    public static void main(String[] args) {
        // 3. Объединить два массива одинакового размера, в котором элементы отсортированы в
        //убывающем порядке. Элементы результирующего массива также расположены в убывающем
        //порядке.
        filRandom(a);
        System.out.print(ANSI_BLUE);
        System.out.println("Array A:");
        print(a);
        descendSort(a);
        System.out.print(ANSI_GREEN);
        System.out.println("Sort Array A:");
        print(a);
        filRandom(b);
        System.out.print(ANSI_BLUE);
        System.out.println("Array B:");
        print(b);
        descendSort(b);
        System.out.print(ANSI_GREEN);
        System.out.println("Sort Array B:");
        print(b);
        int [] arrayResult = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) arrayResult[i] = a[i];
        for (int i = 0; i < b.length; i++) arrayResult[i + a.length] = b[i];
        System.out.print(ANSI_BLUE);
        System.out.println("Array C:");
        print(arrayResult);
        descendSort(arrayResult);
        System.out.print(ANSI_GREEN);
        System.out.println("Sort Array C:");
        print(arrayResult);
    }

    public static void descendSort(int c[]) {
        int count = 0;
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1 - i; j++)
                if (c[j] < c[j + 1]) {
                    PrintColor(j, j + 1, c);
                    swap(j, j + 1, c);
                    count++;
                }
        }
        System.out.println(count + " cycles were carried out");
    }

    public static void PrintColor(int first, int second, int c[]) {
        System.out.print(ANSI_YELLOW);
        for (int i = 0; i < c.length; i++) {
            if (i == first || i == second) {
                System.out.print(ANSI_RED);
                System.out.print(c[i] + " ");
                System.out.print(ANSI_YELLOW);
            }
            else System.out.print(c[i] + " ");
        }
        System.out.println();
    }

    public static void filRandom(int c[]) {
        Random random = new Random();
        for (int i = 0; i < c.length; i++) {
            c[i] = random.nextInt(195)+5;
        }
    }

    public static void swap(int i, int j, int c[]) {
        int temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static void print(int c[]) {
        for (int element:c) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
