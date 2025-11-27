package view;
import java.util.Scanner;

import db.DB;
import models.Historico;
import models.User;

public class Screen {
	
	public static void Login() {
		Scanner s = new Scanner(System.in);
		boolean validation = false;
		
		while(!validation) {
			String email;
			String senha;
			
			User u;
			
			System.out.println("Por favor digite seu email: ");
			email = s.nextLine();
			
			System.out.println("Por favor digite sua senha: ");
			senha = s.nextLine();
			
			u = new User(email, senha);
			
			validation = DB.checkUser(u);
			
		}
		
		System.out.println("Bem vindo!");
		
		Grades();
	}
	
	public static void Grades() {
		Scanner s = new Scanner(System.in);
		boolean validation = false;
		double a1;
		double a2;
		double a3;
		Historico h;
		
		System.out.println("Digite a sua A1");
		a1 = s.nextDouble();
		
		System.out.println("Digite a sua A2");
		a2 = s.nextDouble();
		
		h = new Historico(a1, a2);
		
		if(h.isA3Necessary()) {
			
			System.out.println("Digite a sua A3");
			a3 = s.nextDouble();
			h.setA3(a3);
			if(h.isApproved()) {
				System.out.println("Passou!");
			} else {
				System.out.println("Reprovado :(");
			}
			
		} else {
			if(h.isApproved()) {
				System.out.println("Passou!");
			} else {
				System.out.println("Reprovado :(");
			}
		}
		
	}

}
