package state;

import elevator.Elevator;

public class down extends elevatorState{
	private Elevator elevator;
	public down(Elevator elevator) {
		super(elevator);
	}
	
	@Override
	public int distanceFromRequestFloor(int Requestfloor) {
		if(Requestfloor >= elevator.getCurrentfloor())
			return Requestfloor-elevator.getCurrentfloor();
		else 
			return Requestfloor-elevator.getCurrentfloor()*(-1);
	}
	
	@Override
	public void resting() {
		elevator.setState(new resting(elevator));	
		
	}

	@Override
	public void up() {
		throw new IllegalStateException("elevator is going down and didn't reach the edges yet ");
	
	}

	@Override
	public void down() {
		throw new IllegalStateException("Already going down ");
		
	}

	@Override
	public void stop() {
		elevator.setState(new stop(elevator));
	}

}
