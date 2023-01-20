package Atividade;

public class PastaDeDente extends Produto {

	private Integer brilho;

	public PastaDeDente(String nome, Double preço, String dataValidade, Integer brilho) {
		super(nome, preço, dataValidade);
		this.brilho = brilho;
	}

	public Integer getBrilho() {
		return brilho;
	}

	public void setBrilho(Integer brilho) {
		this.brilho = brilho;
	}

	@Override
	public String toString() {
		
		return "Produto : Pasta de Dentes, Preço :  " + getPreço() + "Data e Validade" + getDataValidade() + "Brilho : " + brilho;
	}
	
	
}
