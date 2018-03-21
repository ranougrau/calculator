package calculator.operations;

public abstract class Multiplication extends Operation{
	
	public String getName() {
		return "multiplication";
	}

	
	public String getOperator() {
		return "*";
	
	}
	
	@Override
	public double calc() {
		return a * b;
	}

}
