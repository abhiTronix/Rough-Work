/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooap.problem1;

/**
 *
 * @author abhiu
 */
public class Bicycle {

    private int cadence;
    private int speed;
    private int gear;
    
    public Bicycle(int cadence, int speed, int gear){
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }

    void changeCadence(int newValue) { //pedalling rate(in rpm)
        if (newValue > 0 && newValue < 80) {
            this.cadence = newValue;
        } 
    }

    void changeGear(int newValue) {
        if (newValue > 0 && newValue < 5) {
            this.gear = newValue;
        }
    }

    void accelerate(int increment) {
        if (this.speed<20){
            this.speed = this.speed + increment;
        }
    }
    
    void accelerate(double increment) {
        if (this.speed<20){
            this.speed = this.speed + (int)increment;
        }
    }
    
    void applyBrakes(double decrement) {
        if (this.speed>0){
            this.speed = this.speed - (int)decrement;
        }
    }

    void applyBrakes(int decrement) {
        if (this.speed>0){
            this.speed = this.speed - decrement;
        }
    }
    
    int getSpeed(){
        return speed;
    }
    
    int getGear(){
        return gear;
    }
    
    public int getCadence(){
        return cadence;
    }

    void printAllStates() {
        System.out.println("cadence:" + cadence + " speed:"
                + speed + " gear:" + gear);
    }
}