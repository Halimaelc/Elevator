package elevator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import factory.elevatorFactoryImpl;
import factory.elevatorFactory;
import state.down;
import state.stop;
import state.up;

public class building {

	private int numberOfFloors;
	private List<Elevator> elevators;
	private elevatorFactory elevatorFactory = elevatorFactoryImpl.getInstance();

	public building(int numberOfFloors, String... elevators) {
		this.numberOfFloors = numberOfFloors;
		this.elevators = new ArrayList<>();
	}

	public String requestElevator() {
		return null;
	}

	public void move(int id, String state) {
		Elevator elevator = elevators.get(id);
		switch (state) {
		case "UP":
			elevator.setState(new up(elevator));
			break;
		case "DOWN":
			elevator.setState(new down(elevator));
			break;
		default:
			throw new IllegalArgumentException("chose between up or down");

		}
	}

	public void stopAt(int id, int floor) {
		Elevator elevator = elevators.get(id);
		elevator.setCurrentfloor(floor);
		elevator.setState(new stop(elevator));
	}

	public String requestElevator(int Requestfloor) {
		 Optional<Elevator> optional= elevators.stream().min(Comparator.comparing(x->x.distanceFromRequestFloor(Requestfloor)));
	     return "id"+optional.get().getId();
	}

}