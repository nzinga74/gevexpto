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
/**
 *
 * @author nzinga
 */
public class VehicleRepository {
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
