package factory;

import elevator.Elevator;

public class elevatorFactoryImpl extends elevatorFactory{
	
	public static elevatorFactoryImpl _instance=null;
	
	private elevatorFactoryImpl(){}
	
	public static elevatorFactoryImpl getInstance(){
		if(_instance==null)
			return new elevatorFactoryImpl();
		return _instance;}

	@Override
	public Elevator createElevator(int numberOffloors, String Idelevator) {
		String id = Idelevator.split(":")[0];
        int currentFloor = Integer.valueOf(Idelevator.split(":")[1]);
        return  new Elevator(numberOffloors, id, currentFloor);
	}

}
