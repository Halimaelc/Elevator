package elevator;

import state.elevatorState;

public class Elevator {
	private int id;
	private elevatorState state;
	private int numberOfFloors;
	private int currentfloor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public elevatorState getState() {
		return state;
	}
	public void setState(elevatorState state) {
		this.state = state;
	}
	public int getNumberOffloors() {
		return numberOfFloors;
	}
	public void setNumberOffloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	public int getCurrentfloor() {
		return currentfloor;
	}
	public void setCurrentfloor(int currentfloor) {
		this.currentfloor = currentfloor;
	}
	public Elevator(int id, elevatorState state, int numberOfFloors, int currentfloor) {
		//super();
		this.id = id;
		this.state = state;
		this.numberOfFloors = numberOfFloors;
		this.currentfloor = currentfloor;
	}
	/*
	 * public Elevator(int numberOffloors2, String id2, int currentFloor2) { // TODO
	 * Auto-generated constructor stub }
	 */
	/*
	 * public void stop(int floor) { Elevator elevator; this.currentfloor=floor; //
	 * state=new state.stop(elevator); elevator.setState(new stop(elevator)); }
	 */
	
	public Elevator(int numberOffloors2, String id2, int currentFloor2) {
		// TODO Auto-generated constructor stub
	}
	public int  distanceFromRequestFloor(int floor){
		return state.distanceFromRequestFloor(floor);
	}
	
	

}
