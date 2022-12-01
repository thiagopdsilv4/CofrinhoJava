package uninter;

import java.util.Scanner;

public class Menu {

	private Scanner sc;
	private Cofrinho cofrinho;

	public Menu() {// Construtor utilizado para instanciação de objetos.
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}

	public void exibirMenuPrincipal() {
		System.out.println("COFRINHO: ");
		System.out.println("1-Adicionar moeda: ");
		System.out.println("2-Remover moeda: ");
		System.out.println("3-Listar moeda: ");
		System.out.println("4-Calcular valor total convertido para real:");
		System.out.println("0-Encerrar");

		String opcaoSelecionada = sc.next();

		switch (opcaoSelecionada) {
		case "0":
			System.out.println("Fim do programa");
			break;
		case "1":
			exibirSubMenuDeAdicionarMoedas();
			exibirMenuPrincipal();
			break;
			
			/* int opcaoMoeda = sc.nextInt();

			System.out.println("Digite o valor: ");
			System.out.println();

			String valorMoeda = sc.next();

			valorMoeda = valorMoeda.replace(",", ".");// primeiro parametro é qual caractere trocar e o segundo é qual
														// vai substituir o segundo
			double valorTextualMoeda = Double.valueOf(valorMoeda);

			// System.out.println("O valor da moeda é: " + valorMoeda);

			Moeda moeda = null;

			if (opcaoMoeda == 1) {
				moeda = new Real(valorTextualMoeda);// instanciar e depois adicionar ao cofrinho
				cofrinho.adicionar(moeda);
			} else if (opcaoMoeda == 2) {
				moeda = new Dolar(valorTextualMoeda);// instanciar e depois adicionar ao cofrinho
				cofrinho.adicionar(moeda);
			} else if (opcaoMoeda == 3) {
				moeda = new Euro(valorTextualMoeda);// instanciar e depois adicionar ao cofrinho
				cofrinho.adicionar(moeda);
			}

			cofrinho.adicionar(moeda);
			System.out.println("Moeda adicionada!");
			System.out.println();// apenas para uma linha vazia

			exibirMenuPrincipal();
			break;

		
		*/
		case "2":
			exibirSubMenuRemoverMoeda();
			exibirMenuPrincipal();
			break;	
			
		case "3":
			cofrinho.listagemMoedas();
			exibirMenuPrincipal();
			break;
			
		case "4":
			double valorTotalConvertido = cofrinho.totalConvertido();
			System.out.printf("O valor total convertido para real? %.2f\n", valorTotalConvertido);
			exibirMenuPrincipal();
			break;

		default:
			System.out.println("Opção inválida!");
			exibirMenuPrincipal();
			break;
		}
	}

	private void exibirSubMenuDeAdicionarMoedas() { //adicionado subMenu para melhor organizar o código, porém não é obrigatório
		System.out.println("Escolha a moeda: ");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar: ");
		System.out.println("3 - Euro: ");
		
		int opcaoSelecionada = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		System.out.println();//apenas para dar uma linha em branco
		
		double valorMoeda = sc.nextDouble();
		
		Moeda moeda = null;
		
		if(opcaoSelecionada == 1) {
			moeda = new Real(valorMoeda);
		}else if(opcaoSelecionada == 2){
			moeda = new Dolar(valorMoeda);
		}else if(opcaoSelecionada == 3){
			moeda = new Euro(valorMoeda);
		}else {
			System.out.println("Moeda inexistente");
			exibirMenuPrincipal();
		}
		
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada");
		
	}
	
	private void exibirSubMenuRemoverMoeda() { //adicionado subMenu para melhor organizar o código, porém não é obrigatório
		System.out.println("Escolha a moeda: ");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar: ");
		System.out.println("3 - Euro: ");
		
		int opcaoSelecionada = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		System.out.println();//apenas para dar uma linha em branco
		
		double valorMoeda = sc.nextDouble();
		
		Moeda moeda = null;
		
		if(opcaoSelecionada == 1) {
			moeda = new Real(valorMoeda);
		}else if(opcaoSelecionada == 2){
			moeda = new Dolar(valorMoeda);
		}else if(opcaoSelecionada == 3){
			moeda = new Euro(valorMoeda);
		}else {
			System.out.println("Moeda inexistente");
			exibirMenuPrincipal();
		}
		
		boolean removerMoeda = cofrinho.remover(moeda);//adicionado o boolean para poder fazer a comparação e retirado o void do método remover para poder retornar
		
		if(removerMoeda) {
			System.out.println("Moeda removida com sucesso");
		}else {
			System.out.println("A moeda digitada é inexistente");
		}
		
		
		
	}
	
}	
