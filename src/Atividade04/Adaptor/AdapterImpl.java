package Atividade04.Adaptor;

public class AdapterImpl implements Adapter {
	private Interface luxuryCars;

	public AdapterImpl(Interface luxuryCars) {
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {
		double mph = luxuryCars.getSpeed();
		return convertMPHtoKMPH(mph);
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}
}
