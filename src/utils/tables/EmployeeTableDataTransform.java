/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils.tables;

import java.util.ArrayList;
import models.Employee;
import repositories.EmployeeRepository;

/**
 *
 * @author nzinga
 */
public class EmployeeTableDataTransform {
      public static String [][] dataTransform (ArrayList<Employee> employeeList) {
       try {
            int employeeLength = employeeList.size() ;
            String[][] data = new String[employeeLength][6];

            for (int i = 0; i < employeeLength; i++) {
                data[i][0] = employeeList.get(i).getFirstName();
                data[i][1] = employeeList.get(i).getLastName();
                data[i][2] = employeeList.get(i).getBi();
                data[i][3] = employeeList.get(i).getNacionality();
                data[i][4] = employeeList.get(i).getOffice();
                data[i][5] = employeeList.get(i).getBirthDate().toString();
            };
             
            
            return data;
           
        } catch (Exception ex) {
            return null;
            //JOptionPane.showMessageDialog(null, "Erro ao Listar");
        }
       
       
    }
    public static String [] dataColumn () {
        String[] columnNames = {"Nome","Sobrenome","Bi","Nacionalidade","Cargo", "Data de Nascimeto"}; 
        return columnNames;
    }
}
