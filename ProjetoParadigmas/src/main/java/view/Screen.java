package view;
import java.util.Scanner;

import db.DB;
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
	}

}
