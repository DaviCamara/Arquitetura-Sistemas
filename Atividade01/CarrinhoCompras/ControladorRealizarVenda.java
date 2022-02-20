package CarrinhoCompras;

public class ControladorRealizarVenda {
	//TODO: Change null to todayDate.
	Sale sale = new Sale(0, null);	
	
	
	public Sale adicionartItem(ProductSpecification product, int quantity) {
			
		sale.makeLineItem(product, quantity);
		
		return sale;
		
	}
	
	public Double totalizarVenda() {
		
		Double total = sale.getTotal();
		
		return total;
	}
	
	public void adicionarPagamento() {
		
		//TODO:auto-generated STUB
	}
}
