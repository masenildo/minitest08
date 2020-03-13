package miniTest8;

import static org.junit.jupiter.api.Assertions.*;

class Test {
	
	@org.junit.jupiter.api.Test
	void test1() {
		Produto Cerveja =  new Produto("Cerveja",3.60);
		Produto Biscoito =  new Produto("Biscoito",2.20);
		Venda primeira = new VendaBuilder()
				.data("12/03/20")
				.ClientePJ("2265485", "Gil de Bola")
				.item(34,Cerveja)
				.item(10,Biscoito)
				.Funcionario("Marcos, Propietário do mercadinho")
				.Frete(70)
				.Build();
		
		assertEquals("Venda: data = 12/03/20, "
				+ "itemVendidos = [ItemVenda: quantidade = 34, produto = Produto: descricao = Cerveja, preco = 3.6, "
				+ "ItemVenda: quantidade = 10, produto = Produto: descricao = Biscoito, preco = 2.2], "
				+ "cliente = ClientePJ: cnpj = 2265485, razaoSocial = Gil de Bola, "
				+ "funcionario = Funcionario: nome = Marcos, Propietário do mercadinho, "
				+ "frete = Frete valor = 70.0",primeira.toString());
	}
	@org.junit.jupiter.api.Test
	void test2() {
		Produto batata =  new Produto("Batata",2.45);
		Produto cenoura =  new Produto("Cenoura",1.80);
		Venda segunda = new VendaBuilder()
				.data("12/03/20")
				.ClientePF("João do Restaurante", "222444")
				.item(30,batata)
				.item(25,cenoura)
				.Funcionario("Milena")
				.Frete(15)
				.Build();
		
		assertEquals("Venda: data = 12/03/20, "
				+ "itemVendidos = [ItemVenda: quantidade = 30, produto = Produto: descricao = Batata, preco = 2.45, "
				+ "ItemVenda: quantidade = 25, produto = Produto: descricao = Cenoura, preco = 1.8], "
				+ "cliente = ClientePF: nome = João do Restaurante, cpf = 222444, "
				+ "funcionario = Funcionario: nome = Milena, "
				+ "frete = Frete valor = 15.0",segunda.toString());
	}

}
