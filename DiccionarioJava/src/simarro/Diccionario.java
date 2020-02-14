package simarro;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Diccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = leerFrase();
		ArrayList<String> a = new ArrayList<String>();
		
		ArrayList<String> b = new ArrayList<String>();
		ArrayList<Integer> r = new ArrayList<Integer>();

		
		ArrayList<String> c = new ArrayList<String>();

		rellenarArray(a, s);
		
	
		
	}
	public static  void numeroRepeticiones(ArrayList<String> a,ArrayList<String> b,ArrayList<Integer> r) {
		
		if(b.isEmpty()&& r.isEmpty()) {
			for(String palabra : a) {
				if(b.contains(palabra)) {
					int i = b.indexOf(palabra);
					r.set(i, r.get(i+1));
				}
				else {
					b.add(palabra);
					r.add(1);
				}
			}
		}
		for (int i = 0; i < b.size(); i++) {
			System.out.println(r.get(i)+ " " + b.get(i));
		}
	}
	public static void ordenarArray(ArrayList<String> a) {
		Collections.sort(a);
		System.out.println(a);
	}
	public static String leerFrase() {
		String frase;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una frase:");
		frase = teclado.nextLine();
		return frase;
		
	}
	public static void rellenarArray(ArrayList<String> a, String s) {
		String palabra;
		while(!s.isEmpty()) {
			if(s.contains(" ")) {
				palabra = s.substring(0, s.indexOf(" "));
				s = s.substring(s.indexOf(" ")+1);
			}
			else {
				palabra = s.substring(0);
				s = "";
			}
			a.add(palabra);
		}
	
	}
	

}



