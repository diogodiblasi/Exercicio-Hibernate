package model.muitospraum;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteMuitosPraUm {
	
	public static void main(String[] args) {
		
		MuitosPraUmCliente cliente = new MuitosPraUmCliente("Ludmila");
		MuitosPraUmPedido pedido = new MuitosPraUmPedido("Chocolate", 1,13.40 , cliente);
		MuitosPraUmPedido pedido1 = new MuitosPraUmPedido("Miojo", 4,11.40 , cliente);

		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muitos");

		
		EntityManager manager = factory.createEntityManager();

		//Fazer alguma operação de transação
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.persist(pedido);
		manager.persist(pedido1);

		manager.getTransaction().commit();
		
		System.out.println("Inserido com sucesso!!!");
		
		
		manager.close();
		factory.close();
		
	}

}
