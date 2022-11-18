package model.umpramuitos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="funcionarios")
public class UmPraMuitosFuncionario {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	
	@ManyToOne
	private UmPraMuitosDepartamento Departamento;

	public UmPraMuitosFuncionario() {
		// TODO Auto-generated constructor stub
	}

	public UmPraMuitosFuncionario(String nome, UmPraMuitosDepartamento departamento) {
		super();
		this.nome = nome;
		Departamento = departamento;
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

	public UmPraMuitosDepartamento getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(UmPraMuitosDepartamento departamento) {
		Departamento = departamento;
	}
	
}
