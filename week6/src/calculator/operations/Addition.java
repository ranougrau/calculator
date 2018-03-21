package calculator.operations;

public abstract class Addition extends Operation {
	
	public String getName() {
		return "addition";
	}

	
	public String getOperator() {
		return "+";
	
	}
	
	@Override
	public double calc() {
		return a + b;
	}
}
