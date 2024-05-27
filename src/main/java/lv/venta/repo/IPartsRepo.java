package lv.venta.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.Parts;



public interface IPartsRepo extends CrudRepository<Parts, Integer>{
	//ArrayList<Part>findById(int idPa);
	
}
