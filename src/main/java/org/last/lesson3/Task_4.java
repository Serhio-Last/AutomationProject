package org.last.lesson3;

public class Task_4 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 1; i < 9; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Сумма = " + sum);
    }
}