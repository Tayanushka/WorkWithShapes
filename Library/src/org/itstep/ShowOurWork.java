package org.itstep;

public class ShowOurWork {

	public static void main(String[] args) {
		Books books = new Books();
		Users users = new Users();
		
		books.setBookTitle("");
		books.setAuthor("");
		
		users.setLogin("");
		
		System.out.println(users.getLogin() + "любит читать" + books.getAuthor() + books.getAuthor());
		
		

	}

}
