package Modul_2;

import java.util.Scanner;

public class Triangle
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        a = triangleArea(6, 3, 3);
        System.out.println("A triangle with sides 3,3,3 has an area of:" + a);

    }

    public static double triangleArea( int a, int b, int c )
    {
        double s=(((a+b+c)/2)*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c));
        return Math.sqrt(s);
    }
}