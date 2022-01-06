
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Hector");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2, "Saimon");
		
		System.out.println(list.size());
		
		
		
		for(String x : list) {
			
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		list.remove(1);  // Pode remover pelo indice ou pelo valor
		list.removeIf(x -> x.charAt(0) == 'H'); // Usa um predicado e remove pela inicial
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marco")); // Caso não encontrado retorna -1
		
		System.out.println("-----------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // Filtrando para exibir todos que começam com determinado predicado
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); // Caso não encontre voce pode informar o que deseja
		
		System.out.println(name);
		

	}

}
