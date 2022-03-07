package main;

import main.metamodel.Machine;
import main.metamodel.State;

public class MachineInterpreter {
	
	private Machine machine;
	private State state;

	public void run(Machine m) {
		this.machine = m;
		this.state = machine.getInitialState();
		// TODO Auto-generated method stub
		 
	}

	public State getCurrentState() {
		// TODO Auto-generated method stub
		return state;
	}

	public void processEvent(String string) {
		// TODO Auto-generated method stub
		
	}
	

	public int getInteger(String string) {
		// TODO Auto-generated method stub
		return machine.getInteger(string);
	}

}
