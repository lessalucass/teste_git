package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Produto;

public class ProdutoController {

	public static void main(String[] args) {
		
		/*
		//chamando o procedimento de uma classe
		// o new está fazendo uma referência à classe Produto utilizando ponteiros
		Produto produto1 = new Produto("Arroz", 18.50, 100); //produto1 é uma instância da classe Produto ou um objeto
		//ctrl+espaço abre o simplificador
		System.out.println(produto1.getNome());
		System.out.println(produto1.getValor());
		System.out.println(produto1.getEstoque());
		produto1.setEstoque(-100);
		System.out.println(produto1.getEstoque());
		
		
		Produto produto2 = new Produto("Feijão", 8.30, 100);//new é o método de chamar o contrutor padrão do objeto
		System.out.println();
		System.out.println(produto2.getNome());
		System.out.println(produto2.getValor());
		System.out.println(produto2.getEstoque());
		
		Produto produto3 = new Produto();//consultor padrão ou vazio que vai utilizar o que tiver na classe principal
		System.out.println();
		System.out.println(produto3.getNome());
		System.out.println(produto3.getValor());
		System.out.println(produto3.getEstoque());
		
		Produto produto4 = new Produto();
		System.out.println();
		System.out.println(produto4.getNome());
		System.out.println(produto4.getValor());
		System.out.println(produto4.getEstoque());
		
		Produto produto5 = new Produto("Batata", 2.50, 60);
		System.out.println();
		System.out.println(produto5.toString());
		//Se quiser não precisa escrever o toString
		*/
		
		//Aula sobre Manipulação de Coleções do tipo List (vídeo Aula 16) 
		
		//Cada produto simula um registro em um banco de dados
		Produto produto1 = new Produto("Arroz", 18.50, 100); //produto1 é a instância da classe Produto
		Produto produto2 = new Produto("Feijão", 8.30, 100);
		Produto produto3 = new Produto("Café", 13.10, 100);
		Produto produto4 = new Produto("Açúcar", 2.20, 100);
		Produto produto5 = new Produto("Batata", 2.50, 60);
		
		//Criando a lista
		//Criando a coleção e adicionando objetos 
		//O Produto dentro do sinal de maior e menor é de onde está vindo essa lista
		List<Produto> produtos = new ArrayList<>();
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);
		
		System.out.println("----- Lista Original -----");
		System.out.println(produtos);
		
		//Ordenação da coleção do tipo List (Vídeo Aula 18)
		
		//Ordenar a coleção pelo atributo nome do produto (ordem alfabética)
		//Se usa o nome da classe (getNome) porque ela é um metodo acessor que está público
		produtos.sort(Comparator.comparing(Produto::getNome));
		System.out.println("----- Lista Ordenada -----");
		System.out.println(produtos);
		
		//Ordenar a coleção de maneira invertida
		produtos.sort(Comparator.comparing(Produto::getNome).reversed());
		System.out.println("----- Lista Ordenada Invertida -----");
		System.out.println(produtos);
		
		//Pesquisa utilizando a coleção do tipo List (Vídeo Aula 19)
		//Pesquisa de força bruta
		//p = produto
		System.out.println();
		System.out.print("Localizando o produto pelo nome Açúcar (pela chave, usando força bruta)...");
		//Também pode ser for( Produto p : produtos ){}
		produtos.forEach(p -> {
			if (p.getNome().equals("Açúcar")){
				System.out.println(p);
			}
		});
		
		//Pesquisando na coleção pelo método filter
		System.out.println();
		System.out.print("Localizando o produto pelo nome Açúcar (pela chave, usando o filter)...");
		Produto produtoFind = produtos.stream().filter(p -> p.getNome().equals("Açúcar")).findAny().orElse(null); 
		System.out.println(produtoFind);
	}
}
//"println" cria uma nova linha e "print" não