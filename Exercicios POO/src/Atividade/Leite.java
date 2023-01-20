package Atividade;

public class Leite extends Produto {

	private Integer duraçãoDias;

	public Leite(String nome, Double preço, String dataValidade, Integer duraçãoDias) {
		super(nome, preço, dataValidade);
		this.duraçãoDias = duraçãoDias;
	}

	public Integer getDuraçãoDias() {
		return duraçãoDias;
	}

	public void setDuraçãoDias(Integer duraçãoDias) {
		this.duraçãoDias = duraçãoDias;
	}
	
	public String toString() {
		return "Produto : Leite, Preço : " + getPreço() + "Data de Validade : " + getDataValidade() + "Duração da validaasde em dias " + duraçãoDias;
	}
	
	
}
