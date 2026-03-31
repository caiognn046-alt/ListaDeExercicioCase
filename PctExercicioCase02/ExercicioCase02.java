package PctExercicioCase02;

import java.util.Scanner;

public class ExercicioCase02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
int opcao;
double preco = 0;
int quantidade;
double desconto;
		
System.out.println("Menu lanchonete");
System.out.println("1-Hambúrguer (R$15)");		
System.out.println("2 - Pizza (R$ 20)");
System.out.println("3 - Refrigerante (R$ 5)");
System.out.println("Escolhar a opçao");
opcao = ler.nextInt();
System.out.println("digite a quantidade");
quantidade = ler.nextInt();

	
	
switch(opcao) {
case 1:
	preco = 15 * quantidade ; 
	break;
case 2:
	preco = 20 * quantidade ;
	break;
case 3:
	preco = 5  * quantidade ;
	break;
	default:
		System.out.println("Opção invalida ");
		
}
if(quantidade>=3) {
	System.out.println("voce recebeu 10% dedesconto R$"+ (preco-(preco*0.10)));
}else {
	System.out.println("O total de sua compra é R$"+ preco);
}

		ler.close();

	}

}
