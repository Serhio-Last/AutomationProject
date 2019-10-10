package org.last.lesson3;

public class Task_9 {
    public static void main(String args[]) {
        int n = 7;
        rightTriangle(n);
    }

    public static void rightTriangle(int n) {
        int i, j;
        for (i = 0; i < 7; i++) //outer loop for number of rows(n)
        {
            for (j = 0; j <= i; j++) //  inner loop for columns
            {
                System.out.print("*"); // print star
            }
            System.out.println(); // ending line after each row
        }
    }
}