package pctAtividadecase01;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
char opcao;
double preco = 0;
int quantidade;
		
System.out.println("Menu lanchonete");
System.out.println("a-Café (R$4)");		
System.out.println("b-Suco (R$6)");
System.out.println("c-Sanduíche (R$10)");
System.out.println("Escolhar a opçao");
opcao = ler.next().charAt(0);
System.out.println("digite a quantidade");
quantidade = ler.nextInt();

switch(opcao) {
case 'a':
	preco = 4 * quantidade;
	break;
case 'b':
	preco = 6 * quantidade;
	break;
case 'c':
	preco = 10 * quantidade;
	break;
	default:
		System.out.println("Opção invalida ");
}
System.out.println("Total da compra é R$" + preco);
		ler.close();

	}

}
