package org.last.lesson3;

public class Task_8 {
    public static void main(String args[]) {
        int n = 10;
        rectangle(n);
    }
    public static void rectangle(int n) {
        for (int i = 0; i < 4; i++) //outer loop for number of rows(n)
        {
            for (int j = 0; j < n; j++) //  inner loop for columns
            {
                System.out.print("*"); // print star
            }
            System.out.println(); // ending line after each row
        }
    }
}