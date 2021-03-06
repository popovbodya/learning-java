package ru.popov.bodya.predicate;

import java.util.Collections;
import java.util.List;

public class PredicateUsage {

    private static void removeUserByNumber(List<User> users, int predicateStatement) {

        users.removeIf((user -> user.getNumber() > predicateStatement));

    }

    public static void main(String[] args) {

        List<User> users = UsersFactory.getAllUsers(50);
        System.out.println("List of users before sorting");
        users.forEach(System.out::println);
        System.out.println("_____________\n");

        Collections.sort(users, (o1, o2) -> o1.getNumber() > o2.getNumber() ? 1 : -1);
        System.out.println("List of users after sorting and before removing some elements");
        users.forEach(System.out::println);
        System.out.println("_____________\n");

        removeUserByNumber(users, 25);
        System.out.println("List of users after sorting and removing some elements");
        users.forEach(System.out::println);
    }

}
