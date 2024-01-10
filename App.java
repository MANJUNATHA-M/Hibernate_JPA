package com.hibernate.jpa1.HIBERNATE_JPA_1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
//    	Pubg p=new Pubg();
//    	p.setpId(1);
//    	p.setpName("HINATA");
//    	p.setpTime(5);
//    	
//    	Pubg p1=new Pubg();
//    	p1.setpId(2);
//    	p1.setpName("NARUTO");
//    	p1.setpTime(10);
//    	
//    	Pubg p2=new Pubg();
//    	p2.setpId(3);
//    	p2.setpName("HANSA");
//    	p2.setpTime(20);
//    	
//    	Pubg p3=new Pubg();
//    	p3.setpId(4);
//    	p3.setpName("MANU");
//    	p3.setpTime(25);
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("MySecondHibJPA");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		
		// helps to save the data to database persist()
		
//		em.persist(p);
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
		
		Pubg out1=em.find(Pubg.class, 1);
		System.out.println(out1);
		
		Pubg out2=em.find(Pubg.class, 2);
		System.out.println(out2);
		
		Pubg out3=em.find(Pubg.class, 3);
		System.out.println(out3);
		
		Pubg out4=em.find(Pubg.class, 4);
		System.out.println(out4);
		
    	
		em.getTransaction().commit();
		em.close();
    	
    }
}
