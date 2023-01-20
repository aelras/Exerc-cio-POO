package Atividade;

public class Carne extends Produto {
	
private Integer proteina;

public Carne(String nome, Double preço, String dataValidade, Integer proteina) {
	super(nome, preço, dataValidade);
	this.proteina = proteina;
}

@Override
public String toString() {
	
	return"Produto : carne, Preço :  " + getPreço() + "Data e Validade" + getDataValidade() + "proteína : " + proteina;
}

public Integer getProteina() {
	return proteina;
}

public void setProteina(Integer proteina) {
	this.proteina = proteina;
}

}
