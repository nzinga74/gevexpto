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

    public static void add(User user) throws Exception {
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
        } catch (Exception e) {
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
            while (userResultSet.next()) {
                int id = userResultSet.getInt("id");
                String email = userResultSet.getString("Email");
                int state = userResultSet.getInt("Estado");
                int accessLevel = userResultSet.getInt("Nivel_acesso");
                int id_funcionario = userResultSet.getInt("id_funcionario");
                Employee employee = new Employee();
                employee.setId(id_funcionario);
                User user = new User(id, email, accessLevel, state, employee);
                userList.add(user);
            }
            ps.close();
            userResultSet.close();

            return userList;
        } catch (Exception e) {
            throw new Exception("Erro ao buscar os usuários");
        }
    }

    public static User findById(int userId) {
        String sql = "SELECT * from usuario WHERE id=?";
        PreparedStatement ps = null;
        try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            ps.setInt(1, userId);
            User user;
            try (ResultSet userResultSet = ps.executeQuery()) {
                userResultSet.next();
                int id = userResultSet.getInt("id");
                String userEmail = userResultSet.getString("Email");
                int state = userResultSet.getInt("Estado");
                int accessLevel = userResultSet.getInt("Nivel_acesso");
                int id_funcionario = userResultSet.getInt("id_funcionario");
                Employee employee = new Employee();
                employee.setId(id_funcionario);
                user = new User(id, userEmail, accessLevel, state, employee);
                //Close the pointers
            }
            ps.close();
            return user;

        } catch (Exception e) {
            System.out.println("Erro ao buscar por ID");
        }
        return null;
    }

    public static User findByEmail(String email) {
        String sql = "select * from usuario where Email='"+ email +"'";
        PreparedStatement ps = null;
        try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            //ps.setString(1, email);

            User user;
            try (ResultSet userResultSet = ps.executeQuery()) {
                System.out.println("Here");
                userResultSet.next();
                System.out.println("" + userResultSet.getString("id"));

                int id = userResultSet.getInt("id");
                String userEmail = userResultSet.getString("Email");
                String password = userResultSet.getString("Senha");
                int state = userResultSet.getInt("Estado");
                int accessLevel = userResultSet.getInt("Nivel_acesso");
                int id_funcionario = userResultSet.getInt("id_funcionario");
                Employee employee = new Employee();
                employee.setId(id_funcionario);
                user = new User(id, userEmail, accessLevel, state, employee);
                user.setPassword(password);
                //Close the pointers
            }
            ps.close();
            return user;

        } catch (Exception e) {
            System.out.println("Erro ao buscar por email");
        }
        return null;
    }
}
