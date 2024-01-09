/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.JOptionPane;

/**
 *
 * @author nzinga
 */
public class Motor {
    private boolean turnOn;
    private int id;
    private String brand;
    private String model;
    private int cilinder;
    private int year;

    public Motor() {
    }
    
    public Motor(int id1, String marca, String modelo, int cilindragem, int ano_fabrico, String data_cadastro, String data_actualizacao) {
    }

    public Motor(int id, String brand, String model, int cilinder, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.cilinder = cilinder;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCilinder() {
        return cilinder;
    }

    public void setCilinder(int cilinder) {
        this.cilinder = cilinder;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    
    

    public Motor(int id, String brand) {
      
        this.id = id;
        this.brand = brand;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    public void performMaintenance (Vehicle vehicle, Mechanic mechanic) {
        JOptionPane.showMessageDialog(null,"Motor foi reparado... ");
    }
    public boolean turnOnMotor() {
        this.turnOn = !this.turnOn;
        return turnOn;
    }
    
}
