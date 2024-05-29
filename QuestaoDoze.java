public class QuestaoDoze {

public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		
			System.out.println("Digite um número: ");
			int numUm = ref.nextInt();
			
			System.out.println("Digite um número: ");
			int numDois = ref.nextInt();

			System.out.println("Digite um número: ");
			int numTres = ref.nextInt();
			
			if ((numUm > numDois) && (numDois > numTres)){
				System.out.println("Aordem é: " + numUm + "," + numDois + "," + numTres);
			}
			
			if ((numUm > numTres) && (numTres > numDois)){
				System.out.println("Aordem é: " + numUm + "," + numTres + "," + numDois);
			}
			
			if ((numDois > numUm) && (numUm > numTres)){
				System.out.println("Aordem é: " + numDois + "," + numUm + "," + numTres);
			}
			if ((numDois > numTres) && (numTres > numUm)){
				System.out.println("Aordem é: " + numDois + "," + numTres + "," + numUm);
			}
			
			if ((numTres > numDois) && (numDois > numUm)){
				System.out.println("Aordem é: " + numTres + "," + numDois + "," + numUm);
			}
			
			if ((numTres > numUm) && (numUm > numDois)){
				System.out.println("Aordem é: " + numTres + "," + numUm + "," + numDois);
			}
			
		
}	
}
