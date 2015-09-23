package br.unibh.entidades;

import java.util.Date;

public class PessoaFisica extends Pessoa{
	
	private String cpf;
	private String email;
	private Date dataNascimento;
	private String sexo;
	

	
	public PessoaFisica(Long id, String nome, String endereco, String telefone, String cpf, String email) {
		super(id, nome, endereco, telefone);
		this.cpf = cpf;
		this.email = email;
	}



	public PessoaFisica(Long id, String nome, String endereco, String telefone, String cpf, String email,
			Date dataNascimento, String sexo) {
		super(id, nome, endereco, telefone);
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}



	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", email=" + email + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo
				+ "]";
	}

	
}
