package Atividade;

public class Biscoito extends Produto {

	private Integer compCancer;

	public Biscoito(String nome, Double preço, String dataValidade, Integer compCancer) {
		super(nome, preço, dataValidade);
		this.compCancer = compCancer;
	}

	public Integer getCompCancer() {
		return compCancer;
	}

	public void setCompCancer(Integer compCancer) {
		this.compCancer = compCancer;
	}
	
	public String toString() {
		return "Produto : Biscoito , Preço : " + getPreço() + "Data de Validade : " + getDataValidade() + ", Componentes cancerígenos" + compCancer;
		}
	}
