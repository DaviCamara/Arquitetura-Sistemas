package Atividade01.CarrinhoCompras;

public class Payment {

	private String paymentType;
	private Double paymentValue;

	public Payment(String paymentType, Double paymentValue) {
		this.paymentType = paymentType;
		this.paymentValue = paymentValue;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Double getPaymentValue() {
		return paymentValue;
	}

	public void setPaymentValue(Double paymentValue) {
		this.paymentValue = paymentValue;
	}
	
	
	
	
}
