
package aula5.javaapplication;
import java.util.Scanner;

  
public class Banco{

	public static String leString(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.nextLine();
	}

	// public static float leFloat(String mensagem){
	// 	Scanner ler = new Scanner(System.in);
	// 	System.out.print(mensagem+": ");
	// 	return ler.nextFloat();
	// }

	public static ContaCorrente acessaCC(ContaCorrente c1){
         System.out.print(" ");
           leString("Qual o nome do titular: ");                 
			leString("Qual a senha do titular");
                
		return c1;
	}

	public static ContaPoupanca acessaCP(ContaPoupanca c1){
		 System.out.print(" ");
           leString("Qual o nome do titular: ");                 
			leString("Qual a senha do titular");
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
			

float leFloat(String mensagem){
Scanner ler = new Scanner(System.in);
System.out.print(mensagem+":");
return ler.nextFloat();




case "cc"->{
listaCC[contCC] = cadastraCC();
contCC++;
}

case “cp”->{
listaCP[contCP] = cadastraCP();
contCP++;
}
case “ac”->{
String identificador = leString(“qual o identificador”);
String senha = leString(“Qual a senha”);
int posicao = -1;
for(int i=0; i<contCC;i++){
if(listaCC[i].validarAcesso(identificador,senha)){
posicao  = i;}
}
}
if (posicao>=0){
listaCC[posicao] = acessaCC(listaCC[posicao]);
}

else{
System.out.println(“Informaçao de acesso invalida”);
		}
}


public contaCorrente cadastraCC(){
String titular  = leStirng(“qual o nome do titular);
String senha = leString(“qual a senha”);
float limite = leFloat(“qual o limite inicial”);
contaCorrente c1 = new ContaCorrente(titular, senha, limite);
System.out.println(“conta cadastrada com id ”+ c1.getIdentificador());
return c1;
}



public ContaPoupanca cadastraCP(){
String titular  = leStirng(“qual o nome do titular);
String senha = leString(“qual a senha”);
float limite = leFloat(“qual o deposito inicial”);
ContaPoupanca c1 = new ContaPoupanca(titular, senha, deposito);
char[] cadastrada;
System.out.println(“conta cadastrada com id”+ c1.getIdentificador());
return c1;


}


		while(!opc.equals("e"));
	
}
    
    

}