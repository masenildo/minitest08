package miniTest8;

public class ItemVenda {
	
	private int quant;
	private Produto produto;
	
	public ItemVenda(int quantidade, Produto produto) {
		this.quant = quantidade;
		this.produto = produto;
	}
	public int getQuantidade() {
		return quant;
	}
	public void setQuantidade(int quantidade) {
		this.quant = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	@Override
	public String toString() {
		return "ItemVenda: quantidade = " + quant + ", produto = " + produto;
	}
}