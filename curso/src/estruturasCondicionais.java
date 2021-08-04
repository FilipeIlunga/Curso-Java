import java.util.Scanner;
public class estruturasCondicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if (x > 12) {
			System.out.printf("%d é maior que 12",x);
		}else if(x < 10){
			System.out.printf("%d é menor que 12",x);
		}else {
			System.out.printf("%d é igual a 12",x);
		}

	}

}
