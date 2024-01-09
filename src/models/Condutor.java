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
public class Condutor extends Employee {

    public Condutor() {
    }
    
    public Condutor(String bi, String firstName, String lastName, String nacionality, char sex, Date birthDate, String office) {
        super(bi, firstName, lastName, nacionality, sex, birthDate, office);
    }
   
}
