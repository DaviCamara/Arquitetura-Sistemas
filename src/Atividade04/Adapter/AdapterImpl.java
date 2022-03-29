package Atividade04.Adapter;


//Implementação do Adapter
public class AdapterImpl implements Adapter {
	
	//Interface genêrica
	private Interface luxuryCars;
	
	
	//Implementação do adapter, utilizando a interface gênerica
	public AdapterImpl(Interface luxuryCars) {
		this.luxuryCars = luxuryCars;
	}

	
	//@Override do método de retorno de velocidade.
	//Alteração do método de calculo de velocidade de Mph para Kmh
	@Override
	public double getSpeed() {
		double mph = luxuryCars.getSpeed();
		return convertMPHtoKMPH(mph);
	}

	//Cálcuo da conversão de MPH para MMHs
	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}
}
