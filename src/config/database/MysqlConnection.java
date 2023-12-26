/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nzinga
 */
public class MysqlConnection {
   private static final String url = "jdbc:mysql://localhost:3306/gevexpto";
   private static final String user = "root";
   private static final String password = "root";
   
   public static Connection connection;
   
   public static Connection getConnection() throws Exception{
       try {
        if( connection == null) {
            connection = DriverManager.getConnection(url,user,password);
            return connection;
        }
        return connection;
       }
       catch(SQLException e ) {
           System.out.println("Erro ao conectar á base de dados");
           throw new SQLException();
       }
   
   }
}
