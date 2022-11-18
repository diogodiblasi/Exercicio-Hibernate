package model.muitospramuitos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteMuitosPraMuitos {
	
	public static void main(String[] args) {
		
	Livro livro = new Livro("Descoberta");
	Livro livro1 = new Livro ("Historia do Brasil");
	
	Autor autor = new Autor("Diogo");
	Autor autor1 = new Autor ("Thiago");
	
	livro.getAutores().add(autor);
	autor.getLivros().add(livro);
	
	livro.getAutores().add(autor1);
	autor.getLivros().add(livro1);
	
	livro1.getAutores().add(autor);
	autor1.getLivros().add(livro);
	
	livro1.getAutores().add(autor1);
	autor1.getLivros().add(livro1);
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("muitos");

	EntityManager manager = factory.createEntityManager();

	manager.getTransaction().begin();
	manager.persist(livro);
	manager.persist(livro1);
	manager.persist(autor);
	manager.persist(autor1);

	manager.getTransaction().commit();
	
	System.out.println("Inserido com sucesso!!!");
	
	
	manager.close();
	factory.close();
	
		
	}

}
