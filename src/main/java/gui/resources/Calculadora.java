package gui.resources;

public class Calculadora {
	
	private Double num1;
	private Double num2;

	public void Calculadora(Double num1, Double num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public Double suma(Double num1, Double num2) {
		return num1+num2;
		
	}

	public Double resta(Double num1, Double num2) {
		return num1-num2;
		
	}
	
	public Double multiplica(Double num1, Double num2) {
		return num1*num2;
		
	}
	
	public Double divide(Double num1, Double num2) {
		return num1/num2;
		
	}
	
}
