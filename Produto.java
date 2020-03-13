package miniTest8;

public class Produto {
	
	private double preco;
	private String descricao;
	
	
	public Produto(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto: descricao = " + descricao + ", preco = " + preco;
	}
}
