package project6;

import java.util.Scanner;

public class ta06_3 {
	public static void main(String args[]){
		
		int nombre;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nombre: ");
		nombre = sc.nextInt();				
		
		if (esPrim(nombre) == false) {
			System.out.println(esPrim(nombre));
			System.out.println("El nombre "+nombre+" no és prim");
		}else {
			System.out.println(esPrim(nombre));
			System.out.println("El nombre "+nombre+" és prim");
		}
		
		sc.close();
		
	}
	
	public static boolean esPrim(int no) {
		
		boolean prim = true;
		
		if (no<=1) {
			prim = true;
		}
		
		for (int n=2;n<=no - 1;n++) {
			int r = no % n;
			if (r == 0) {
				prim = false;
			}
			
		}
		
		return prim;
	}

}
