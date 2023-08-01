package com.workintech.main;

import com.workintech.model.Point;
import com.workintech.model.Player;
import com.workintech.model.Weapon;

public class Main {
    public static void main(String[] args) {
        System.out.println("------Point-------");
        Point first = new Point(6,5);
        Point second = new Point(3,1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);
        System.out.println("distance()= " + point.distance());


        System.out.println("------player-------");

        Player player1 = new Player("Eray", 120, Weapon.MACE);

        System.out.println(player1);
        player1.loseHealth(20);
        System.out.println(player1);
        player1.loseHealth(100);
        System.out.println(player1);
        player1.restoreHealth(300);
        System.out.println(player1);
    }
}