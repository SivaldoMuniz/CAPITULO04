import java.util.Scanner;

	public class EntradaScanner{
		public static void main (String[] args){
			Scanner scan = new Scanner (System.in);

			System.out.print("\nInforme seu nome:\t");
			String nome = scan.nextLine();
			
			System.out.print("Inoforme seu e-mail:\t");
			String email = scan.nextLine();

			System.out.println("\nDados recebidos:");
			System.out.printf("Nome:\t %s \nE-mail :\t %s\n\n", nome, email);
}
}
