package teste;
import java.util.Scanner;

public class Exercicio_1
{
	public static void main (String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int numero1;
		int numero2;
		int resultado;
		
		System.out.println("Digite o primeiro numero");
		numero1 = teclado.nextInt();
		
		System.out.println("Digite o segundo numero");
		numero2 = teclado.nextInt();
		
		resultado = numero1 + numero2;
		
		System.out.println("Resultado = " +resultado);
		
		teclado.close();
	}
	
}