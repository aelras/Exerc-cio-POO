package Atividade;

public class Leite extends Produto {

	private Integer dura��oDias;

	public Leite(String nome, Double pre�o, String dataValidade, Integer dura��oDias) {
		super(nome, pre�o, dataValidade);
		this.dura��oDias = dura��oDias;
	}

	public Integer getDura��oDias() {
		return dura��oDias;
	}

	public void setDura��oDias(Integer dura��oDias) {
		this.dura��oDias = dura��oDias;
	}
	
	public String toString() {
		return "Produto : Leite, Pre�o : " + getPre�o() + "Data de Validade : " + getDataValidade() + "Dura��o da validaasde em dias " + dura��oDias;
	}
	
	
}
