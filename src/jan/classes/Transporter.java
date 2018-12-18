package jan.classes;

import globals.abstracts.TransportVehicle;
import globals.classes.Location;

public class Transporter extends TransportVehicle {

	public Transporter(double size, double speed, Location location) {
		super(size, speed, location);

	}

	@Override
	public boolean deliver() {
		// TODO Auto-generated method stub
		return false;
	}

}
