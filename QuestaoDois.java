public class QuestaoDois {
	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite um número");
		   int par = ref.nextInt();
		   
		if (par % 2 == 0)
			System.out.println("O número é par!");
			
		else
			System.out.println("O número é impar!");
			
	}

}
