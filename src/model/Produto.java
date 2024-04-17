package model;

//Produto é filho de object, por isso pode usar toString de objeto produto para objeto String
public class Produto extends Object{
	//Pode criar vários objetos a partir dessa classe
	//O método chamado Produto está implícito, utilizando o consultor vazio "()" 
	
	//Construtor padrão
		private String nome;//tipo classe começa sempre com letra maiúscula e os comportamentos com letra minúscula
		private double valor;//nome de variável sempre com letra minúsucla
		private int estoque;// se não tem notação ao lado então é público dentro do mesmo pacote. Se escrever public ele libera o acesso para todos os pacotes do projeto
		
		//construtor padrão
		public Produto() {

		}

		//construtor parametrizado
		public Produto(String nome, double valor, int estoque) {
			super();
			this.nome = nome;//assinatura do método
			this.valor = valor;//utiliza o this para o compilador saber a diferença dos nomes das variáveis e para não dar conflito com os parâmetros iguais 
			this.estoque = estoque;
		}

		public String getNome() {
			return nome;//retorna um nome
		}

		public void setNome(String nome) {
			this.nome = nome;//recebe um valor e atribui ao atributo
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public int getEstoque() {
			return estoque;
		}

		//colocar as regras de acesso dentro da classe que representa o domínio do problema
		public void setEstoque(int estoque) {
			//regra de acesso e de negócio
			int novoEstoque = this.estoque + estoque;
			if(novoEstoque > 0) {
				this.estoque = estoque;	
			}
		}

		//Método utilitário (converte objeto em String)
		//String é delimitado por aspas duplas
		public String toString() {
			return "\nProduto [nome=" + nome + ", valor=" + valor + ", estoque=" + estoque + "]";
		}
		
		
		
		//Métodos acessores (getters e setters)
}
//Se algo for privado (private) para o escopo de uma classe, ele não pode ser acessado no escopo de outra classe e precisa de um método de acesso