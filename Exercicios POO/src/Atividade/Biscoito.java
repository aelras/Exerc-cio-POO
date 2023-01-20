package Atividade;

public class Biscoito extends Produto {

	private Integer compCancer;

	public Biscoito(String nome, Double pre�o, String dataValidade, Integer compCancer) {
		super(nome, pre�o, dataValidade);
		this.compCancer = compCancer;
	}

	public Integer getCompCancer() {
		return compCancer;
	}

	public void setCompCancer(Integer compCancer) {
		this.compCancer = compCancer;
	}
	
	public String toString() {
		return "Produto : Biscoito , Pre�o : " + getPre�o() + "Data de Validade : " + getDataValidade() + ", Componentes cancer�genos" + compCancer;
		}
	}
