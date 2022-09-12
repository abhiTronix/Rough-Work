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
class MountainBicycle extends Bicycle {
 
    // the MountainBike subclass adds one more field
    public int seatHeight;
 
    // the MountainBike subclass has one constructor
    public MountainBicycle(int cadence, int speed, int gear, int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(cadence, speed, gear);
        seatHeight = startHeight;
    }
 
    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
 
    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
 