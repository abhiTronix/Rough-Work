/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooap.problem1;

/**
 *
 * @author abhiu
 */

// derived class
class RaceBicycle extends Bicycle {
 
    // the RaceBicycle subclass adds one more field
    public int bicycleWeight;
 
    // the RaceBicycle subclass has one constructor
    public RaceBicycle(int cadence, int speed, int gear, int weight)
    {
        // invoking base-class(Bicycle) constructor
        super(cadence, speed, gear);
        bicycleWeight = weight;
    }
 
    // the RaceBicycle subclass adds one more method
    public void setWeight(int newValue)
    {
        bicycleWeight = newValue;
    }
 
    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nBicycle Weight is "
                + bicycleWeight);
    }
    
    void doubleacceleration(double increment) {
        super.accelerate(increment);
    }
    
    void doublebreak(double increment) {
        super.applyBrakes(increment);
    }
}