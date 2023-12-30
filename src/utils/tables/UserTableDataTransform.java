/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils.tables;

import java.util.ArrayList;
import models.User;

/**
 *
 * @author nzinga
 */
public class UserTableDataTransform {
    public static String [][] dataTransform (ArrayList<User> users) {
        int userListLength = users.size();
        String [][] data = new String [userListLength][4];
        for (int i = 0; i < userListLength; i++) {
            data[i][0] = Integer.toString(users.get(i).getId());
            data[i][1] = users.get(i).getEmail();
            data[i][2] = Integer.toString(users.get(i).getAccessLevel());
            data[i][3] = Integer.toString(users.get(i).getEmployee().getId());
        }
        return data;
    }
    public static String [] dataColumn () {
        String [] columnNames = {"Id","Email","Nível de Acesso","ID funcionario"};
        return columnNames;
    }
}
