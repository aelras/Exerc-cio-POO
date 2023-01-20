package Atividade;

public abstract class Produto {


		
		private String nome;
		private Double pre�o;
		private String dataValidade;
		
		public Produto(String nome, Double pre�o, String dataValidade) {
			
			this.nome = nome;
			this.pre�o = pre�o;
			this.dataValidade = dataValidade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Double getPre�o() {
			return pre�o;
		}

		public void setPre�o(Double pre�o) {
			this.pre�o = pre�o;
		}

		public String getDataValidade() {
			return dataValidade;
		}

		public void setDataValidade(String dataValidade) {
			this.dataValidade = dataValidade;
		}
		
		
		public abstract String toString();
		
	}
		
	
	
	

