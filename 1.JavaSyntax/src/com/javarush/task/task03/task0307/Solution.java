package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 12; i++) {

            if (i > 10) {
                Zerg zer = new Zerg();
                zer.name = Integer.toString(i);
            }

            if (i > 5) {
                Protoss protoss = new Protoss();
                protoss.name = Integer.toString(i);
            }

            Terran terran = new Terran();
            terran.name = Integer.toString(i);

        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
