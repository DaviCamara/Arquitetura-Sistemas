package Atividade01.CarrinhoCompras;

import java.util.ArrayList;
import java.util.Iterator;

public class Sale {

	private int time;
	private String date;
	private ArrayList<SaleLineItem> saleItems;
	private Payment payment;

	public Sale(int time, String date) {
		saleItems = new ArrayList<SaleLineItem>();
		this.time = time;
		this.date = date;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double makePayment(String paymentType, Double paymentValue) {
		Payment paymentComputed = new Payment(paymentType, paymentValue);

		Double paymentComputedValue = paymentComputed.getPaymentValue();
		
		return paymentComputedValue;
		//System.out.println("Pagamento Efetuado");

	}

	public void makeLineItem(ProductSpecification product, int quantity) {
		SaleLineItem saleLineItem = new SaleLineItem(product, quantity);
		this.saleItems.add(saleLineItem);
	}

	public double getSaleTotal() {
		double total = 0;
		Iterator<SaleLineItem> iteratorSaleItems = this.saleItems.iterator();

		while (iteratorSaleItems.hasNext()) {
			SaleLineItem saleslineitem = iteratorSaleItems.next();
			total = total + saleslineitem.getSubTotal();

		}

		System.out.println("++++++++++++++++++");
		System.out.println("Total no carrinho de compras: R$" + total);
		System.out.println("++++++++++++++++++");
		return total;
	}

}
