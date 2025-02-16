package conditionals;

import java.util.Scanner;

public class ConditionalsProblem2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);


//        Conditional Problem 2
//        You are given a number N. Write a program using If Else such that if N is less than 30 then the output will be "less important" otherwise the output will be "more important".
//
//                Input Format
//        The first line contains an integer.
//
//        Output Format
//        If the number is less than 30 then "less important" will be printed. If the number is not less than 30 then "more important" will be printed.
//
//                Example 1
//        Input
//
//        30
//        Output
//
//        more important

        int n=sc.nextInt();
        if(n<30){
            System.out.println("less important");
        }
        else{
            System.out.println("more important");
        }
    }
}
