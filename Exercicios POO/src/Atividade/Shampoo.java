package Atividade;

public class Shampoo extends Produto  {

	private Integer irritabilidade;

	public Shampoo(String nome, Double preço, String dataValidade, Integer irritabilidade) {
		super(nome, preço, dataValidade);
		this.irritabilidade = irritabilidade;
	}

	public Integer getIrritabilidade() {
		return irritabilidade;
	}

	public void setIrritabilidade(Integer irritabilidade) {
		this.irritabilidade = irritabilidade;
	}
	
	public String toString() {
		return "Produto : Shampoo, Preço :  " + getPreço() + "Data e Validade" + getDataValidade() + "Irritabilidade : " + irritabilidade;
	}
	
}
