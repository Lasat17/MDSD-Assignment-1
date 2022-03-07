package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {

	private String name;
	private List<Transition> trans = new ArrayList<>();
 	
	public State(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return trans;
	}

	public Transition getTransitionByEvent(String string) {
		for (Transition transition : trans) {
			if(transition.getEvent().equalsIgnoreCase(string)) {
				return transition;
			}
		}
		
		    return null;
		
	}
	
	public void addTransition(Transition t) {
		this.trans.add(t);
	}
	
	

}
