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

    public AutoMobile(int id, String type, String brand, String model, String carRegistration, int year, int capacity,  Driver driver, Tire tire, Motor motor) {
        super(id, type, brand, model, carRegistration, year, capacity, tire, driver);
        this.motor = motor;
    }

    public AutoMobile(Motor motor, int id, String type, String brand, String model, String carRegistration, int year, int capacity,  Driver driver,Tire tire, Route route) {
        super(id, type, brand, model, carRegistration, year, capacity, tire, driver, route);
        this.motor = motor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
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
