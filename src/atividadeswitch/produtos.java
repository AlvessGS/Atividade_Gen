package atividadeswitch;
import java.util.Scanner;

public class produtos {
	
	
	    public static void main(String[] args) {

	        Scanner ler = new Scanner(System.in);
	        int codigo, quanti, opcao;

	        System.out.println("Digite o código do produto: ");
	        codigo = ler.nextInt();

	        System.out.println("Digite a quantidade que deseja: ");
	        quanti = ler.nextInt();

	        switch (codigo) {
	            case 1:
	                System.out.println("Produto: Cachorro Quente | Valor: R$"+quanti*10+",00");
	                break;

	            case 2:
	                System.out.println("Produto: X-Salada | Valor: R$"+quanti*15+",00");
	                break;

	            case 3:
	                System.out.println("Produto: X-Bacon| Valor: R$"+quanti*18+",00");
	                break;

	            case 4:
	                System.out.println("Produto: Bauru | Valor: R$"+quanti*12+",00");
	                break;

	            case 5:
	                System.out.println("Produto: Refrigerante | Valor: R$"+quanti*8+",00");
	                break;

	            case 6:
	                System.out.println("Produto: Suco de laranja | Valor: R$"+quanti*13+",00");
	                break;
	                default:
	        }
	    }
	}