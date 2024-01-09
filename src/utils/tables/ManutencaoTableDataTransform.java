/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils.tables;

import java.util.ArrayList;
import models.Employee;
import models.Manutencao;

/**
 *
 * @author nzinga
 */
public class ManutencaoTableDataTransform {
    public static String [][] dataTransform (ArrayList<Manutencao> ManutencaoList) {
       try {
            int ManutencaoLength = ManutencaoList.size() ;
            String[][] data = new String[ManutencaoLength][6];

            for (int i = 0; i < ManutencaoLength; i++) {
                data[i][0] = ManutencaoList.get(i).getTipo();
                data[i][1] = ManutencaoList.get(i).getDescricao();
                String newCusto = String.valueOf(ManutencaoList.get(i).getCusto());
                data[i][2] = newCusto;
                data[i][3] = ManutencaoList.get(i).getEstado();
                
                
      
                
             
            };
             
            
            return data;
           
        } catch (Exception ex) {
            return null;
            //JOptionPane.showMessageDialog(null, "Erro ao Listar");
        }
    }
    
    public static String [] dataColumn () {
        String [] columnNames = {"Tipo", "Descrição", "custo", "Estado", "Data"};
        return columnNames;
    }
    
}
