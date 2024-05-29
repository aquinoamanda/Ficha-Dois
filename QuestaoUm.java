import java.util.Scanner;

public class QuestaoUm {

	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
			int numUm = ref.nextInt();
		
		System.out.println("Insira outro número: ");
			int numDois = ref.nextInt();
			
		int soma = numUm + numDois;
		
		System.out.println("Asoma dos dois números é: " + soma);
		}
		
	}
