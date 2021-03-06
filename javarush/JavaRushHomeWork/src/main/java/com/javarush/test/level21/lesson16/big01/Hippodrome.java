package com.javarush.test.level21.lesson16.big01;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Задание 15
Добавим определение победителя.
В классе Hippodrome сделаем два метода:
public Horse getWinner() и public void printWinner()

Метод getWinner должен возвращать лошадь пробежавшую самую большую дистанцию.
Метод printWinner выводит на экран имя победителя в виде:
Winner is <NAME>!
Пример:
Winner is Lucky!

 */

public class Hippodrome {

    private ArrayList<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public Horse getWinner() {
        return Collections.max(getHorses(), new Comparator<Horse>() {
            @Override
            public int compare(Horse o1, Horse o2) {
                return Double.compare(o1.getDistance(), o2.getDistance());
            }
        });
    }

    public void printWinner() {
        System.out.printf("Winner is %s!", getWinner().getName());
    }

    public void print() {
        for (Horse horse : getHorses()) {
            horse.print();
            System.out.printf("\n\n");
        }
    }

    public void move() {
        for (Horse horse : getHorses()) {
            horse.move();
        }
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome();
        for (int i = 0; i < 3; i++) {
            game.getHorses().add(new Horse("Horse" + i, 3, 0));
        }
        game.run();
        game.printWinner();
    }
}
