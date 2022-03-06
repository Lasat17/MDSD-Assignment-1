package main.metamodel;

public class Transition {
	
	private String event;
	private State to;

	private boolean hasSetOperation;
	private boolean hasIncrementOperation;
	private boolean hasDecrementOperation;
	private boolean hasOperation;
	private boolean isConditional;
	private boolean isConditionEqual;
	private boolean isConditionLessThan;
	private boolean isConditionGreaterThan;
	
	public Transition(String event, State to) {
		super();
		this.event = event;
		this.to = to;
	}
	
	

	public String getEvent() {
		return event;
	}

	public State getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasSetOperation() {
		// TODO Auto-generated method stub
		return this.hasSetOperation;
	}

	public boolean hasIncrementOperation() {
		// TODO Auto-generated method stub
		return this.hasIncrementOperation;
	}

	public boolean hasDecrementOperation() {
		// TODO Auto-generated method stub
		return this.hasDecrementOperation;
	}

	public String getOperationVariableName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean isConditional() {
		// TODO Auto-generated method stub
		return this.isConditional;
	}

	public String getConditionVariableName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getConditionComparedValue() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public boolean isConditionEqual() {
		// TODO Auto-generated method stub
		return this.isConditionEqual;
	}
	
	
	public boolean isConditionGreaterThan() {
		// TODO Auto-generated method stub
		return this.isConditionGreaterThan;
	}
	
	public boolean isConditionLessThan() {
		// TODO Auto-generated method stub
		return this.isConditionLessThan;
	}

	public boolean hasOperation() {
		// TODO Auto-generated method stub
		return this.hasOperation;
	}

}
