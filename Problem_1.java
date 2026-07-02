// Enter 3 numbers from the user and make a function to print their average.

import java.util.*;
public class Problem_1 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        System.out.println("Average of 3 number is : " + average);
        sc.close();

    }
}