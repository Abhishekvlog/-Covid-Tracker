package com.example.covidtracker;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseModel implements Serializable {

	@SerializedName("date")
	private int date;

	@SerializedName("states")
	private int states;

	@SerializedName("positive")
	private int positive;

	@SerializedName("negative")
	private int negative;

	@SerializedName("pending")
	private int pending;

	@SerializedName("hospitalizedCurrently")
	private int hospitalizedCurrently;

	@SerializedName("hospitalizedCumulative")
	private int hospitalizedCumulative;

	@SerializedName("inIcuCurrently")
	private int inIcuCurrently;

	@SerializedName("inIcuCumulative")
	private int inIcuCumulative;

	@SerializedName("onVentilatorCurrently")
	private int onVentilatorCurrently;

	@SerializedName("onVentilatorCumulative")
	private int onVentilatorCumulative;

	@SerializedName("dateChecked")
	private String dateChecked;

	@SerializedName("death")
	private int death;

	@SerializedName("hospitalized")
	private int hospitalized;

	@SerializedName("totalTestResults")
	private int totalTestResults;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("recovered")
	private Object recovered;

	@SerializedName("total")
	private int total;

	@SerializedName("posNeg")
	private int posNeg;

	@SerializedName("deathIncrease")
	private int deathIncrease;

	@SerializedName("hospitalizedIncrease")
	private int hospitalizedIncrease;

	@SerializedName("negativeIncrease")
	private int negativeIncrease;

	@SerializedName("positiveIncrease")
	private int positiveIncrease;

	@SerializedName("totalTestResultsIncrease")
	private int totalTestResultsIncrease;

	@SerializedName("hash")
	private String hash;

	public int getDate(){
		return date;
	}

	public int getStates(){
		return states;
	}

	public int getPositive(){
		return positive;
	}

	public int getNegative(){
		return negative;
	}

	public int getPending(){
		return pending;
	}

	public int getHospitalizedCurrently(){
		return hospitalizedCurrently;
	}

	public int getHospitalizedCumulative(){
		return hospitalizedCumulative;
	}

	public int getInIcuCurrently(){
		return inIcuCurrently;
	}

	public int getInIcuCumulative(){
		return inIcuCumulative;
	}

	public int getOnVentilatorCurrently(){
		return onVentilatorCurrently;
	}

	public int getOnVentilatorCumulative(){
		return onVentilatorCumulative;
	}

	public String getDateChecked(){
		return dateChecked;
	}

	public int getDeath(){
		return death;
	}

	public int getHospitalized(){
		return hospitalized;
	}

	public int getTotalTestResults(){
		return totalTestResults;
	}

	public String getLastModified(){
		return lastModified;
	}

	public Object getRecovered(){
		return recovered;
	}

	public int getTotal(){
		return total;
	}

	public int getPosNeg(){
		return posNeg;
	}

	public int getDeathIncrease(){
		return deathIncrease;
	}

	public int getHospitalizedIncrease(){
		return hospitalizedIncrease;
	}

	public int getNegativeIncrease(){
		return negativeIncrease;
	}

	public int getPositiveIncrease(){
		return positiveIncrease;
	}

	public int getTotalTestResultsIncrease(){
		return totalTestResultsIncrease;
	}

	public String getHash(){
		return hash;
	}

	@Override
 	public String toString(){
		return 
			"ResponseModel{" + 
			"date = '" + date + '\'' + 
			",states = '" + states + '\'' + 
			",positive = '" + positive + '\'' + 
			",negative = '" + negative + '\'' + 
			",pending = '" + pending + '\'' + 
			",hospitalizedCurrently = '" + hospitalizedCurrently + '\'' + 
			",hospitalizedCumulative = '" + hospitalizedCumulative + '\'' + 
			",inIcuCurrently = '" + inIcuCurrently + '\'' + 
			",inIcuCumulative = '" + inIcuCumulative + '\'' + 
			",onVentilatorCurrently = '" + onVentilatorCurrently + '\'' + 
			",onVentilatorCumulative = '" + onVentilatorCumulative + '\'' + 
			",dateChecked = '" + dateChecked + '\'' + 
			",death = '" + death + '\'' + 
			",hospitalized = '" + hospitalized + '\'' + 
			",totalTestResults = '" + totalTestResults + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",recovered = '" + recovered + '\'' + 
			",total = '" + total + '\'' + 
			",posNeg = '" + posNeg + '\'' + 
			",deathIncrease = '" + deathIncrease + '\'' + 
			",hospitalizedIncrease = '" + hospitalizedIncrease + '\'' + 
			",negativeIncrease = '" + negativeIncrease + '\'' + 
			",positiveIncrease = '" + positiveIncrease + '\'' + 
			",totalTestResultsIncrease = '" + totalTestResultsIncrease + '\'' + 
			",hash = '" + hash + '\'' + 
			"}";
		}
}