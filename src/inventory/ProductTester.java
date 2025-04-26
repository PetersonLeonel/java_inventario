package inventory;
import java.util.Scanner;

public class ProductTester {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tempNumber;
		String tempName;
		int tempQtd;
		double tempPrice;
		int maxSize = -1;
				
		// Avisar o usuário até que ele insira um número >= 0
		do {
			try {
				// Mostrar para o usuário
				System.out.println("Insira o número de produtos que deseja adicionar");
				System.out.println("Insira 0 (zero) se não quiser adicionar produtos");
				maxSize = in.nextInt();
				if(maxSize < 0) {
					System.out.println("Valor inserido está incorreto");
				}
			}catch(Exception e ) {
				System.out.println(e);
				in.nextLine();
			}
		} while(maxSize<0);
		
		if(maxSize == 0) {
			System.out.println("Nenhum produto requerido para ser registrado!");
		} else {
			// Armazenar produtos
			Product[] products = new Product[maxSize];
			for(int i = 0; i < maxSize; i++) {
				in.nextLine();
				System.out.println("\n");
				System.out.println("Digite o nome do produto: ");
				tempName = in.nextLine();
				System.out.println("Digite a quantidade do estoque: ");
				tempQtd = in.nextInt();
				System.out.println("Digite o preço: ");
				tempPrice = in.nextDouble();
				System.out.println("Digite o identificador único: ");
				tempNumber = in.nextInt();
				// criar um objeto produto e armazenar suas propriedades
				products[i] = new Product(tempNumber, tempName, tempQtd, tempPrice);
			}
			
			// Exibe os produtos armazenados
			for(Product product: products) {
				System.out.println(product);
			}
		}
		
		
		
		
		in.close();
	}

}
