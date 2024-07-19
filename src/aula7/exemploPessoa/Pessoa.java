package aula7.exemploPessoa;


import java.io.Serializable;

public class Pessoa implements Serializable {

	private String nome;
	private String sobrenome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString(){
		return "Nome: "+nome+" "+sobrenome;
	}
}
