/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import config.database.MysqlConnection;
import models.Employee;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nzinga
 */
public class EmployeeRepository {

    public static void add(Employee employee) throws Exception {
        String sql = "INSERT INTO funcionario(Bi, primeiro_nome, ultimo_nome, nacionalidade,sexo,data_nascimento,cargo) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            ps.setString(1, employee.getBi());
            ps.setString(2, employee.getFirstName());
            ps.setString(3, employee.getLastName());
            ps.setString(4, employee.getNacionality());
            ps.setString(5, Character.toString(employee.getSex()));
            Date sqlBirthDate = new Date(employee.getBirthDate().getTime());
            ps.setDate(6, sqlBirthDate);
            ps.setString(7, employee.getOffice());

            ps.execute();
            ps.close();

        } catch (Exception e) {
            throw new Exception();

        }

    }

    public static ArrayList<Employee> getAll() throws Exception {
        String sql = "select * from funcionario";
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        PreparedStatement ps = null;
        try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            try (ResultSet employeeResultSet = ps.executeQuery()) {
                while (employeeResultSet.next()) {
                    int id = employeeResultSet.getInt("id");
                    String firstName = employeeResultSet.getString("primeiro_nome");
                    String lastName = employeeResultSet.getString("ultimo_nome");
                    String bi = employeeResultSet.getString("Bi");
                    String nacionality = employeeResultSet.getString("nacionalidade");
                    char sex = employeeResultSet.getString("sexo").charAt(0);
                    java.util.Date birthDate = employeeResultSet.getDate("data_nascimento");
                    String Office = employeeResultSet.getString("cargo");
                    
                    Employee employee = new Employee(
                            bi,
                            firstName,
                            lastName,
                            nacionality,
                            sex,
                            birthDate,
                            Office
                    );
                    employee.setId(id);
                    listEmployee.add(employee);
                }
                ps.close();
            }

        } catch (Exception e) {
            throw new Exception("Erro ao buscar informação");

        }
        return listEmployee;

    }

}
