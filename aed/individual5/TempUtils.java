package aed.individual5;

import es.upm.aedlib.Pair;
import es.upm.aedlib.map.*;

public class TempUtils {
	/**
	 * 
	 * @param startTime
	 * @param endTime
	 * @param tempData
	 * @return un map que para cada ciudad donde se ha medido
	 * la temperatura en el intervalo [startTime...endTime] 
	 * contiene un Entry<String,Integer> con la ciudad 
	 * como clave y como valor la temperatura maxima medida
	 */
	public static Map<String, Integer> maxTemperatures(long startTime, long endTime, TempData[] tempData) {
		Map<String, Integer> res = new HashTableMap<String, Integer>();
		
		//Recorro el array
		for (int i = 0; i < tempData.length; i++) {
			long tiempo = tempData[i].getTime();
			
			//Mirar si el tiempo medido es legal
			if (tiempo <= endTime && tiempo >= startTime) {
				String key = tempData[i].getLocation();
				int value = tempData[i].getTemperature();
				
				if (res.containsKey(key)) {
					//si en res ya esta el key, 
					//comparo su valor con el value del array
					//asigno el mayor valor a key
					if (res.get(key) < value)
						res.put(key, value);
				} else
					res.put(key, value);
			}
		}

		return res;
	}

	/**
	 * 
	 * @param startTime
	 * @param endTime
	 * @param region
	 * @param tempData
	 * @param regionMap
	 * @return un Pair<String,Integer>, con una ciudad 
	 * donde se ha medido la temperatura maxima 
	 * en el intervalo [startTime...endTime], en la region especifcada.
	 */
	public static Pair<String, Integer> maxTemperatureInRegion(long startTime, long endTime, String region,
			TempData[] tempData, Map<String, String> regionMap) {
		
		//si el array es null o no contiene elementos, devuelve null
		if (tempData.length == 0 || tempData == null)
			return null;
		
		Pair<String, Integer> res = new Pair<String, Integer>(null, null);
		String maxLeft = null;
		int maxRight = -1;
		
		for (int i = 0; i < tempData.length; i++) {
			long tiempo = tempData[i].getTime();
			
			//Mirar si el tiempo medido es legal
			if (tiempo <= endTime && tiempo >= startTime) {
				String key = tempData[i].getLocation();
				int value = tempData[i].getTemperature();
				
				//Mirar si las ciudades del array son legales,
				//es decir, son de la region que pide
				if (region.equals(regionMap.get(key))) {
					
					//Buscar la maxima temperatura 
					//de los elementos legales del array
					if(maxRight<value) {
						maxLeft = key;
						maxRight = value;
					}
				}
			}
		}
		//coloco el par de maxima temperatura
		res.setRight(maxRight);
		res.setLeft(maxLeft);
		if (res.getLeft() == null)
			return null;
		return res;
	}

}
