/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author nzinga
 */
public class AutoMobile extends Vehicle {
    protected Motor motor;

    public AutoMobile(int id, String type, String brand, String model, String carRegistration, int year, int capacity, Tire tire) {
        super(id, type, brand, model, carRegistration, year, capacity, tire);
    }

    public AutoMobile(int id, String type, String brand, String model, String carRegistration, int year, int capacity,  Driver driver, Tire tire) {
        super(id, type, brand, model, carRegistration, year, capacity, tire, driver);
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
