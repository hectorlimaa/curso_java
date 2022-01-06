package utilitarios;

public class ConversorDolar {
	
	
	public static double iof = 1.06;
		
	
	public static double converter(double dolar, double valorDolar) {
		return dolar * valorDolar * iof;  
		
	}
	

}
