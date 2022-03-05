package Atividade03.Singleton;

public class AcessoDBSingleton {
	private boolean conexao;
	private static AcessoDBSingleton uniqueInstance;
	
	private AcessoDBSingleton() {
		conexao = true;
	}
	
	public static AcessoDBSingleton getInstance() {
		if(uniqueInstance == null) {
			System.out.println("Criando uma conex�o com o banco de dados.");
			uniqueInstance = new AcessoDBSingleton();
		}else if (uniqueInstance != null) {
			System.out.println("Conex�o com o banco de dados j� iniciada, imposs�vel criar"
								+" uma conex�o �nica");
		} 
		System.out.println("Retomando uma Inst�ncia de conex�o com o banco de dados.");
		return uniqueInstance;
	}
	
	public void disconnect() {
		if (isConnected()) {
			System.out.println("Fechando  conex�o  com o banco de dados");
			conexao = false;
			uniqueInstance = null;
			//System.out.println("fechando sess�o com o banco de dados")
		}
	}
	
	public boolean isConnected() {
		return conexao;
	}
	

}
