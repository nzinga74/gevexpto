/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import config.database.MysqlConnection;
import models.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author nzinga
 */
public class UserRepository {

    public UserRepository() {
         
    }
    public void addUser( User user) {
        String sql = "INSERT INTO users(name, email, password, isAdmin) VALUES (?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setBoolean(4, user.isIsAdmin());
            ps.execute();
            
            ps.close();
        }
        catch(Exception e) {
            System.out.println("Erro ao Cadastrar");
        }
    }
    
    public User findById(int id) {
        String sql = "SELECT * from users WHERE id=?";
        PreparedStatement ps = null;
        try {
             ps =  MysqlConnection.getConnection().prepareStatement(sql);
             ps.setInt(1, id);
             User user;
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                System.out.println(""+rs.getString("password"));
                user = new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setIsAdmin(rs.getBoolean("isAdmin"));
                user.setPassword(rs.getString("password"));
                //Close the pointers
            }
             ps.close();
             return user;
            
             
             
        }
         catch(Exception e) {
             System.out.println("Erro ao buscar por ID");
        }
        return null;
    }
    
    public User findByEmail(String email) {
        String sql = "select * from users where email='"+email+"'";
        PreparedStatement ps = null;
        try {
            
             ps =  MysqlConnection.getConnection().prepareStatement(sql);
             //ps.setString(1, email);
             User user;
            try (ResultSet rs = ps.executeQuery()) {
                
                rs.next();
                user = new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setIsAdmin(rs.getBoolean("isAdmin"));
                user.setPassword(rs.getString("password"));
                //Close the pointers
            }
             ps.close();
             return user;
             
        }
         catch(Exception e) {
             System.out.println("Erro ao buscar por email");
        }
        return null;
    }
}
