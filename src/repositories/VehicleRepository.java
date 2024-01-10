/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package repositories;
import config.database.MysqlConnection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import models.Driver;
import models.Employee;
import models.Motor;
import models.Route;
import models.Tire;
import models.User;
import models.Vehicle;
import models.AutoMobile;
/**
 *
 * @author nzinga
 */
public class VehicleRepository {
    public static void add(AutoMobile vehicle) throws Exception {
        String sql = "INSERT INTO veiculo(tipo, marca, modelo,matricula,ano, lotacao, id_rota, id_funcionario,id_motor) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            ps.setString(1, vehicle.getType());
            ps.setString(2, vehicle.getBrand());
            ps.setString(3, vehicle.getModel());
            ps.setString(4, vehicle.getCarRegistration());
            ps.setInt(5, vehicle.getYear());
            ps.setInt(6, vehicle.getCapacity());
            if(vehicle.getMotor()== null){
                 ps.setNull(9, 0);
            }else {
                ps.setInt(9, vehicle.getMotor().getId());
            }
            ps.setInt(7, vehicle.getRoute().getId());
            ps.setInt(8, vehicle.getDriver().getId());
           
            

            ps.execute();
            ps.close();
        } catch (Exception e) {
            System.out.println("Erro aqui");
            
            throw new Exception();
        }
    }

    public static ArrayList<Vehicle> getAll() throws Exception{
       String sql = "select * from veiculo";
       ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
       PreparedStatement ps = null;
       try {
            ps = MysqlConnection.getConnection().prepareStatement(sql);
            ResultSet vehicleResultSet = ps.executeQuery();
            while (vehicleResultSet.next()) {
                int id = vehicleResultSet.getInt("id");
                String type = vehicleResultSet.getString("tipo");
                String brand = vehicleResultSet.getString("marca");
                String model = vehicleResultSet.getString("modelo");
                String carRegistration = vehicleResultSet.getString("matricula");
                int year = vehicleResultSet.getInt("ano");
                int capacity = vehicleResultSet.getInt("lotacao");
                int motorId = vehicleResultSet.getInt("id_motor");
                int routeId = vehicleResultSet.getInt("id_rota");
                int employeeId = vehicleResultSet.getInt("id_funcionario");
                Motor motor = new Motor();
                Driver employee = new Driver();
                Route route = new Route();
                Tire tire = new Tire();
                employee.setId(id);
                motor.setId(motorId);
                route.setId(routeId);
                Vehicle vehicle = new Vehicle(id,type,brand,model,carRegistration,year,capacity,tire,employee);
                vehicleList.add(vehicle);
            }
            ps.close();
            vehicleResultSet.close();
            
            return vehicleList;
        } catch (Exception e) {
            throw new Exception("Erro ao buscar os usuários");
        }
       
    }
}
