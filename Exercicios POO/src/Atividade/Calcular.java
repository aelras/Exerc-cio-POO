package Atividade;

import java.util.Iterator;
import java.util.List;

public class Calcular {
	/**
	 * 
	 * @param list
	 * @return  Calculando a média de preço dos Produtos - média do leite, do biscoito e do shampoo, cada seção 1 média
	 */

	public double media(List<? extends Produto>list) {
		
		double soma=0;
		for(int i = 0; i<list.size();i++) {
			soma = soma + list.get(i).getPreço();
		}
		return soma/list.size();
	}
	
	/**
	 *  Calculano o menor e o maior custo benefício de cada seção
	 */
	public double maisCaro(List<? extends Produto>list) {
		double maisCaro = list.get(0).getPreço();
		for(int i = 0;i<list.size();i++) {
			if(list.get(i).getPreço()>maisCaro) {
				maisCaro = list.get(i).getPreço() ;
			}
		}
		return maisCaro;
	}
	public double maisBarato(List<? extends Produto>list) {
		double maisBarato=list.get(0).getPreço();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getPreço()<maisBarato) {
				maisBarato=list.get(i).getPreço();
			}
		}
		return maisBarato;
	}

}
