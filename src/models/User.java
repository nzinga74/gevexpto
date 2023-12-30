/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nzinga
 */
public class User {
    protected int id;
    protected String email;
    protected String password;
    protected int accessLevel;
    protected int state;
    protected Employee employee;
    
    
    public User(int id, String email, String password, int accessLevel, int state, Employee employee) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.accessLevel = accessLevel;
        this.state = state;
        this.employee = employee;
    }

    public User(String email, String password, int accessLevel, int state, Employee employee) {
        this.email = email;
        this.password = password;
        this.accessLevel = accessLevel;
        this.state = state;
        this.employee = employee;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
   
    
    
}
