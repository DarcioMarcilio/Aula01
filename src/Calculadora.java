import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		double valor1;
		double valor2;
		double soma;
		System.out.println("Favor digite um valor:");
		valor1 = leitor.nextDouble();
		System.out.println("Digite mais um valor:");
		valor2 = leitor.nextDouble();
		
		soma = valor1 + valor2;
		
		System.out.println("A soma dos dois valores informados �" + soma);
		
		leitor.close();
	}

}
