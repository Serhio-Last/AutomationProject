package org.last.lesson3;

public class Task_7 {
    public static void main(String[] args) {
        getGreatestCommonDivisor(30, 18);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int a;
        if (first < 10 || second < 10)
            return -1;
        while (first != 0 && second != 0) {
            if (first > second)
                first = first % second;
            else
                second = second % first;
        }
        a = first + second;
        System.out.println(a);
        return a;
    }
}