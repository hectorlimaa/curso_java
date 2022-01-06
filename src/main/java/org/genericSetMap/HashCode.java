import entidades.ClientHashEquals;

public class HashCode {

	public static void main(String[] args) {

		ClientHashEquals c1 = new ClientHashEquals("Maria", "maria@gmail.com");
		ClientHashEquals c2 = new ClientHashEquals("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test"; // Dessa forma ele não da um tratamento especial de Objeto
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
	}

}
