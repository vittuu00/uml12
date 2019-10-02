import java.util.Calendar;

public class Main {

	public static void main(String[]args) {
		
		Produto p1 = new Produto();
		p1.setCode(123);
		p1.setDescricao("teclado");
		p1.setQtd(5);
		p1.setValor(10);

		Produto p2 = new Produto();
		p2.setCode(321);
		p2.setDescricao("nada");
		p2.setQtd(9);
		p2.setValor(0);
		
		Vendedor v = new Vendedor();
		v.setCode(54321);
		v.setNome("vitor");
		
		Cliente c = new Cliente();
		c.setCode(4213);
		c.setEmail("email@gmail.com");
		c.setNome("carlos");
		
		Pedido p = new Pedido();
		p.setCode(1);
		//p.listaProdutos.add(p1);
		p.listaProdutos.add(p2);
		Calendar data1 = Calendar.getInstance();
		data1.set(Calendar.DAY_OF_MONTH, 9);
		data1.set(Calendar.MONTH, 9);
		data1.set(Calendar.YEAR, 2019);
		Calendar data2 = Calendar.getInstance();
		data2.set(Calendar.DAY_OF_MONTH, 9);
		data2.set(Calendar.MONTH, 10);
		data2.set(Calendar.YEAR, 2019);
		p.setDataFim(data2);
		p.setDataInicio(data1);
		
		
		System.out.println(p.verificaProdutoUnico(p2));
		System.out.println(p.addProduto(p2));
		System.out.println(p1.totalItem());
		System.out.println(p.totalPedido());
		System.out.println(p.valorMedia());
		System.out.println(p.quantidadeMaior(2));
		System.out.println(p.dias());
		System.out.println(p.buscaProdutoDescricao("n"));
	}	
}
