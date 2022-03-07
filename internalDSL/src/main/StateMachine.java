package main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.metamodel.*;

public class StateMachine {
	
	
	private State initial; 
	private Map<String,State> states = new HashMap<>(); 
	private State current;
	private String currentEvent;
	private Transition currentTrans;
 
	private List<String> var = new ArrayList<String>();
	

	
	
	private State getState(String name) {
		if(!states.containsKey(name)) states.put(name, new State(name));
		return states.get(name);
	}
		
	
	public Machine build() { 
		
		return new Machine(states.values(), initial, var); 
	}


	public StateMachine state(String string) {
		checkStateMachine(string);
		current = states.get(string);
		return this;
	}

	public StateMachine initial() {
		initial = current;
	
		return this;
	}
	

	public void checkStateMachine(String string) {
		if(!states.containsKey(string)) {
			states.put(string, new State(string));
		}
	}

	public StateMachine when(String string) {
		
		currentEvent = string;
		return this;
	}

	public StateMachine to(String string) {
		checkStateMachine(string);
		currentTrans = new Transition(currentEvent,getState(string));
		current.addTransition(currentTrans);
		
		return this;
	}

	public StateMachine integer(String string) {
		var.add(string);
		return this;
	}

	public StateMachine set(String string, int i) {
		
		return null;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
