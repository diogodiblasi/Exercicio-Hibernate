package model.umpraum;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class InserirUmparaUm {

	public static void main(String[] args) {
		
		UmPraUmGovernador governador = new UmPraUmGovernador("Ludmila ");
		UmPraUmEstado estado = new UmPraUmEstado ("Itaipava", governador);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muitos");

		
		EntityManager manager = factory.createEntityManager();

		//Fazer alguma operação de transação
		manager.getTransaction().begin();
		manager.persist(governador);
		manager.persist(estado);
		
		manager.getTransaction().commit();
		
		System.out.println("Inserido com sucesso!!!");
		
		
		manager.close();
		factory.close();
	}
	
}
