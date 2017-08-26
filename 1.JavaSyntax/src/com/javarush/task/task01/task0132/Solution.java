package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        System.out.println(number);
        int a1 = number / 100;
        int a2 = number % 100/10;
        int a3 = number % 10;
        return a1+a2+a3;

    }
}