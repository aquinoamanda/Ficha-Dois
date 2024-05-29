public class QuestaoCinco {

	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = ref.nextInt();
		
		if ((ano % 4) == 0) {
			System.out.println("Esse ano é bissexto");

		}
			
			else {
				System.out.println("Esse ano não é bissexto");
			}
	}

}
