package globals.abstracts;

import globals.classes.Location;

public abstract class TransportVehicle {
	private  double size;
	private double speed;
	private Location location;

	public TransportVehicle(double size, double speed, Location location) {
		super();
		this.size = size;
		this.speed = speed;
		this.location = location;
	}

	public abstract boolean deliver();

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
}
