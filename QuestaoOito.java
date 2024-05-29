public class QuestaoOito {

public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num = ref.nextDouble();
		
		double quad = Math.sqrt(num);
		double cub = Math.cbrt(num);
		
		System.out.println("O valor quadrado é:" + quad + ", e o valor cúbico é:" + cub);
		
	}

}
