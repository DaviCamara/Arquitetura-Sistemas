/*Esse cenário foi escolhido como exemplo pois com o advento de surgimento de concerssionarias
 * de carros esportivos em Fortaleza, foi teorizado a necessidade de um sistema que
 * realizasse a conversão de velocidade aparesentada de um padrão estrangeiro, para um 
 * padrão nacional. Portanto a criação de um Adapter de conversão de MPh para Kmh.
 */
/*
 * As vantagens dessa implementação são vistas a medida que é possível a criação de uma
 * interface única para o sistema de carros, sendo necessário a criação apenas de classes
 * especificas para cada modelo, contendo informações pertinentes ao modelo do carro, nesse
 * caso a simulação da sua velocidade corrente. Caso seja necessário a inclusão de outros
 * padrões externos no futuro, a interface, permite a adição de novos métodos de conversão
 * sem alterar o código já implementado, tornando assim a interface escalavel. Pois os
 * métodos de conversão estão sobre responsabilidade da Adapter e são implementados através
 * da suas respectivas classes de implementação.Portanto com a adição de novos modelos, é
 * é possível apenas criar novas classes para tais e  repassar para o método de conversão no
 * Adapter a medida do necessário
 */




package Atividade04.Adapter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

//Main de execução
public class Main {

	public static void main(String args[]) {
		//Instanciação do carro Ferrari que terá velocidade convertida de Mph para Kmh
		Interface ferrari = new Ferrari();
		
		//Intanciação do Adapter, passando a a instancção da implementação do adapter
		//tendo como parametro o modelo de carro desejado
		Adapter ferrariAdapter = new AdapterImpl(ferrari);
		
		//Prova de conceito da conversão de velocidade.
		System.out.println("Ferrari top speed is " + ferrariAdapter.getSpeed() + " Kmph.");
	}
}