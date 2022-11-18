package model.umpramuitos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteUmPraMuitos {
	
	public static void main(String[] args) {
		
		UmPraMuitosDepartamento departamento = new  UmPraMuitosDepartamento("Tecnologia");
		UmPraMuitosFuncionario funcionario = new UmPraMuitosFuncionario("Diogo Di Blasi", departamento);
		UmPraMuitosFuncionario funcionario1 = new UmPraMuitosFuncionario("Thiago", departamento);
		UmPraMuitosFuncionario funcionario2 = new UmPraMuitosFuncionario("Ludmila", departamento);

		

		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muitos");

		
		EntityManager manager = factory.createEntityManager();

		//Fazer alguma operação de transação
		manager.getTransaction().begin();
		manager.persist(departamento);
		manager.persist(funcionario);
		manager.persist(funcionario1);
		manager.persist(funcionario2);

		manager.getTransaction().commit();
		
		System.out.println("Inserido com sucesso!!!");
		
		
		manager.close();
		factory.close();
	}

}
