package ru.popov.bodya.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithComparingUsage {


    public static void main(String[] args) {

        List<User> users = UsersFactory.getAllUsers(50);
        System.out.println("List of users before sorting");
        users.forEach(System.out::println);
        System.out.println("_____________\n");
        Collections.sort(users, Comparator.comparing(User::getNumber));
        System.out.println("List of users after sorting");
        users.forEach(System.out::println);
    }

}
