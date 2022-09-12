/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooap.problem1;

import java.util.Scanner;

/**
 *
 * @author abhiu
 */
public class main {

    public static void main(String[] args) {

        Bicycle b1 = new Bicycle(1, 2, 1);
        b1.printAllStates();
        Scanner keyboard = new Scanner(System.in);
        OUTER:
        while (true) {
            System.out.println("Press Keyboard Keys: `w: to accelerate`, `s`: to break, `q`: to quit");
            String org_answer = keyboard.nextLine();
            if (!org_answer.isEmpty()) {
                char answer = org_answer.toLowerCase().charAt(0);
                switch (answer) {
                    case 'w' ->
                        b1.accelerate(2);
                    case 's' ->
                        b1.applyBrakes(2);
                    case 'q' -> {
                        break OUTER;
                    }
                    default ->
                        System.out.println("Wrong Key");
                }
                b1.printAllStates();
            }
        }

        MountainBicycle mb = new MountainBicycle(3, 100, 25, 40);
        mb.setHeight(30);
        mb.printAllStates();
        System.out.println(mb.toString());

        RaceBicycle rb = new RaceBicycle(3, 100, 25, 40);
        rb.setWeight(30);
        rb.doubleacceleration(2.0);
        rb.doubleacceleration(2.0);
        rb.printAllStates();
        System.out.println(rb.toString());
    }
}
