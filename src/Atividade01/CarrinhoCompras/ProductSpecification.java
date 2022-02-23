package Atividade01.CarrinhoCompras;

public class ProductSpecification {

	private String description;
	private double price;
	private String itemID;

	public ProductSpecification(String description, double price, String itemID) {
		this.description = description;
		this.price = price;
		this.itemID = itemID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

}
