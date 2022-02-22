package CarrinhoCompras;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

class GUI_Venda {

	public void createGUI() {
		Scanner scan = new Scanner(System.in);
		ControladorRealizarVenda controller = new ControladorRealizarVenda();
		Catalog catalog = new Catalog();

		System.out.println("Digite qual produto vocÊ quer comprar");
		System.out.println("01 --- Notebook Dell");
		System.out.println("02 --- MacBookPro ");
		System.out.println("03 --- Notebook Avell");
		System.out.println("04 --- IPhone 10");
		System.out.println("05 --- Redmi 9");
		System.out.println();

		int input = scan.nextInt();

		System.out.println("Digite quantas unidades do produto você deseja comprar");
		System.out.println();
		
		int unidades = scan.nextInt();

		if (input == 01) {

			controller.adicionartItem(catalog.product01, unidades);

		}
		if (input == 02) {

			controller.adicionartItem(catalog.product02, unidades);

		}

		if (input == 03) {

			controller.adicionartItem(catalog.product03, unidades);

		}

		if (input == 04) {

			controller.adicionartItem(catalog.product04, unidades);

		}

		if (input == 05) {

			controller.adicionartItem(catalog.product05, unidades);

		}

		controller.totalizarVenda();
	
		
		System.out.println("Por favor selecioner o tipo de pagamento");
		System.out.println("01 --- PIX");
		System.out.println("02 ---- Cartão");
		
		String tipoPagamento = scan.next();
		
		System.out.println("Por favor digite o valro a ser pago");
		
		Double pagamento = scan.nextDouble();
		
		
		
		controller.efetuarPagamento(tipoPagamento, pagamento);
		

	}

}