package calculator.operations;

public class Subtraction extends Operation {
	public String getName() {
		return "subtraction";
	}

	
	public String getOperator() {
		return "-";
	
	}
	
	@Override
	public double calc() {
		return a - b;
	}

}
