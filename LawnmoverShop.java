package com.company;

public class LawnmowerShop {
    public static void main(String[] args) {
        Lawnmover siemenc = new Lawnmover();
        Lawnmover husqvarna = new Lawnmover(250, 6000, "xs1500", 1500,
                2000, 30, 220, "France", "green");
        Lawnmover sip = new Lawnmover(45, 1200, "newlight", 2000);
        siemenc.toString();
        System.out.println("----------------------");
        husqvarna.toString();
        System.out.println("----------------------");
        sip.toString();
        System.out.println("----------------------");

        Lawnmover.printStaticVoltage();
        husqvarna.printVoltage();
        System.out.println("----------------------");

        Lawnmover[] someLawnmowers = new Lawnmover[4];
        for (int count = 0; count < 4; count++) {
            someLawnmowers[count] = new Lawnmover();
        }

        for (Lawnmover lawnmower : someLawnmowers) {
            lawnmower.toString();
            System.out.println("----------------------");

        }


    }
}

