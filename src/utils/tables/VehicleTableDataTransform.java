/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils.tables;

import java.util.ArrayList;
import models.Vehicle;

/**
 *
 * @author nzinga
 */
public class VehicleTableDataTransform {
    public static String [][] dataTransform (ArrayList<Vehicle> vehicles) {
        int vehicleListLength = vehicles.size();
        String [][] data = new String [vehicleListLength][6];
        for (int i = 0; i < vehicleListLength; i++) {
            data[i][0] = Integer.toString(vehicles.get(i).getId());
            data[i][1] = vehicles.get(i).getModel() + vehicles.get(i).getBrand();
            data[i][2] = vehicles.get(i).getType();
            data[i][3] = vehicles.get(i).getCarRegistration();
            data[i][4] = Integer.toString(vehicles.get(i).getYear());
            data[i][5] = Integer.toString(vehicles.get(i).getDriver().getId());
            
        }
        return data;
       
    }
    public static String [] dataColumn () {
        String [] columnNames = {"Id","Nome","Tipo","Carta de Condução", "Ano","Id do Motorista"};
        return columnNames;
    }
}
