package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String s[] = {"Мама", "Мыла", "Раму"};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if ((i != j) && (i != k) && (k != j))
                        System.out.println(s[i] + s[j] + s[k]);

                }
            }
        }
    }
}
