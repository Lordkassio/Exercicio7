package ListaDeExerciciosPraPraticar;
import java.util.Scanner;

public class ListaDeExercicio7 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("entre com a medida do lado do quadrado");
		double lado = entrada.nextDouble();
		
		double area = lado * lado;
		double dobroArea = area * 2;
		
		System.out.println("O dobro da área digitada é: " + dobroArea);
		
		entrada.close();
	}

}
