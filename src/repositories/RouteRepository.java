/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import config.database.MysqlConnection;
import models.Route;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.Employee;
import models.User;

/**
 *
 * @author nzinga
 */
public class RouteRepository {
    public static void add (Route route) throws Exception {
        String sql = "INSERT INTO rotas(origem,destino,distancia) values(?,?,?)";
        PreparedStatement ps = null;
         try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            ps.setString(1, route.getOrigin());
            ps.setString(2, route.getDestination());
            ps.setDouble(3, route.getDistance());
            ps.execute();
            ps.close();
        }
        catch(Exception e) {
            throw new Exception();
        }
        
    }
    public static ArrayList<Route> getAll() throws Exception {
        String sql = "select * from rotas";
        ArrayList<Route> routeList = new ArrayList<Route>();
        PreparedStatement ps = null;
        try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            ResultSet routeResultSet = ps.executeQuery();
            while (routeResultSet.next()) {
                int id = routeResultSet.getInt("id");
                String origin = routeResultSet.getString("origem");
                String destine = routeResultSet.getString("destino");
                double distance =  routeResultSet.getDouble("distancia");
                Route route = new Route(origin,destine,distance);
                routeList.add(route);
            }
            ps.close();
            routeResultSet.close();

            return routeList;
        } catch (Exception e) {
            throw new Exception("Erro ao buscar os usuários");
        }
    }
    
}
