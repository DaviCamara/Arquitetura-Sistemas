package Atividade01;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sale {

	private int time;
	private String date;
	private int quantity;
	
	public Sale(int time, String date) {
		super();
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

	 public  SaleLineItem makeLineItem(ProductSpecification produto, int quantity) {
		SaleLineItem saleLineItem = new SaleLineItem(produto, quantity);
		
		return saleLineItem;
	}
	
	public int getTotal(ArrayList array) {
		int total = 0;
		SaleLineItem subtotal;
		for (int i = 0; i < 5; i++) {
			subtotal = (SaleLineItem) array.get(i);
			total += subtotal.getSubTotal();
		}
		
		System.out.println("++++++++++++++++++");
		System.out.println("Total no carrinho de compras: " + total);
		System.out.println("++++++++++++++++++");
		return total;
	}
	
	

}
