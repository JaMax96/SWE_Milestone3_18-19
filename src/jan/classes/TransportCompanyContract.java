package jan.classes;

import java.util.List;

import globals.abstracts.TransportVehicle;

public class TransportCompanyContract {
	private int duration;
	private double cost;
	private List<TransportVehicle> vehicles;

	public TransportCompanyContract(int duration, double cost, List<TransportVehicle> vehicles) {
		super();
		this.duration = duration;
		this.cost = cost;
		this.vehicles = vehicles;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public List<TransportVehicle> getVehicles() {
		return vehicles;
	}


}
