package Atividade04.Adaptor;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String args[]) {
		Interface ferrari = new Ferrari();
		Adapter ferrariAdapter = new AdapterImpl(ferrari);
		System.out.println("Ferrari top speed is " + ferrariAdapter.getSpeed() + " Kmph.");
	}
}