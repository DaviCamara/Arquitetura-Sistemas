package Atividade04.Adapter;




//Classe que irá sofrer adaptação
public class Ferrari implements Interface {
	 
	
	//Override do método de velocidade da interface, retornando a velocidade de 268 mp/h
    @Override
    public double getSpeed() {
		return 268;
    }
}
