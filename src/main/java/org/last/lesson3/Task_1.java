package org.last.lesson3;

public class Task_1 {
    public static void main(String[] args) {
        //1.
        int x = 10;
        while (x < 21) {
            System.out.println("x = " + x);
            x++;
        };

        //2.
        int y = 10;
        do {
            System.out.println("y = " + y);
            y++;
        }
        while (y < 21);

        //3.
        for (int z = 10; z <= 20; z++) {
            System.out.println("z = " + z);
        };

        //4.
        int[] numbers = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int a : numbers) {
            System.out.println("u = " + a);
        }
    }
}