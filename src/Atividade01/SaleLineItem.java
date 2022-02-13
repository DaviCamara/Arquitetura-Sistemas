package Atividade01;

public class SaleLineItem {
	
	private int quantity;
	ProductSpecification product;
	
	public SaleLineItem(ProductSpecification product, int quantity) {
		this.quantity = quantity;
		this.product = product;
	}
	
	public int getSubTotal() {
		int subtotal = quantity * product.getPrice();
		
		return subtotal;
	}
	
		
}
