package Class_print.Print.exercises;

//Write a Java program to print the results of the following operations.
//Test Data:
//a. -5 + 8 * 6
//b. (55+9) % 9
//c. 20 + -3*5 / 8
//d. 5 + 15 / 3 * 2 - 8 % 3
//Expected Output :
//43
//1
//19
//13

import java.util.Scanner; 

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h=-5;
        int j=8;
        int k=6;
        int a=h+j*k;
        System.out.println("The output of a. is " +a);

        int l=55;
        int m=9;
        int n=9;
        int b=(l+m) % n;
        System.out.println("The output of b. is " +b);

        int o= 20;
        int p= -3;
        int q= 5;
        int r= 8;
        int c= o+p*q/r;
        System.out.println("The output of c. is " +c);

        int e=5;
        int f=15;
        int g=3;
        int h1=2;
        int h2=8;
        int d=e+f/g*h1-h2%g;
        System.out.println("The output of d. is " +d);
    }
}
