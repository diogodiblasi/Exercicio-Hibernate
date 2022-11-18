package model.muitospraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "clientes")
public class MuitosPraUmCliente {
	
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	
	public MuitosPraUmCliente() {
	}

	public MuitosPraUmCliente(String nome) {
		super();
		this.nome = nome;
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
	

}
