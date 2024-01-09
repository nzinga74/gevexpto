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
public class NoAutomobile extends Vehicle {

    public NoAutomobile(int id, String type, String brand, String model, String carRegistration, int year, int capacity, Tire tire) {
        super(id, type, brand, model, carRegistration, year, capacity, tire);
    }

    public NoAutomobile(int id, String type, String brand, String model, String carRegistration, int year, int capacity, Tire tire, Driver driver) {
        super(id, type, brand, model, carRegistration, year, capacity, tire,  driver);
    }

   
}
