package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner con = new Scanner(System.in);
        while (true) {
            String s = con.nextLine();
            if (s.equals("enough"))
            {break;}
            else
            {System.out.println(s);}
        }

    }
}