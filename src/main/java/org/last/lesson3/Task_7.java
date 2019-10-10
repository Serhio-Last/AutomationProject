package org.last.lesson3;

public class Task_7 {
    //    Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//    If one of the parameters is < 10, method should return -1 to indicate an invalid value.
//    The method should return the greatest common divisor of two numbers.
//        public static void main(String[] args) {
//            getGreatestCommonDivisor (100, 10);
//        }
//        public static void getGreatestCommonDivisor(int first, int second) {
//            for (int divisor = 1; divisor <= first && divisor <= second; divisor++) {
//                if (first % divisor == 0 && second % divisor == 0)
//                    if (first < 10 && second < 10) divisor = -1;
//                System.out.println(divisor);
//            }
//        }
//}
    public static void main(String[] args) {
       int result = getGreatestCommonDivisor(30, -18);
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