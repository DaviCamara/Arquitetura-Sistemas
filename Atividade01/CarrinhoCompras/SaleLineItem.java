package CarrinhoCompras;

public class SaleLineItem {

	private int quantity;
	ProductSpecification product;

	public SaleLineItem(ProductSpecification product, int quantity) {
		this.quantity = quantity;
		this.product = product;
	}

	public double getSubTotal() {
		double subtotal = quantity * product.getPrice();

		return subtotal;
	}
	
	public String getProductName() {
		
		String productName = product.getDescription();
		
		return productName;
	}

}
