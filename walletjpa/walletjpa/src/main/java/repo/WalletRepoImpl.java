package repo;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import beans.Customer;

public class WalletRepoImpl implements WalletRepo{
	
	 protected EntityManager em;
	
	public WalletRepoImpl(EntityManager em)
	{
		this.em=em;
	}
	
	public boolean save(Customer c) {
		em.persist(c);
		return true;
	}
	
	public Customer findOne(String mobile)
	{
		Query query = em.createQuery("Select c from Customer c where mobilenumber like "+mobile);
		return (Customer) query.getSingleResult();
    }
	
	

	
	
	
	

}
