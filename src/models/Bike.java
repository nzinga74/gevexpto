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
public class Bike extends NoAutomobile{
    
    public Bike(int id, String type, String brand, String model, String carRegistration, int year, int capacity, Date createdAt, Date updatedAt, Driver driver, Tire tire) {
        super(id, type, brand, model, carRegistration, year, capacity, tire,  driver);
    }
    
}
