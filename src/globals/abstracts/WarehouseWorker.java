package globals.abstracts;

import globals.classes.Ability;

public abstract class WarehouseWorker {
	private Ability ability;
	
	

	public WarehouseWorker(Ability ability) {
		super();
		this.ability = ability;
	}

	public abstract void checkItem();

	public abstract void receiveItem();

	public abstract void packageItem();
	
	
	public Ability getAbility() {
		return ability;
	}

	public void setAbility(Ability ability) {
		this.ability = ability;
	}
}
