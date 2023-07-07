package entities;

public class notas {
	public String Name;
	public double noteOne;
	public double noteTwo;
	public double noteThree;
	
	public double finalGrades () {
		return noteOne + noteTwo + noteThree;
	}
	 
	public String toString () {
		return "FINAL GRADE = " + String.format("%.2f", Math.abs(finalGrades()));
	}
}
