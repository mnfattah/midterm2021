package math.problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        //Source: https://beginnersbook.com/2014/01/java-program-to-find-factorial-of-a-given-number-using-recursion/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");

        int num = scanner.nextInt();

        System.out.println("Factorial of your entered number is: "+fact(num));
    }
    public static int fact(int n){
        int output;
        if(n==1){
            return 1;
        }
        output = fact(n-1)* n;
        return output;
    }


}
