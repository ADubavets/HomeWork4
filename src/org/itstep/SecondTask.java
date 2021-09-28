package org.itstep;

public class SecondTask {
    static int nCol = 5;
    static int nRow = 5;
    public static int [][] arr = new int [nCol][nRow];
    public static void main(String[] args) {
        //Задание 2 – одна задача. Вывести в консоль фигуру, образованную числами
        //3 вариант: pattern 21
        // 1
        // 1 0
        // 1 0 1
        // 1 0 1 0
        // 1 0 1 0 1
        for (int i = 0; i < nCol; i++) {
            for (int j = 0; j < nRow; j++) {
                if (j % 2 == 1) arr[i][j] = 0;
                else arr[i][j] = 1;
            }
        }
        System.out.println(arrToString());
    }

    public static String arrToString() {
        StringBuilder result = new StringBuilder();
        int size = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                if (j < size) {
                    String s = Integer.toString(arr[i][j]);
                    String padded = String.format("%2s", s);
                    result.append(padded);
                }
                else result.append("  ");
            size++;
            result.append("\n");
        }
        return result.toString();
    }
}
