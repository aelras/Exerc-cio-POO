package Atividade;

public class PastaDeDente extends Produto {

	private Integer brilho;

	public PastaDeDente(String nome, Double pre�o, String dataValidade, Integer brilho) {
		super(nome, pre�o, dataValidade);
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
		
		return "Produto : Pasta de Dentes, Pre�o :  " + getPre�o() + "Data e Validade" + getDataValidade() + "Brilho : " + brilho;
	}
	
	
}
