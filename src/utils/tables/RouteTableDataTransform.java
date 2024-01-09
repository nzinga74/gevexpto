/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils.tables;

import java.util.ArrayList;
import models.Route;
import models.User;

/**
 *
 * @author nzinga
 */
public class RouteTableDataTransform {
    public static String [][] dataTransform (ArrayList<Route> routes) {
        int routesListLength = routes.size();
        String [][] data = new String [routesListLength][5];
        for (int i = 0; i < routesListLength; i++) {
            data[i][0] = Integer.toString(routes.get(i).getId());
            data[i][1] = routes.get(i).getOrigin();
            data[i][2] = routes.get(i).getDestination();
            data[i][3] = Double.toString( routes.get(i).getDistance());     
        }
        return data;
    }
    public static String [] dataColumn () {
        String [] columnNames = {"Id","Origem","Destino","Distância"};
        return columnNames;
    }
}
