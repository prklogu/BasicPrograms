package com.javaB.basicprogram;

public class FibonacciSeries {
    static  int n1=0, n2=1, n3;
    public static void main(String... arg) {
       int count=10;
       System.out.print(n1 + " " + n2);
        fibonacci(count-2);
        //fibonacciRecursion(count-2);
    }

    public static void fibonacci(int count) {

        for (int i = 2; i <= count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void fibonacciRecursion(int count){
        if(count>0){
            n3= n1+n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;
            fibonacciRecursion(count-1);
        }
    }
}
