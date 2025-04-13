package auto.blue.auto_blue.service;

import auto.blue.auto_blue.model.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleById(Long id);
    Vehicle createVehicle(Vehicle vehicle);
    Vehicle updateVehicle (Long id, Vehicle vehicle);
    void deleteVehicle(Long id);

}
