package br.unibh.entidades;

public class Pessoa {
	private Long id;
	private String nome;
	private String endereco;
	private String telefone;
	
	
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public Pessoa(Long id, String nome, String endereco, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	
	

}

