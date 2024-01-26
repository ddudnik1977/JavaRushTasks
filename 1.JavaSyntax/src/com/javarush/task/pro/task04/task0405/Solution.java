package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 0;
        while (x < 10) {
            int y = 0;
            while (y < 19) {
                System.out.print((y == 0) || (x == 0) || (x == 9) ? "Б" : " ");
                y++;
            }
            System.out.println("Б");
            x++;
        }

    }
}