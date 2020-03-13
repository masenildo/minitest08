package miniTest8;

public class ClientePJ extends Cliente{
	
	private String cnpj;
	private String razao;
	
	public ClientePJ(String cnpj, String razaoSocial) {
		this.cnpj= cnpj;
		this.razao = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razaoSocial) {
		this.razao = razaoSocial;
	}
	@Override
	public String toString() {
		return "ClientePJ: cnpj = " + cnpj + ", razaoSocial = " + razao;
	}
}
