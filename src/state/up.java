package state;

import elevator.Elevator;

public class up extends elevatorState {
	private Elevator elevator;
	public up(Elevator elevator) {
		super(elevator);
	}
	
	@Override
	public int distanceFromRequestFloor(int Requestfloor) {
		if(Requestfloor >= elevator.getCurrentfloor())
			return Requestfloor-elevator.getCurrentfloor();
		else 
			return Requestfloor-elevator.getCurrentfloor()*(-1);
	}
	//public void rest() {
		//elevator.setState("rest");	
		
	//}

	@Override
	public void up() {
		throw new IllegalStateException("already doing up");		
	}

	@Override
	public void down() {
		throw new IllegalStateException("elevator is going up and didn't reach the edges yet");
		
	}

	@Override
	public void resting() {
		elevator.setState(new resting(elevator));	
	}

	@Override
	public void stop() {
		elevator.setState(new stop(elevator));
		
	}
	
	

}
