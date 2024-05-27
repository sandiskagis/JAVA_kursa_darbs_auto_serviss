package lv.venta.service;

import java.util.ArrayList;

import lv.venta.model.Tire;
import lv.venta.model.TireRating;
import lv.venta.model.TireSize;
import lv.venta.model.TireType;

public interface ITiresService {

	public abstract ArrayList<Tire> selectAllTires() throws Exception;
	
	public abstract Tire selectTireByTireId(int id) throws Exception;
	
	public abstract void deleteTireById(int id) throws Exception;
	
	public abstract void updateTireById(int id) throws Exception;
	
	public abstract Tire insertNewTire(float price, String manufacturer, TireSize tireSize, TireType tireType, int loudnessDb, TireRating drivingInRain, TireRating fuelEfficiency) throws Exception;
	
}
