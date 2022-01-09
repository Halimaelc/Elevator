package state;

import elevator.Elevator;

public class resting extends elevatorState{
	private Elevator elevator;
	
	public resting(Elevator elevator) {
		super(elevator);
		
	}

	@Override
	public void up() {
		elevator.setState(new up(elevator));
		
	}

	@Override
	public void down() {
		elevator.setState(new down(elevator));
		
	}

	@Override
	public void resting() {
		throw new IllegalStateException("Already resting");
		
	}

	@Override
	public int distanceFromRequestFloor(int Requestfloor) {
		return Math.abs(Requestfloor - elevator.getCurrentfloor()); 
		
	}

	@Override
	public void stop() {
		elevator.setState(new stop(elevator));
		
	}

}
