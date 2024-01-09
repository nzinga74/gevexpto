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
public class Maintenance {

    public static void  changeOil(AutoMobile autoMobile, Mechanic mechanic) {
        JOptionPane.showMessageDialog(null, "Óleo foi trocado");
    }

    public static void RepairMotor(AutoMobile autoMobile, Mechanic mechanic) {
        JOptionPane.showMessageDialog(null, "Motor foi reparado");
    }
    public static void changeChain() {
        JOptionPane.showMessageDialog(null, "As correntes foram trocadas");
    }
    public static void changeTire(Tire tire, Vehicle vehicle,Mechanic mechanic ){
        vehicle.setTire(tire);
        JOptionPane.showMessageDialog(null, "Pneus foram trocados");
    }

}
