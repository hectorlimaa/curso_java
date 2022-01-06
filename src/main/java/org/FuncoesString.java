
public class FuncoesString {
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG";
		int indexOf = original.indexOf("b");
		int LastIndexOf = original.lastIndexOf("b");
		
		String s = "Hector da Silva Lima";
		String[] vetor = s.split(" "); // gera um array com valores de uma string informando o separador
		
		
		System.out.println(original.toLowerCase()); // Converter p/ minusculo
		System.out.println(original.toUpperCase()); // Converter p/ maiusculo
		System.out.println(original.trim()); // Remover espaços no inicio e fim 
		System.out.println(original.substring(0/*inicio*/, 5 /*fim*/)); // recorta gerando uma nova string com argumento informado
		System.out.println(original.replace("a"/*caracter que deseja trocar*/,"x"/*substituto*/));
		System.out.println(indexOf); // localiza o indice do primerio argumento informado
		System.out.println(LastIndexOf); // localiza o indice do ultimo argumento informado
		System.out.println(vetor[0]); // Exemplo do split lá de cima
		System.out.println(vetor[1]); // split *****
		System.out.println(vetor[2]); // split *****
		

	}

}
