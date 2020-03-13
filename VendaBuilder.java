package miniTest8;

public class VendaBuilder {
	
	private Venda venda;
//	private ItemVenda item;

	public VendaBuilder() {
		venda = new Venda();
	}
	public VendaBuilder data(String data) {
		venda.setData(data);
		return this;
	}
	public VendaBuilder ClientePF(String nome, String cpf) {
		venda.setCliente(new ClientePF(nome,cpf));
		return this;
	}
	public VendaBuilder ClientePJ(String cnpj,String razaoSocial) {
		venda.setCliente(new ClientePJ(cnpj,razaoSocial));
		return this;
	}
	public VendaBuilder item(int quant, Produto produto) {
		venda.addItem(new ItemVenda(quant,produto));
		return this;
	}
	public VendaBuilder Funcionario(String nome) {
		venda.setFuncionario(new Funcionario(nome));
		return this;
	}
	public VendaBuilder Frete(double valor) {
		venda.setFrete(new Frete(valor));
		return this;
	}
	public Venda Build() {
		return venda;
	}
}