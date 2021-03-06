package app;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Digiti o nome do Aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Digiti as tr?s notas do aluno:");
		System.out.print("Nota 1: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Nota Final: %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltam %.2f pontos para atingir a m?dia %n", aluno.pontosEmFalta());
		} else {
			System.out.println("Aprovado");
		}
		
		sc.close();

	}

}
