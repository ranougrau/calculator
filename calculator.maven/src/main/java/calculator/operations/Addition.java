package calculator.operations;

public class Addition extends Operation {
	
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
