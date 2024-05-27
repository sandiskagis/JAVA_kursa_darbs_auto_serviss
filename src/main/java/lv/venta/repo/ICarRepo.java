package lv.venta.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.Car;
import lv.venta.model.CarBrand;
import lv.venta.model.CarType;


public interface ICarRepo extends CrudRepository<Car,Integer>{
	ArrayList<Car>findCarById(int idCar);
	ArrayList<Car>findCarByBrand(CarBrand brand);
	ArrayList<Car>findCarByNumber(String carNumber);
	ArrayList<Car>findCarByTypeAndModel(CarType type,String model);
}
