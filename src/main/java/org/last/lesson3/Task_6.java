package org.last.lesson3;

public class Task_6 {
    public static void main(String[] args) {
        getEvenDigitSum(9078764);
    }
    public static void getEvenDigitSum(int a) {
        int sum = 0;
        char[] charArray = String.valueOf(a).toCharArray();
        for (char ch : charArray) {
            int number = Character.getNumericValue(ch);
            if (number % 2 == 0) sum += number;
        }
        if (a < 0) sum = -1;
        System.out.println(sum);
    }
}



