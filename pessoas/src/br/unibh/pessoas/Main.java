package br.unibh.pessoas;

import br.unibh.persistencia.PessoaFisicaDAO;

public class Main {

	public static void main(String[] args) {
		
		PessoaFisicaDAO pessoafisicaDAO = new PessoaFisicaDAO();
		pessoafisicaDAO.findAll();
	}

}