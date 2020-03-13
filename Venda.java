package miniTest8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
	
	private String data;
	private VendaBuilder builder;
	private List<ItemVenda> itemVendidos = new ArrayList<>();
	private Cliente cliente;
	private Funcionario funcionario;
	private Frete frete;
	private Double total;
	
	public void addItem(ItemVenda produto) {
		itemVendidos.add(produto);
	}
	
	public Venda(VendaBuilder vendaBuilder){
		this.builder = vendaBuilder;
	}
	public Venda(String data){
		this.data = data;
	}

	public Venda() {
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public List<ItemVenda> getItemVendidos() {
		return itemVendidos;
	}
	public void setItemVendidos(List<ItemVenda> itemVendidos) {
		this.itemVendidos = itemVendidos;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Frete getFrete() {
		return frete;
	}
	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	@Override
	public String toString() {
		return "Venda: data = " + data + ", itemVendidos = " + itemVendidos + ", cliente = "
				+ cliente + ", funcionario = " + funcionario + ", frete = " + frete;
	}
}