package emailapp;

public class EmailApp {
	public static void main (String[] args) {
		Email em1 = new Email("Nicolas","sarkozi");
		
		//em1.setAlternatEmail("founder@showpourelle.com");
		System.out.println(em1.showAllInfo());
	}
}
