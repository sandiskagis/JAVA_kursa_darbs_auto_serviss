package lv.venta.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.Client;

public interface IClientRepo extends CrudRepository<Client, Integer>{
	ArrayList<Client> findByCarIdCar(int id);

	ArrayList<Client> findByClientPhoneNo(String phoneNo);
	
	ArrayList<Client> findByClientNameAndSurname(String name, String surname);
}