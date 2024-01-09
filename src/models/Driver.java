/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author nzinga
 */
public class Driver extends Condutor {
    
    private String drivingLicense;

    public Driver() {
    }
    
    public Driver(String drivingLicense, String bi, String firstName, String lastName, String nacionality, char sex, Date birthDate, String office) {
        super(bi, firstName, lastName, nacionality, sex, birthDate, office);
        this.drivingLicense = drivingLicense;
    }
     public Driver( String bi, String firstName, String lastName, String nacionality, char sex, Date birthDate, String office) {
        super(bi, firstName, lastName, nacionality, sex, birthDate, office);
        //this.drivingLicense = drivingLicense;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    
    

    
    
    
    
    
    
}
