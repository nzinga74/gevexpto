/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nzinga
 */
public class Route {
    protected int id;
    protected String origin;
    protected String destination;
    protected double distance;

    public Route() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Route(int id, String origin, String destination, double distance) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
    }
    
    
    public Route(String origin, String destination, double distance) {
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
    }

    public String getOrigin() {
        return origin;
    }

    public Route(int id) {
        this.id = id;
    }
    
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    
    
    
}
