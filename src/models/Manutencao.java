/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nzinga
 */
public class Manutencao {
    
    private int id;
    private String tipo;
    private String descricao;
    private int custo;
    private String estado;
    private int employee;
    private int vehicle;

    public Manutencao(int id, String tipo, String descricao, int custo, int empregado, int veiculo) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.custo = custo;
        this.employee = empregado;
        this.vehicle = veiculo;
    }
    
    public Manutencao( String tipo, String descricao, int custo, int empregado, int veiculo) {
        
        this.tipo = tipo;
        this.descricao = descricao;
        this.custo = custo;
        this.employee = empregado;
        this.vehicle = veiculo;
    }
    
    

    public int getEmployee() {
        return employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }

    public int getVehicle() {
        return vehicle;
    }

    public void setVehicle(int vehicle) {
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
