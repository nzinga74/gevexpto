/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author nzinga
 */
public class AutoMobile extends Vehicle {
    protected Motor motor;

    public AutoMobile(Motor motor, int id, String type, String brand, String model, String carRegistration, int year, int capacity, Date createdAt, Date updatedAt, Tire tire) {
        super(id, type, brand, model, carRegistration, year, capacity, createdAt, updatedAt, tire);
        this.motor = motor;
    }

    public AutoMobile(Motor motor, int id, String type, String brand, String model, String carRegistration, int year, int capacity, Date createdAt, Date updatedAt, Driver driver, Tire tire) {
        super(id, type, brand, model, carRegistration, year, capacity, createdAt, updatedAt, driver, tire);
        this.motor = motor;
    }
    
    public void performMaintenance (Vehicle vehicle, Mechanic mechanic,int options ) {
    
    }
    public boolean operateEngine() {
        return this.motor.turnOnMotor();
    }

    
    
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
}
