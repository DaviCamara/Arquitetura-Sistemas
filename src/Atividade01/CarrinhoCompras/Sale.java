package Atividade01.CarrinhoCompras;

import java.util.ArrayList;
import java.util.Iterator;

public class Sale {

	private int time;
	private String date;
	private ArrayList itemsVenda;
	private Pagamento pagamento;

	public Sale(int time, String date) {
		itemsVenda = new ArrayList<SaleLineItem>();
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

	public void efetuarPagamento(String tipoPagamento, Double pagamento) {
		Pagamento pagamentoEfetuado = new Pagamento(tipoPagamento, pagamento);

		System.out.println("Pagamento Efetuado");

	}

	/*
	 * public String getProductName() {
	 * 
	 * String ProductName = this.itemsVenda return ProductName; }
	 */

	public void makeLineItem(ProductSpecification produto, int quantity) {
		SaleLineItem saleLineItem = new SaleLineItem(produto, quantity);
		this.itemsVenda.add(saleLineItem);
	}

	public double getTotal() {
		double total = 0;
		Iterator<SaleLineItem> iteratorItemsVenda = this.itemsVenda.iterator();

		while (iteratorItemsVenda.hasNext()) {
			SaleLineItem saleslineitem = iteratorItemsVenda.next();
			total = total + saleslineitem.getSubTotal();

		}

		System.out.println("++++++++++++++++++");
		System.out.println("Total no carrinho de compras: R$" + total);
		System.out.println("++++++++++++++++++");
		return total;
	}

}
