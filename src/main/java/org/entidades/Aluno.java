package entidades;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String aprovacao() {
		 String result;
		if (notaFinal() > 60 ) {
			 result = "\nPASS";
		}else {
			double falta = 60 - notaFinal();
			 result = "\nFAILED \n MISSING " + String.format("%.2f", falta) + " POINTS";
		}
		
		return result;
	}

	public String toString() {
		return "\nFINAL GRADE = " + String.format("%.2f", notaFinal()) +  aprovacao();
	}
}
