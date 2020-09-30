package cse360assignment02;

public class Main{
	public static void main(String[] args) {
		AddingMachine calculator = new AddingMachine();
		calculator.add(99);
		calculator.add(100);
		calculator.subtract(5);
		calculator.add(99);
		calculator.add(100);
		calculator.subtract(5);
		System.out.println(calculator.toString());
		System.out.println(calculator.getTotal());	
	}
}