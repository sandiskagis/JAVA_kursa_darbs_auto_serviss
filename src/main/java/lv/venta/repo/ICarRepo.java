package lv.venta.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.Car;
import lv.venta.model.CarBrand;
import lv.venta.model.CarType;


public interface ICarRepo extends CrudRepository<Car,Integer>{
	/*ArrayList<Car>findById(int idCar);
	ArrayList<Car>findByBrand(CarBrand brand);
	ArrayList<Car>findByCarNumber(String carNumber);
	ArrayList<Car>findByTypeAndModel(CarType type,String model);
	*/
}
