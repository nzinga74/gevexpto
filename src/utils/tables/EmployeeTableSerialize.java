/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils.tables;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nzinga
 */
public class EmployeeTableSerialize extends AbstractTableModel {
    private  String[] columnNames = {"Nome","Sobrenome","Bi","Nacionalidade","Cargo", "Data de Nascimeto"}; 
    private String[][] data;

    public EmployeeTableSerialize(String[][] data) {
        this.data = data;
    }
    

    @Override
    public int getRowCount() {
         return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }
    @Override
    public String getColumnName(int col) {
      return columnNames[col];
    }
}
