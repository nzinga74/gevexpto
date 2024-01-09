/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import config.database.MysqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.Employee;
import models.Motor;
import models.User;

/**
 *
 * @author nzinga
 */
public class MotorRepository {
    
    public static ArrayList<Motor> getAll() throws Exception {
        String sql = "select * from motor";
        ArrayList<Motor> motorList = new ArrayList<Motor>();
        PreparedStatement ps = null;
        try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            ResultSet motorResultSet = ps.executeQuery();
            while (motorResultSet.next()) {
                    int id = motorResultSet.getInt("id");
                    String marca = motorResultSet.getString("marca");
                    String modelo = motorResultSet.getString("modelo");
                    int cilindragem = motorResultSet.getInt("cilindragem");
                    int ano_fabrico = motorResultSet.getInt("ano_fabrico");
                   
                    
                    Motor motor = new Motor(id, marca, modelo, cilindragem, ano_fabrico);
                    motorList.add(motor);
            }
              ps.close();
              motorResultSet.close();
              
              return motorList;
        }catch (Exception e){
            throw new Exception("Erro ao buscar os motores");
        }
    }
    
}

    