import java.util.Scanner;

public class entrada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		System.out.printf("Voce digitou a String: %s%n",x);
		
		int y;
		y = sc.nextInt();
		System.out.printf("Voce digitou o inteiro: %d%n",y);
		
		double d;
		d = sc.nextDouble();
		System.out.printf("O seu double e: %f",d);
		
		char ch;
		ch = sc.next().charAt(0);
		System.out.printf("O seu char é: %s",ch);
		
		sc.close();
	}

}
