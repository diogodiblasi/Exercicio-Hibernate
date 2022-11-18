package model.muitospraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name= "pedidos")
public class MuitosPraUmPedido {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private int quantidade;
	
	private Double preco;
	
	@ManyToOne
	private MuitosPraUmCliente cliente;
	
	public MuitosPraUmPedido() {
	}
	

	public MuitosPraUmPedido(String nome, int quantidade, Double preco, MuitosPraUmCliente cliente) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.cliente = cliente;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public MuitosPraUmCliente getCliente() {
		return cliente;
	}

	public void setCliente(MuitosPraUmCliente cliente) {
		this.cliente = cliente;
	}
		
	

}
