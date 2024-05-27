package lv.venta.service;

import java.util.ArrayList;

import lv.venta.model.LightType;
import lv.venta.model.LightUseType;
import lv.venta.model.Lights;

public interface ILightsService {

	public abstract ArrayList<Lights> selectAllLights() throws Exception;
	
	public abstract Lights selectLightsById(int id) throws Exception;
	
	public abstract void deleteLightById(int id) throws Exception;
	
	public abstract void updateLightById(int id, LightType lightType, LightUseType lightUseType, int lightColorKelvin, int powerWatt) throws Exception;
	
	public abstract Lights insertNewLights(LightType lightType, LightUseType lightUseType, int lightColorKelvin, int powerWatt) throws Exception;;
}
