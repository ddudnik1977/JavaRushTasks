package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
      int sum = 0;
        while (console.hasNextInt()) {
            int number = console.nextInt();
            sum = sum+number;
        }
        System.out.println(sum);
    }
}