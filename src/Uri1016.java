import java.util.Scanner;

public class Uri1016 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int distanciaEmQuilometros = sc.nextInt();
		
		int tempoEmMinutos = distanciaEmQuilometros * 2;
		
		System.out.println(tempoEmMinutos + " minutos");
		
		sc.close();
	}

}
