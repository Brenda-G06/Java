
import aula7.exemploPessoa.Pessoa;
import java.io.*;

public class GravarPessoa {
	public static void main(String[] args) {
		File caminho = new File("C:\\Users\\Cimol");

		if(!caminho.exists()){
			System.out.print("Caminho não existe, tentando criar...");
			caminho.mkdirs();
			System.out.println(" [ok]");
		}
		File arquivo = new File(caminho,"pessoas.db");
		try{
			ObjectOutputStream objEscrita =
							new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
			//criando uma instância de pessoa para escrever dentro do arquivo
			Pessoa p1 = new Pessoa();
			p1.setNome("Jonas");
			p1.setSobrenome("Silva");
			//Escrevendo p1 dentro do arquivo...
			objEscrita.writeObject(p1);
			objEscrita.close();
		}
		catch (FileNotFoundException e){
			System.out.println("Arquivo não encontrado ou não pode ser criado!");
		}
		catch (IOException e){
			System.out.println("Erro ao ler o arquivo");
		}
	}
}
