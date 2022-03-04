package Atividade03.Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcessoDBSingleton.getInstance();
		System.out.println("------------------------------------------------------------");
		AcessoDBSingleton.getInstance().disconnect();
		System.out.println("------------------------------------------------------------");
		AcessoDBSingleton.getInstance();
	}

}
