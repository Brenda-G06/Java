
package aula4.javaapplication;
import java.util.Scanner;

  
public class Banco{

	public static String leString(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.nextLine();
	}

	public static float leFloat(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.nextFloat();
	}

	public static ContaCorrente acessaCC(ContaCorrente c1){
         System.out.print(" ");
           leString("Qual o nome do titular: ");                 
			leString("Qual a senha do titular");
                
		return c1;
	}

	public static ContaPoupanca acessaCP(ContaPoupanca c1){
		//Aqui vai teu código
		return c1;
	}
	
	public static void main(String[] args) {
		ContaCorrente[] listaCC = new ContaCorrente[20];
		ContaPoupanca[] listaCP = new ContaPoupanca[20];
		int contCC = 0;
		int contCP = 0;
		String opc;
		do{
			System.out.println("Selecione uma opção");
			System.out.println("cc - cadastrar conta corrente");
			System.out.println("cp - cadastrar conta poupança");
			System.out.println("ac - acessar conta corrente");
			System.out.println("ap - acessar conta poupança");
			System.out.println("e - sair");
			opc = leString("");
		}
		while(!opc.equals("e"));
	}
}
    
    

	