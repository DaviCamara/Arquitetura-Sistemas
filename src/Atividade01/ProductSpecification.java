package Atividade01;

public class ProductSpecification {

	private String description;
	private int price;
	private String itemID;

	public ProductSpecification(String description, int price, String itemID) {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

}
