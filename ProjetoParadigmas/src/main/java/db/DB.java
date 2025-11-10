package db;

import models.User;

public class DB {
	
	
	public static User[] userArray() {
		User a = new User("Roberto", "roberto@gmail.com", "robertopass", "123.456.789-10");
		User b = new User("Clara", "clara@gmail.com", "clarapass", "109.876.543-21");
		User c = new User("Davi", "davi@gmail.com", "davipass", "357.135.798-00");
		User d = new User("Rogerio", "roger@gmail.com", "rogerpass", "123.444.222-11");
		User e = new User("Roberta", "roberta@gmail.com", "robertapass", "999.222.111-22");
		
		User[] users = {a, b, c, d, e};
		
		return users;
		
	}
	
	public static boolean checkUser(User j) {
		User[] db = DB.userArray();
		
		for(User u : db) {
			if(j.getEmail().equals(u.getEmail()) && u.getSenha().equals(j.getSenha())) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	

}
