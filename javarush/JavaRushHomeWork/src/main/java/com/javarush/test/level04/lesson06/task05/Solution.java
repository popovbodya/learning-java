package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String name = reader.readLine().trim();
        final int age = Integer.parseInt(reader.readLine().trim());
        if (age < 18) {
            System.out.println("Подрасти еще");
        }

    }
}