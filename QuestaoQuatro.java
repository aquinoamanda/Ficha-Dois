public class QuestaoQuatro {

	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		
			System.out.println("Digite um número: ");
			double nUm = ref.nextDouble();
			
			System.out.println("Digite um número: ");
			double nDois = ref.nextDouble();
			
			System.out.println("Digite um número: ");
			double nTres = ref.nextDouble();
			
			System.out.println("Digite um número: ");
			double nQuatro = ref.nextDouble();
			
			System.out.println("Digite um número: ");
			double nCinco = ref.nextDouble();
			
			System.out.println("Digite um número: ");
			double nSeis = ref.nextDouble();
			
			double media = (nUm + nDois + nTres + nQuatro + nCinco + nSeis)/6;
			
			System.out.println("A média do número é: " + media);
		}
}
