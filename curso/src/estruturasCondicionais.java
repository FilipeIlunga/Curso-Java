import java.util.Scanner;
public class estruturasCondicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if (x > 12) {
			System.out.printf("%d � maior que 12",x);
		}else if(x < 10){
			System.out.printf("%d � menor que 12",x);
		}else {
			System.out.printf("%d � igual a 12",x);
		}

	}

}
