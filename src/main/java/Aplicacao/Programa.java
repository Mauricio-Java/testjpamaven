package Aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// Preparation Test by Mauricio do Carmo Souza

		 Pessoa p1 = new Pessoa(null, "Mauricio", "mcsouza.pinda@gmail.com"); //Inserir na base
		 Pessoa p2 = new Pessoa(null, "Gabi", "Gabi123@gmail.com"); //Inserir na base
		 Pessoa p3 = new Pessoa(null, "Iza", "Iza12345@gmail.com"); //Inserir na base

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(p1); //Inserir na base
		em.persist(p2); //Inserir na base
		em.persist(p3); //Inserir na base

		em.getTransaction().commit(); //Inserir na base

		//Pessoa j = em.find(Pessoa.class,1);     // Para encontrar algo na tabela da base de dados
		
		//em.getTransaction().begin();  // Para remover
		//em.remove(j);     // Para remover
		//em.getTransaction().commit(); // Para remover
		
		//System.out.println(j);
		
		 System.out.println("Pronto!");
		emf.close();
		em.close();

		//System.out.println(p1);
		//System.out.println(p2);
		//System.out.println(p3);

	}

}
