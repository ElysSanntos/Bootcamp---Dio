package Venda;
import Estoque.Produto;
import Usuarios.Cliente;

public class Venda {
	private int idVenda;
	private Produto p;
	private Cliente c;
	public Venda(int idVenda, Produto p, Cliente c) {
		this.idVenda = idVenda;
		this.p = p;
		this.c = c;
	}
	public int getIdVenda() {
		return idVenda;
	}
	public Produto getP() {
		return p;
	}
	public Cliente getC() {
		return c;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public void setP(Produto p) {
		this.p = p;
	}
	public void setC(Cliente c) {
		this.c = c;
	}
	
}
