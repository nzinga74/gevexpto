/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import config.database.MysqlConnection;
import models.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.Employee;
/**
 *
 * @author nzinga
 */
public class UserRepository {

    public UserRepository() {
         
    }
    public  static void add( User user) throws Exception {
        String sql = "INSERT INTO usuario(Email, Senha, Nivel_acesso,Estado,id_funcionario) VALUES (?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getAccessLevel());
            ps.setInt(4, user.getState());
            ps.setInt(5, user.getEmployee().getId());
            
            ps.execute();
            ps.close();
        }
        catch(Exception e) {
            System.out.println("Erro aqui");
            System.out.println(user.getEmployee().getId());
            throw new Exception();
        }
    }
    
    public static ArrayList<User> getAll() throws Exception {
        String sql = "select * from usuario";
        ArrayList<User> userList = new ArrayList<User>();
        PreparedStatement ps = null;
        try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            ResultSet userResultSet = ps.executeQuery();
            while(userResultSet.next()) {
                int id = userResultSet.getInt("id");
                String email = userResultSet.getString("Email");
                int state = userResultSet.getInt("Estado");
                int accessLevel = userResultSet.getInt("Nivel_acesso");
                int id_funcionario = userResultSet.getInt("id_funcionario");
                Employee employee = new Employee();
                employee.setId(id_funcionario);
                User user = new User(id,email,accessLevel,state,employee);
                userList.add(user);
            }
            ps.close();
            userResultSet.close();
            
            return userList;
        }
        catch(Exception e) {
            throw new Exception("Erro ao buscar os usuários");
        } 
    }
//    public User findById(int id) {
//        String sql = "SELECT * from users WHERE id=?";
//        PreparedStatement ps = null;
//        try {
//             ps =  MysqlConnection.getConnection().prepareStatement(sql);
//             ps.setInt(1, id);
//             User user;
//            try (ResultSet rs = ps.executeQuery()) {
//                rs.next();
//                System.out.println(""+rs.getString("password"));
//                user = new User();
//                user.setId(rs.getInt(1));
//                user.setName(rs.getString("name"));
//                user.setEmail(rs.getString("email"));
//                user.setIsAdmin(rs.getBoolean("isAdmin"));
//                user.setPassword(rs.getString("password"));
//                //Close the pointers
//            }
//             ps.close();
//             return user;
//            
//             
//             
//        }
//         catch(Exception e) {
//             System.out.println("Erro ao buscar por ID");
//        }
//        return null;
//    }
//    
//    public User findByEmail(String email) {
//        String sql = "select * from users where email='"+email+"'";
//        PreparedStatement ps = null;
//        try {
//            
//             ps =  MysqlConnection.getConnection().prepareStatement(sql);
//             //ps.setString(1, email);
//             User user;
//            try (ResultSet rs = ps.executeQuery()) {
//                
//                rs.next();
//                user = new User();
//                user.setId(rs.getInt(1));
//                user.setName(rs.getString("name"));
//                user.setEmail(rs.getString("email"));
//                user.setIsAdmin(rs.getBoolean("isAdmin"));
//                user.setPassword(rs.getString("password"));
//                //Close the pointers
//            }
//             ps.close();
//             return user;
//             
//        }
//         catch(Exception e) {
//             System.out.println("Erro ao buscar por email");
//        }
//        return null;
//    }
}
