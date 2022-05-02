package pousada;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Cliente quartos[] = new Cliente[10];
		
		System.out.print("Informe o nome : ");
		String nome = teclado.nextLine();
		System.out.print("Informe o e-mail: ");
		String email = teclado.next();

		boolean resposta = false;
		while(resposta == false) {
		System.out.println("Qual  o quarto ? Reservas de 0 a 9.");
		int num = teclado.nextInt();
		
			if(num > 0 && num <= 9) {
				if(quartos[num] == null) {
					quartos[num] = new Cliente(nome, email);
					System.out.println("A reserva do quarto " + num + " esta confirmada.");
					resposta = true;
				} else {
					System.out.println("Este quarto esta indisponível.");
				}
			} else {
				System.out.println("Resposta inválida, tente outra.");
			}
			
		}	
		System.out.println("Reserva:");
		for(int i = 0; i < 10; i++) {
		if(quartos[i] != null) {
		System.out.println("Quarto " + i + ": " + quartos[i].toString());
			}	
		}
		System.out.print("Informe o quarto : ");
		int resposta2 = teclado.nextInt();
		if(resposta2 > 0 && resposta2 <= 9) {
		if(quartos[resposta2] == null) {
		System.out.println("Quarto não reservado");
		} else {
			System.out.println("Quarto reservado para " + quartos[resposta2].getNome());
			}
		} else {
		while(resposta2 < 0 || resposta2 > 9) {
		System.out.println("Reposta inválida, informe valores de 0 a 9.");
		resposta2 = teclado.nextInt();
			}
		}
		
		teclado.close();
	}

}