package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        int age1 = keyboard.nextInt();
        int age2 = keyboard.nextInt();
        int age3 = keyboard.nextInt();

        System.out.println((age1+age2+age3)/3);

    }
}
