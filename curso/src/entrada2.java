import java.util.Scanner;
public class entrada2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1,s2,s3;
		// Entrada de dados até a quebra de linhas 
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println(s1 + "%n%n");
		System.out.println(s2 + "%n%n");
		System.out.println(s3 + "%n%n");
		
		
		//NEXTLINE PENDENTE
		
		int x;
		String x1,x2,x3;
		x = sc.nextInt();
		sc.nextLine(); // Este nextLine irá capturar a quebra de linha do código anterior
		x1 = sc.nextLine();
		x2 = sc.nextLine();
		x3 = sc.nextLine();
		
	}

}
