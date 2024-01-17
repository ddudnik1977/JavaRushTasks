package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        
        if (a<(b+c)){
            boolean triangle_exits = true;
            System.out.println(triangle_exits);
        } else if (a>=(b+c)) {
            boolean triangle_not_exists =false;
            System.out.println(triangle_not_exists);

        } else if (b<(a+c)) {
            boolean triangle_exists = true;
            System.out.println(triangle_exists);
        } else if (b>=(a+c)) {
            boolean triangle_not_exists =false;
            System.out.println(triangle_not_exists);

        } else if (c<(b+a)) {
            boolean triangle_exists = true;
            System.out.println(triangle_exists);
        } else if (c>=(b+a)) {
            boolean triangle_not_exists =false;
            System.out.println(triangle_not_exists);
        }

    }
}
