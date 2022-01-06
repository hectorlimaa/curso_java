package orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class ProblemaProdutos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto x;
		x = new Produto();
		int res;

		System.out.println("Digite os dados do produto :");

		System.out.print("Nome: ");
		x.nome = sc.next();
		System.out.print("Preço: ");
		x.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		x.quantidade = sc.nextInt();

		System.out.println("Dados do produto: "+ x);
		System.out.println("Digite o número de produtos que deseja adicionar :");
		res = sc.nextInt();
		x.AddProdutos(res);
		System.out.println("Valores atualizados " + x);
		System.out.println("Digite o número de produtos que deseja remover :");
		res = sc.nextInt();
		x.RemoverProdutos(res);
		System.out.println("Valores atualizados " + x);

		sc.close();
	}

}
