package Atividade;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
public static void main(String[] args) {

		Calcular cal = new Calcular();
		List<Shampoo> shampoo = new ArrayList<>();
		shampoo.add(new Shampoo("Dove", 15.0, "02/02/2023", 5));
		shampoo.add(new Shampoo("Jhonsons", 20.0, "11/09/2024", 3));
		shampoo.add(new Shampoo("Lux", 10.0, "10/06/2023", 2));
		shampoo.add(new Shampoo("TREsemmé", 12.0, "05/12/2025",1));
		shampoo.add(new Shampoo("Seda", 18.0, "03/05/2023",2));
		System.out.println("--Shampoo--");
		System.out.println("Média : " + cal.media(shampoo));
		System.out.println("O Shampoo mais caro é: " + cal.maisCaro(shampoo));
		System.out.println("O Shampoo mais barato é: " + cal.maisBarato(shampoo));
		System.out.println("--------------");
		
		List<Biscoito> biscoito = new ArrayList<>();
		biscoito.add(new Biscoito("Nescal", 3.50, "06/08/2025", 7));
		biscoito.add(new Biscoito("Toddy", 5.00, "15/06/2023", 5));
		biscoito.add(new Biscoito("Oreo", 6.50, "09/01/2024", 3));
		biscoito.add(new Biscoito("PassaTempo", 4.00, "03/02/2024", 5));
		biscoito.add(new Biscoito("Negresco", 6.99, "04/04/2024", 1));
		System.out.println("--Biscoito--");
		System.out.println("Média : " + cal.media(biscoito));
		System.out.println("O biscoito mais caro é: " + cal.maisCaro(biscoito));
		System.out.println("O biscoito mais barato é: " + cal.maisBarato(biscoito));
		System.out.println("--------------");
		
		List<Leite> leite = new ArrayList<>();
		leite.add(new Leite("Mimosa", 7.00, "10/10/2023", 5));
		leite.add(new Leite("Cativa", 5.00, "05/10/2023", 9));
		leite.add(new Leite("Piracamjuba", 2.59, "05/06/2023", 10));
		leite.add(new Leite("Elegê", 8.00, "05/05/2025", 6));
		leite.add(new Leite("LeitedaRoça", 7.00, "17/07/2023", 8));
		System.out.println("--Leite--");
		System.out.println("Média : " + cal.media(leite));
		System.out.println("O leite mais caro é: " + cal.maisCaro(leite));
		System.out.println("O Leite mais barato é: " + cal.maisBarato(leite));
		System.out.println("--------------");
		
		List<Carne> carne = new ArrayList<>();
		carne.add(new Carne("Frango", 25.00, "10/03/2023", 10));
		carne.add(new Carne("Asa", 9.00, "08/05/2023", 8));
		carne.add(new Carne("Coxa", 21.00, "06/04/2023", 9));
		carne.add(new Carne("Sassami", 19.90, "07/06/2023",7));
		carne.add(new Carne("Peito", 15.90, "09/06/2023",5));
		System.out.println("--Carne--");
		System.out.println("Média : " + cal.media(carne));
		System.out.println("A carne mais cara é: " + cal.maisCaro(carne));
		System.out.println("A carne mais barato é: " + cal.maisBarato(carne));
		System.out.println("--------------");
		
		List<PastaDeDente>pastaDeDente = new ArrayList<>();
		pastaDeDente.add(new PastaDeDente("Colgate", 28.00, "19/03/2023", 10));
		carne.add(new Carne("Tandy", 15.00, "08/05/2023", 8));
		carne.add(new Carne("Sensodiny", 29.00, "06/04/2023", 9));
		carne.add(new Carne("Sorriso", 8.90, "07/06/2023",4));
		carne.add(new Carne("Close up", 15.90, "09/06/2023",5));
		System.out.println("--Paste de dentes--");
		System.out.println("Média : " + cal.media(pastaDeDente));
		System.out.println("A pasta de dentes mais cara é: " + cal.maisCaro(pastaDeDente));
		System.out.println("A pasta de dentes mais barata é: " + cal.maisBarato(pastaDeDente));
		System.out.println("--------------");
		
	}

}

