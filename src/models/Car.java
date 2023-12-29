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
public class Car extends AutoMobile {

    public Car(Motor motor, int id,  String brand, String model, String carRegistration, int year, int capacity, Date createdAt, Date updatedAt, Tire tire) {
        super(motor, id, "Car", brand, model, carRegistration, year, capacity, createdAt, updatedAt, tire);
    }

    public Car(Motor motor, int id,  String brand, String model, String carRegistration, int year, int capacity, Date createdAt, Date updatedAt, Driver driver, Tire tire) {
        super(motor, id, "Car", brand, model, carRegistration, year, capacity, createdAt, updatedAt, driver, tire);
    }

}
