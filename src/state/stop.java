package state;

import elevator.Elevator;

public class stop extends elevatorState {
	private Elevator elevator;

	public stop(Elevator elevator) {
		super(elevator);
		// TODO Auto-generated constructor stub
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
		elevator.setState(new resting(elevator));
		
	}

	@Override
	public void stop() {
		throw new IllegalStateException("Elevator is stoped ");
	}

	@Override
	public int distanceFromRequestFloor(int Requestfloor) {
		// TODO Auto-generated method stub
		return -1;
	}

}
