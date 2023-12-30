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
public class TableSerialize extends AbstractTableModel {
    private  String[] columnNames; 
    private String[][] data;

    public TableSerialize(String[][] data, String [] columnNames) {
        this.data = data;
        this.columnNames = columnNames;
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
