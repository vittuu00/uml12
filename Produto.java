
public class Produto {

	private int code;
	private String descricao;
	private double valor;
	private int qtd;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double totalItem() {
		return this.valor * this.qtd;
	}
	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [code=");
		builder.append(code);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", qtd=");
		builder.append(qtd);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
