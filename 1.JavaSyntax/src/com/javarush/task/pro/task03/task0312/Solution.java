package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        if (a.equals(b)) {
            System.out.println("строки одинаковые");
        }

        //напишите тут ваш код
        else{
            System.out.println("строки разные");
        }
    }
}
