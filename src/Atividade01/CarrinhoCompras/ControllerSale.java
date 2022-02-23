package Atividade01.CarrinhoCompras;

public class ControllerSale {
	// TODO: Change null to todayDate.
	Sale sale = new Sale(0, null);

	public Sale addItem(ProductSpecification product, int quantity) {

		sale.makeLineItem(product, quantity);

		return sale;

	}

	public Double getSaleTotal() {

		Double total = sale.getSaleTotal();

		return total;
		//
	}

	public Double makePayment(String paymentType, Double paymentValue) {

		Double paymentComputedValue = sale.makePayment(paymentType, paymentValue);
		
		return paymentComputedValue;
		
		
	}
}
