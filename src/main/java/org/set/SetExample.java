package set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>(); // Forma rápida porem não mantém a a ordem
		Set<String> setTree = new TreeSet<>(); // Forma Lenta porém ele ordena o conjunto de elementos em ordem alfabética
		Set<String> setLinked = new LinkedHashSet<>(); //Velocidade intermediária Mantém a ordem que foi inserido no conjunto

		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println(set.contains("Notebook"));// método contains localiza se tem o item no conjunto
		for (String p : set) {
			System.out.println(p);
		}

		System.out.println("--------------------------");

		setTree.add("Tv");
		setTree.add("Tablet");
		setTree.add("Computador");
		setTree.add("Armario");

		System.out.println(setTree.contains("Notebook"));
		for (String p : setTree) {
			System.out.println(p);
		}

		System.out.println("--------------------------");

		setLinked.add("Tv");
		setLinked.add("Dvd");
		setLinked.add("Notebook");
		setLinked.add("Armario");
		
		setLinked.remove("Armario");// Remove de acordo com item informado
		setLinked.removeIf(x -> x.length() >= 3); // informa o predicado e remove todos os itens

		System.out.println(setLinked.contains("Notebook")); 
		for (String p : setLinked) {
			System.out.println(p);

		}
		// Unir itens sem repetir 
		Set<String> setUnir = new HashSet<>(set);
		setUnir.addAll(setTree);
		System.out.println(setUnir); 
		
		
		// Intersecçao - Modifica a coleção deixando os valores que tem em ambas as coleção de itens
		
		Set<String> setIntersec = new HashSet<>(set);
		setIntersec.retainAll(setTree);
		System.out.println(setIntersec);
		
		//Diferença entre coleções - Modifica a coleção de itens  deixando somente os valores que são diferente da coleção informada
		
		Set<String> setDif = new HashSet<>(set);
		setDif.removeAll(setTree);
		System.out.println(setDif);

	}

}
