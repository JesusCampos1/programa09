package programa09;

import java.util.Scanner;

public class programa09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int op;
		double pul, pie, con;
		System.out.print("Menu");
		System.out.print(" 1.- Pulgadas a centimetros ");
		System.out.print(" 2.- Pies a centimetros ");
		System.out.print(" 3.- Pies a pulgadas ");
		System.out.print("Elige una opcion ");
		op = leer.nextInt();
		switch (op) {
		case 1:
			System.out.println("Ingresa las pulgadas");
			pul = leer.nextDouble();
			con=pul*2.54;
			System.out.println("Pulgadas: " +pul + "igual a "+ con +"centimetros");
			break;
		case 2:
			System.out.println("Ingresa los pies");
			pie = leer.nextDouble();
			con=pie*30.48;
			System.out.println("Pies: " +pie + "igual a "+ con +"en centimetros");
			break;
		case 3:
			System.out.println("Ingresa los pies");
			pie = leer.nextDouble();
			con=pie*12;
			System.out.println("Pies: " +pie + "igual a "+ con +"en pulgadas");
			break;
			default:
				System.out.println("No ingreso ningun numero del 1 al 3");
				break;
		}

	}

}
