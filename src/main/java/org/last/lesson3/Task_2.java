package org.last.lesson3;

import java.util.stream.IntStream;

public class Task_2 {
    public static void main(String[] args) {
        int x = 1;
        while (x < 100) {
            if (x % 3 == 0)
                System.out.println ("x = " + x);
            x++;
        }
    }
}
