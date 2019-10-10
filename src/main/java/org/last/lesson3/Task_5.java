package org.last.lesson3;

public class Task_5 {
//        Write a function which calculates and returns the minimum of 4 arguments.
    public static void main(String[] args) {
        System.out.println(min(3, 4, 5, 6));
    }
    public static int min(int a, int b, int c, int d) {
        return min(min(a, b), min(c, d));
    }
    public static int min(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }
}
