import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String username, pass;	
		
		
		System.out.println("Nombre de usuario");
		username = scan.nextLine();
		System.out.println("Contraseña");
		pass = scan.nextLine();
		
		if (username.equals("Axel") && pass.equals("123")) 
		{

	        System.out.println("Logueaste :) ");}
	        
	   
	     else 
	        System.out.println("Nombre o contraseña inválidos");
	    
	     }
}
	
	
	    
	 