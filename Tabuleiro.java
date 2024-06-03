package pcttabuleiro;
import java.util.Scanner;
import java.util.Random;
public class Tabuleiro {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner (System.in);
		int posicao1 = 0;
		int posicao2 = 0;
		boolean finalizar= false;
		
			do {
				int dado = random.nextInt(6)+1;
				int dado2 = random.nextInt(6)+1;
				System.out.println("\n<<<Jogador 1, deseja jogar o dado? s-Sim; n-Não>>>");
				char opcao = scanner.next().charAt(0);
				if(opcao == 's'){
					System.out.println("O valor do dado que saiu é: "+dado);}
				
					
				posicao1 += dado;
				System.out.println();
				switch (posicao1) {
				case 1:
					System.out.println("Casa sem especial!"+"\n");
					break;
				case 2:
					posicao1 +=2;
					System.out.println("Avance 2 casas! Sua atual posição será:"+posicao1+"\n");
					break;
				case 3:
					posicao1-=2;
					System.out.println("Ah! você terá que retornar 2 casas! Sua atual posição será: " +posicao1+"\n");
					break;
				case 4:
					System.out.println("Casa sem especial!"+"\n");
					break;
				case 5:
					posicao1 +=2;
					System.out.println("Avance 2 casas! Sua atual posição será: " + posicao1+"\n");
					break;
				case 6:
					posicao1-=2;
					System.out.println("Ah! você terá que retornar 2 casas! Sua atuça posição será: " +posicao1+"\n");
					break;
				case 7:
					System.out.println("Casa sem especial!"+"\n");
					break;
				case 8:
					posicao1 +=5;
					System.out.println("Avance 5 casas! Sual atual posição será: "+posicao1+"\n");
					break;
				case 9:  System.out.println("Casa sem especial!"+"\n");
					break;
				case 10: 
					posicao1 +=3;
					System.out.println("Avance 3 casas! Sua atual posição será: "+posicao1+"\n");
					break;
				case 11: 
					posicao1 +=2;
					System.out.println("Avance 2 casas! Sua atual posição será: "+posicao1+"\n");
					break;
				case 12: 
					posicao1-=3;
					System.out.println("Ah! você terá que retornar 3 casas! Sua atual posição será: "+posicao1+"\n");
					break;
				case 13: System.out.println("Casa sem especial!"+"\n");
					break;
				case 14: 
					posicao1 +=3;
					System.out.println("Avance 3 casas! Sua atual posição será:"+posicao1+"\n");
					break;
				case 15: 
					posicao1-=2;
					System.out.println("Ah! você terá que retornar 2 casas! Sua atual posição será: "+posicao1+"\n");
					break;
				case 16:
					posicao1-=3;
					System.out.println("Ah! você terá que retornar 3 casas! Sua atual posição será: "+posicao1+"\n");
					break;
				case 17: System.out.println("Casa sem especial! "+"\n");
					break;
				case 18: 
					posicao1 +=3;
					System.out.println("Avance 3 casas! Sua atual posição será:"+posicao1+"\n");
					break;
				case 19: 
					posicao1 +=2;
					System.out.println("Avance 2 casas! Sua atual posição será: "+posicao1+"\n");
					break;
				case 20: 
					posicao1-=3;
					System.out.println("Ah! você terá que retornar 3 casas! Sua atual posição será: "+posicao1+"\n");
					break;
				case 21: System.out.println("Casa sem especial! "+"\n");
					break;
				case 22: 
					posicao1 +=2;
					System.out.println("Avance 2 casas! Sua atual posição será: "+posicao1+"\n");
					break;
				case 23: 
					posicao1-=4;
					System.out.println("Ah! você terá que retornar 4 casas! Sua atual posição será: "+posicao1+"\n");
					break;
				case 24: System.out.println("Casa sem especial! "+"\n");
					break;
				case 25: 
					posicao1-=3;
					System.out.println("Ah! você terá que retornar 3 casas! Sua atual posição será: "+posicao1+"\n");
					break;
				case 26: 
					posicao1 +=1;
					System.out.println("Avance 1 casas! Sua atual posição será: "+posicao1+"\n");
					break;
				case 27: System.out.println("Casa sem especial! "+"\n");
					break;
				case 28: 
					posicao1 -=1;
					System.out.println("Ah! você terá que retornar 1 casas! Sua atual posição será: "+posicao1+"\n");
					break;
				case 29: 
					posicao1 +=2;
					System.out.println("Avance 2 casas! Sua atual posição será: "+posicao1+"\n");
					break;
				case 30: System.out.println("Casa sem especial! "+"\n");
				break;
				}
		
		System.out.println("\n<<<Jogador 2, deseja jogar o dado? s-Sim; n-Não>>>");
		opcao = scanner.next().charAt(0);
		if(opcao == 's'){
			System.out.println("O valor do dado que saiu é: "+dado2);}
			for(int i = 0; i<1; i++) {	
			posicao2+=dado2;}
			System.out.println();
			switch (posicao2) {
			case 1:
				System.out.println("Casa sem especial!"+"\n");
				break;
			case 2:
				posicao2 +=2;
				System.out.println("Avance 2 casas! Sua atual posição será:"+posicao2+"\n");
				break;
			case 3:
				posicao2-=2;
				System.out.println("Ah! você terá que retornar 2 casas! Sua atual posição será: " +posicao2+"\n");
				break;
			case 4:
				System.out.println("Casa sem especial!"+"\n");
				break;
			case 5:
				posicao2 +=2;
				System.out.println("Avance 2 casas! Sua atual posição será: " + posicao2+"\n");
				break;
			case 6:
				posicao2-=2;
				System.out.println("Ah! você terá que retornar 2 casas! Sua atual posição será: " +posicao2+"\n");
				break;
			case 7:
				System.out.println("Casa sem especial!"+"\n");
				break;
			case 8:
				posicao2 +=5;
				System.out.println("Avance 5 casas! Sual atual posição será: "+posicao2+"\n");
				break;
			case 9:  System.out.println("Casa sem especial!"+"\n");
				break;
			case 10: 
				posicao2 +=3;
				System.out.println("Avance 3 casas! Sua atual posição será: "+posicao2+"\n");
				break;
			case 11: 
				posicao2 +=2;
				System.out.println("Avance 2 casas! Sua atual posição será: "+posicao2+"\n");
				break;
			case 12: 
				posicao2-=3;
				System.out.println("Ah! você terá que retornar 3 casas! Sua atual posição será: "+posicao2+"\n");
				break;
			case 13: System.out.println("Casa sem especial!"+"\n");
				break;
			case 14: 
				posicao2 +=3;
				System.out.println("Avance 3 casas! Sua atual posição será:"+posicao2+"\n");
				break;
			case 15: 
				posicao2-=2;
				System.out.println("Ah! você terá que retornar 2 casas! Sua atual posição será: "+posicao2+"\n");
				break;
			case 16:
				posicao2-=3;
				System.out.println("Ah! você terá que retornar 3 casas! Sua atual posição será: "+posicao2+"\n");
				break;
			case 17: System.out.println("Casa sem especial! "+"\n");
				break;
			case 18: 
				posicao2 +=3;
				System.out.println("Avance 3 casas! Sua atual posição será:"+posicao2+"\n");
				break;
			case 19: 
				posicao2 +=2;
				System.out.println("Avance 2 casas! Sua atual posição será: "+posicao2+"\n");
				break;
			case 20: 
				posicao2-=3;
				System.out.println("Ah! você terá que retornar 3 casas! Sua atual posição será: "+posicao2+"\n");
				break;
			case 21: System.out.println("Casa sem especial! "+"\n");
				break;
			case 22: 
				posicao2 +=2;
				System.out.println("Avance 2 casas! Sua atual posição será: "+posicao2+"\n");
				break;
			case 23: 
				posicao2-=4;
				System.out.println("Ah! você terá que retornar 4 casas! Sua atual posição será: "+posicao2+"\n");
				break;
			case 24: System.out.println("Casa sem especial! "+"\n");
				break;
			case 25: 
				posicao2-=3;
				System.out.println("Ah! você terá que retornar 3 casas! Sua atual posição será: "+posicao2+"\n");
				break;
			case 26: 
				posicao2 +=1;
				System.out.println("Avance 1 casas! Sua atual posição será: "+posicao2+"\n");
				break;
			case 27: System.out.println("Casa sem especial! "+"\n");
				break;
			case 28: 
				posicao2 -=1;
				System.out.println("Ah! você terá que retornar 1 casas! Sua atual posição será: "+posicao2+"\n");
				break;
			case 29: 
				posicao2 +=2;
				System.out.println("Avance 2 casas! Sua atual posição será: "+posicao2+"\n");
				break;
			case 30: System.out.println("Casa sem especial! "+"\n");
			break;
			
			}
		
		if(posicao1>=30) {
			System.out.println("JOGADOR 1 VENCEDOR");
			finalizar = true;
			break; }
		else if(posicao2>=30) {
			System.out.println("JOGADOR 2 VENCEDOR");
			finalizar = true;
			break;	
			}
	}while(finalizar!=true); 
			}}
			
