package factory;

import elevator.Elevator;

public abstract class elevatorFactory {

	public abstract Elevator createElevator(int numberOffloors, String IdElevator);

}
