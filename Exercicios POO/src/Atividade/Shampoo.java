package Atividade;

public class Shampoo extends Produto  {

	private Integer irritabilidade;

	public Shampoo(String nome, Double pre�o, String dataValidade, Integer irritabilidade) {
		super(nome, pre�o, dataValidade);
		this.irritabilidade = irritabilidade;
	}

	public Integer getIrritabilidade() {
		return irritabilidade;
	}

	public void setIrritabilidade(Integer irritabilidade) {
		this.irritabilidade = irritabilidade;
	}
	
	public String toString() {
		return "Produto : Shampoo, Pre�o :  " + getPre�o() + "Data e Validade" + getDataValidade() + "Irritabilidade : " + irritabilidade;
	}
	
}
