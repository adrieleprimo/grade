package application;

import java.util.Scanner;

import entities.notas;

public class alunosResultados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		notas Notas = new notas();
		Notas.Name = sc.nextLine();
		Notas.noteOne = sc.nextDouble();
		Notas.noteTwo = sc.nextDouble();
		Notas.noteThree = sc.nextDouble();
		double failed = Math.abs(Notas.finalGrades()-60);
		if (Notas.finalGrades() >= 60.0) {
			System.out.println(Notas.toString() + "\nPASS");
		}
		else {
			System.out.println(Notas.toString() + "\nFAILED\n" + "MISSING " + failed + " POINTS");
		}
		
		sc.close();

	}

}
