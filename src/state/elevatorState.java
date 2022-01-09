package state;

import elevator.Elevator;

public abstract class elevatorState {
private Elevator elevator;
	
	public elevatorState(Elevator elevator) {
		super();
		this.elevator = elevator;
	}
	
	public abstract void up();
	public abstract void down();
	public abstract void resting();
	public abstract void stop();
	
	public abstract int distanceFromRequestFloor(int Requestfloor);

	

}

