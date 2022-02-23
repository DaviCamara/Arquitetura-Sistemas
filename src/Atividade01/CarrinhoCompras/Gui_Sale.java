package Atividade01.CarrinhoCompras;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

class Gui_Sale {

	public void createGUI() {
		Scanner scan = new Scanner(System.in);
		ControllerSale controller = new ControllerSale();
		Catalog catalog = new Catalog();

		System.out.println("Digite qual produto você quer comprar.");
		System.out.println("01 --- Notebook 	Dell");
		System.out.println("02 --- MacBookPro 		");
		System.out.println("03 --- Notebook 	Avell");
		System.out.println("04 --- IPhone 		10");
		System.out.println("05 --- Redmi 		9");
		System.out.println();

		int input = scan.nextInt();

		System.out.println("Digite quantas unidades do produto você deseja comprar.");
		System.out.println();

		int quantity = scan.nextInt();

		if (input == 01) {

			controller.addItem(catalog.product01, quantity);

		}
		if (input == 02) {

			controller.addItem(catalog.product02, quantity);

		}

		if (input == 03) {

			controller.addItem(catalog.product03, quantity);

		}

		if (input == 04) {

			controller.addItem(catalog.product04, quantity);

		}

		if (input == 05) {

			controller.addItem(catalog.product05, quantity);

		}

		controller.getSaleTotal();

		System.out.println("Por favor selecionar o tipo de pagamento.");
		System.out.println();
		System.out.println("01 ---- 	PIX.");
		System.out.println("02 ---- 	Cartão.");
		System.out.println();

		String paymentType = scan.next();

		System.out.println("Por favor digite o valor a ser pago.");
		System.out.println();

		Double payment = scan.nextDouble();

		Double paymentComputedValue = controller.makePayment(paymentType, payment);
		System.out.println("---Pagamento Efetuado---");
		System.out.println("Valor do pagamento efetuado: R$ " + paymentComputedValue);

	}

}