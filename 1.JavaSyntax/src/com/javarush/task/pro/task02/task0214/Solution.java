package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String a = console.nextLine();
        String b = console.nextLine();

        System.out.println(b);
        System.out.println(a.toUpperCase());
        System.out.println(str.toLowerCase());

    }
}
