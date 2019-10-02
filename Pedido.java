import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Pedido extends Operacao {

	private int code;
	protected Vendedor vendedor;
	protected Cliente cliente;
	protected List<Produto> listaProdutos;
	
	public Pedido() {
		vendedor = new Vendedor();
		cliente = new Cliente();
		listaProdutos = new ArrayList<Produto>();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public boolean verificaProdutoUnico(Produto produto) {
		for(int i=0;i<listaProdutos.size();i++){
			if(listaProdutos.get(i).getDescricao().compareToIgnoreCase(produto.getDescricao()) == 0)
				return true;
	}
		return false;
		
	}
	
	public boolean addProduto(Produto produto) {
		if(!verificaProdutoUnico(produto)) {
			this.listaProdutos.add(produto);
			return true;
		}
		return false;
	}
	
	public double totalPedido() {
		double total = 0;
		for(int i=0;i<listaProdutos.size();i++){
			total += listaProdutos.get(i).getValor();
		}
		return total;
	}
	
	public double valorMedia() {
		return totalPedido() / listaProdutos.size();
	}
	
	public List<Produto> quantidadeMaior(int quantidade){
		List<Produto> qtdMaior = new ArrayList<Produto>();
		for(int i=0;i<listaProdutos.size();i++){
			if(listaProdutos.get(i).getQtd() > quantidade) {
				qtdMaior.add(listaProdutos.get(i));
			}
		}
		return qtdMaior;
	}
	
	public String nomeVendedor() {
		return this.vendedor.getNome();
		
	}
	
	public String emailCliente() {
		return this.cliente.getEmail();
	}
	
	public ArrayList<Produto> buscaProdutoDescricao(String descricao) {

		ArrayList<Produto> list = new ArrayList<Produto>();
		for (int i = 0; i < listaProdutos.size(); i++) {
			if (descricao.substring(0, descricao.length())
					.equals(listaProdutos.get(i).getDescricao().substring(0, descricao.length())))
				list.add(listaProdutos.get(i));
		}
		return list;
	}
	
	public int dias() {
		long diferenca;
		diferenca = this.getDataFim().getTime().getTime() -this.getDataInicio()
				.getTime().getTime();
		diferenca = TimeUnit.MILLISECONDS.toDays(diferenca);
		
		return (int) diferenca;
	}
		
		
	public String toString() {
		final int maxLen = 10;
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [code=");
		builder.append(code);
		builder.append(", vendedor=");
		builder.append(vendedor);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", listaProdutos=");
		builder.append(listaProdutos != null ? listaProdutos.subList(0, Math.min(listaProdutos.size(), maxLen)) : null);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}

}
