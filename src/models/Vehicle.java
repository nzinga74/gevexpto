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
public class Vehicle {
    protected int id;
    protected String type;
    protected String brand;
    protected String model;
    protected String carRegistration;
    protected int year;
    protected int capacity;
    protected Date createdAt;
    protected Date updatedAt;
    protected Driver driver;
    protected Tire tire;

    public Vehicle() {
    }

    public Vehicle(int id, String type, String brand, String model, String carRegistration, int year, int capacity, Tire tire) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.carRegistration = carRegistration;
        this.year = year;
        this.capacity = capacity;
      
        this.tire = tire;
    }
    
    
    
    public Vehicle(int id, String type, String brand, String model, String carRegistration, int year, int capacity, Tire tire,  Driver driver) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.carRegistration = carRegistration;
        this.year = year;
        this.capacity = capacity;
        this.driver = driver;
        this.tire = tire;
    }
    
    
    //CREATE THE METHODS

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
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
    

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", type=" + type + ", brand=" + brand + ", model=" + model + ", carRegistration=" + carRegistration + ", year=" + year + ", capacity=" + capacity + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", driver=" + driver + '}';
    }
    
     
    
    
    
}
