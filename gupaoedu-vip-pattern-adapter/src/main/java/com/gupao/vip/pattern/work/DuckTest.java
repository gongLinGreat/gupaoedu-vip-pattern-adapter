package com.gupao.vip.pattern.work;

import java.util.Arrays;

public class DuckTest {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy",8),
                new Duck("Dewey",2),
                new Duck("Howard",7),
                new Duck("Louie",2),
                new Duck("Huey",10)
        };
        System.out.println("Before aorting:");
        dispaly(ducks);

        Arrays.sort(ducks);

        System.out.println("After aorting:");
        dispaly(ducks);
    }

    private static void dispaly(Duck[] ducks) {
        for (Duck d: ducks) {
            System.out.println(d);
        }
    }

}
