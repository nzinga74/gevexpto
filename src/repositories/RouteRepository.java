/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import config.database.MysqlConnection;
import models.Route;
import java.sql.PreparedStatement;

/**
 *
 * @author nzinga
 */
public class RouteRepository {
    public static void add (Route route) throws Exception {
        String sql = "INSERT INTO route(origem,destino,distancia) values(?,?,?,?)";
        PreparedStatement ps = null;
         try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            ps.setString(1, route.getOrigin());
            ps.setString(2, route.getDestination());
            ps.setInt(3, route.getDistance());
            ps.execute();
            ps.close();
        }
        catch(Exception e) {
            throw new Exception();
        }
        
    }
    
}
