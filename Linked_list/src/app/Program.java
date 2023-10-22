package app;

import java.util.Locale;
import java.util.Scanner;

import util.Lista;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		var l = new Lista();
		int opcao = 0;

		while (opcao != 4) {
			System.out.println();
			System.out.println("1) Inserir elementos na lista");
			System.out.println("2) Mostrar lista");
			System.out.println("3) Remover");
			System.out.println("4) Sair \n");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("Digite um nome: ");
				String valor = sc.next();
				l.adicionar(valor);
				break;
			}
			case 2: {
				System.out.println(l.toString());
				break;
			}
			case 3: {
				System.out.println("Digite um nome para remover: ");
				String valor = sc.next();
				l.remover(valor);
				break;
			}
			case 4: {
				System.out.println("Fim do programa");
				break;
			}
			default: {
				System.out.println("Opção Inválida");
			}
			}
		}

		sc.close();
	}
}