/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import config.database.MysqlConnection;
import java.sql.Date;
import models.Employee;
import models.Vehicle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.Manutencao;


/**
 *
 * @author nzinga
 */
public class ManutencaoRepository {
    public static void add(Manutencao manutec) throws Exception {
        String sql = "INSERT INTO manutencao(tipo, descricao, custo, estado, id_funcionario, id_veiculo) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            
            ps.setString(1, manutec.getTipo());
            ps.setString(2, manutec.getDescricao());
            ps.setInt(3, (int)manutec.getCusto());
            ps.setString(4, manutec.getEstado());
            ps.setInt(5,  (int)manutec.getEmployee());
            ps.setInt(6, (int)manutec.getVehicle());

            ps.execute();
            ps.close();

        } catch (Exception e) {
            System.out.println("falha ao fazer manutencao");
            throw new Exception();
            
        }

    }
    
    
    public static ArrayList<Manutencao> getAll() throws Exception {
        String sql = "select * from manutencao";
        ArrayList<Manutencao> listManutencao = new ArrayList<Manutencao>();
        PreparedStatement ps = null;
        try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            try (ResultSet manutencaoResultSet = ps.executeQuery()) {
                while (manutencaoResultSet.next()) {
                    int id = manutencaoResultSet.getInt("id");
                    String tipo = manutencaoResultSet.getString("tipo");
                    String descricao = manutencaoResultSet.getString("descricao");
                    int custo = manutencaoResultSet.getInt("custo");
                    String estado = manutencaoResultSet.getString("Estado");
                    int id_funcionario = manutencaoResultSet.getInt("id_funcionario");
                    int id_veiculo = manutencaoResultSet.getInt("id_veiculo");
                    
                    
                    Manutencao manutencao;
                    manutencao = new Manutencao(
                            tipo, descricao, custo, id_funcionario, id_veiculo
                    );
                    manutencao.setId(id);
                    listManutencao.add(manutencao);
                }
                ps.close();
            }

        } catch (Exception e) {
            throw new Exception("Erro ao buscar informação");

        }
        return listManutencao;

    }

   
}
