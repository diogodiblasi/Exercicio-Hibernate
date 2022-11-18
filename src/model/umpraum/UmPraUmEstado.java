package model.umpraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="estados")
public class UmPraUmEstado {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	@OneToOne
	private UmPraUmGovernador governador;
	
	public UmPraUmEstado() {
	}

	public UmPraUmEstado(String nome, UmPraUmGovernador governador) {
		super();
		this.nome = nome;
		this.governador = governador;
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

	public UmPraUmGovernador getGovernador() {
		return governador;
	}

	public void setGovernador(UmPraUmGovernador governador) {
		this.governador = governador;
	}
	
	
	
}
