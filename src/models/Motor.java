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
    private String brand;
    public void performMaintenance (Vehicle vehicle, Mechanic mechanic) {
        JOptionPane.showMessageDialog(null,"Motor foi reparado... ");
    }
    public boolean turnOnMotor() {
        this.turnOn = !this.turnOn;
        return turnOn;
    }
    
}
