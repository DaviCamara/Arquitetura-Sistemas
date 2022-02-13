package Atividade01;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		Sale sale = new Sale(0, "Data");
		
		ProductSpecification aaa = new ProductSpecification("aaa", 1, "111");
		ProductSpecification bbb = new ProductSpecification("bbb", 2, "222");
		ProductSpecification ccc = new ProductSpecification("ccc", 3, "333");
		ProductSpecification ddd = new ProductSpecification("ddd", 4, "444");
		ProductSpecification eee = new ProductSpecification("eee", 5, "555");
		
		
		ArrayList<SaleLineItem> carrinho = new ArrayList<SaleLineItem>();
				
		sale.makeLineItem(aaa, 1);
		sale.makeLineItem(bbb, 2);
		sale.makeLineItem(ccc, 3);
		sale.makeLineItem(ddd, 4);
		sale.makeLineItem(eee, 5);
		
		
		sale.getTotal();
		
		
		
		
		
		

	}

}
