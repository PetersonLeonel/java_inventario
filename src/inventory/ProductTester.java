package inventory;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tempNumber;
		String tempName;
		int tempQtd;
		double tempPrice;
		
		System.out.println("\n\n Digite o nome do produto: ");
		tempName = in.nextLine();
		System.out.println("Digite a quantidade do estoque: ");
		tempQtd = in.nextInt();
		System.out.println("Digite o preço: ");
		tempPrice = in.nextDouble();
		System.out.println("Digite o identificador único: ");
		tempNumber = in.nextInt();
		
		
		in.close();
		Product p = new Product(tempNumber, tempName, tempQtd, tempPrice);
		p.setActive(false);
		System.out.println(p);
		
	}

}
