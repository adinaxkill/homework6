package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Boss boss = new Boss();
        boss.health = 600;
        boss.damage = 30;
        boss.weapon.setType("Холодное");
        boss.weapon.setName("M16");
        System.out.println("Boss:" + " " + boss.health + " " + boss.damage + " " + boss.weapon.getType() + " " + boss.weapon.getName());
    }
}

