package Atividade;

public class Carne extends Produto {
	
private Integer proteina;

public Carne(String nome, Double pre�o, String dataValidade, Integer proteina) {
	super(nome, pre�o, dataValidade);
	this.proteina = proteina;
}

@Override
public String toString() {
	
	return"Produto : carne, Pre�o :  " + getPre�o() + "Data e Validade" + getDataValidade() + "prote�na : " + proteina;
}

public Integer getProteina() {
	return proteina;
}

public void setProteina(Integer proteina) {
	this.proteina = proteina;
}

}
