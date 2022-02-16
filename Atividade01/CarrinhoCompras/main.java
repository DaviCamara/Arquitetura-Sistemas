package CarrinhoCompras;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		Sale sale = new Sale(0, "Data");

		ProductSpecification product01 = new ProductSpecification("Notebook Dell", 1000, "1");
		ProductSpecification product02 = new ProductSpecification("MacBookPro", 2000, "2");
		ProductSpecification product03 = new ProductSpecification("Notebook Avell", 3000, "3");
		ProductSpecification product04 = new ProductSpecification("IPhone 10", 4000, "4");
		ProductSpecification product05 = new ProductSpecification("Redmi 9S", 5000, "5");

		sale.makeLineItem(product01, 1);
		sale.makeLineItem(product02, 2);
		sale.makeLineItem(product03, 3);
		sale.makeLineItem(product04, 4);
		sale.makeLineItem(product05, 5);

		sale.getTotal();

	}

}
