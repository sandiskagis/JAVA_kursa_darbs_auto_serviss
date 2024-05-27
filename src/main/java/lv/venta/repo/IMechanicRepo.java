package lv.venta.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.Mechanic;

public interface IMechanicRepo extends CrudRepository<Mechanic, Integer>{
	ArrayList<Mechanic> findByCarIdCar(int id);
	ArrayList<Mechanic> findByMechanicPhoneNo(String phoneNo);
	ArrayList<Mechanic> findByMechanocLicenceNo(String licenceNo);
	ArrayList<Mechanic> findByClientNameAndSurname(String name, String surname);
}