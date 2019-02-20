package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class TesteRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {
		
		LivrariaWSProxy cliente = new LivrariaWSProxy();
		
		Livro[] livros = cliente.getLivrosPeloNome("JAVA");
		
		for (Livro livro : livros) {
			System.out.println("TITULO DO LIVRO: " + livro.getTitulo() + " E AUTOR: " + livro.getAutor().getNome());			
		}
		

	}

}
