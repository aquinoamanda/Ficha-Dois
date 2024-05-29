public class QuestaoSete {

	public static void main(String[] args) {
	 
	Scanner ref = new Scanner(System.in);
			
	System.out.println("Digite um número");
	int nUm = ref.nextInt();
	
	System.out.println("Digite um outro número");
	int nDois = ref.nextInt();
	
	System.out.println("Digite mais um número");
	int nTres = ref.nextInt();
	
	if ((nUm > nDois) && (nUm > nTres )) {
	System.out.println("O maior número é: " + nUm);
	}
	
	if ((nDois > nUm) && (nDois > nTres)) {
	System.out.println("O maior número é: " + nDois);
	}
	
	if ((nTres > nUm) && (nTres > nDois)) {
	System.out.println("O maior número é: " + nTres);
	}
	
		}
	
}
