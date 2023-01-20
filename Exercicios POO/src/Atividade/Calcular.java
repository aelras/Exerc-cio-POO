package Atividade;

import java.util.Iterator;
import java.util.List;

public class Calcular {
	/**
	 * 
	 * @param list
	 * @return  Calculando a m�dia de pre�o dos Produtos - m�dia do leite, do biscoito e do shampoo, cada se��o 1 m�dia
	 */

	public double media(List<? extends Produto>list) {
		
		double soma=0;
		for(int i = 0; i<list.size();i++) {
			soma = soma + list.get(i).getPre�o();
		}
		return soma/list.size();
	}
	
	/**
	 *  Calculano o menor e o maior custo benef�cio de cada se��o
	 */
	public double maisCaro(List<? extends Produto>list) {
		double maisCaro = list.get(0).getPre�o();
		for(int i = 0;i<list.size();i++) {
			if(list.get(i).getPre�o()>maisCaro) {
				maisCaro = list.get(i).getPre�o() ;
			}
		}
		return maisCaro;
	}
	public double maisBarato(List<? extends Produto>list) {
		double maisBarato=list.get(0).getPre�o();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getPre�o()<maisBarato) {
				maisBarato=list.get(i).getPre�o();
			}
		}
		return maisBarato;
	}

}
