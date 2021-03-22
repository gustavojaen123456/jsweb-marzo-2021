package ar.com.educacionit.clase1;

import java.util.Random;
import java.util.Scanner;

public class LaboratorioCiclos {

	public static void main(String[] args) {
 /*** Adivinar un numero entre el 1 y el 10
		int numeroAleatorio = (int) (Math.random()*10+1);
		int numeroUsuario = 0;
		System.out.println(numeroAleatorio);
		while (numeroAleatorio != numeroUsuario) {
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingrese Un Numero del 1 al 10");
			numeroUsuario = teclado.nextInt();
			if(numeroUsuario > numeroAleatorio) {
				System.out.println("Es mas bajo");
			}else if (numeroUsuario < numeroAleatorio) {
				System.out.println("Es mas alto");
			}else {
				System.out.println("Es Correcto!!");
			}
		}
		
******/
		
/**** Log in con 3 intentos y bloqueao
		String usuario = "Pepe";
		int password = 1234;
		int intentos = 0;
		int ingreso = 0;
			
		while (intentos < 3 && ingreso != 1) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingrese el nombre del usuario");
			String usuarioIngresado = teclado.next();
			if(usuario.equals(usuarioIngresado)) {
				Scanner teclado2 = new Scanner(System.in);
				System.out.println("Ingrese el password");
				int passIngresado = teclado2.nextInt();
				
				if(passIngresado == password) {
					System.out.println("Bienvenido");
					ingreso = 1;
				}else {
					System.out.println("Password Incorrecto");
					intentos++;
					System.out.println("Le quedan "+ (3 - intentos)+" intentos");
				}
				
			}else {
				System.out.println("Usuario Incorrecto");
				intentos++;
				System.out.println("Le quedan "+ (3 - intentos)+" intentos");
			}
			
			
		}
		
		if(intentos >= 3 && ingreso != 1) {
			System.out.println("Ususario Bloqueado");
		}
		
******/	
		
	}



}
