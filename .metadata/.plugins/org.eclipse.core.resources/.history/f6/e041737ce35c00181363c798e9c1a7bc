package example.jpa;


import javax.persistence.*;


public class EmployeeTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		EmployeeService service = new EmployeeService(em);
		em.getTransaction().begin();
		Address address  = new Address(1, "Abhoynagar,Agartala");
		Employee emp = service.createEmployee(50948, "RK", 100000, address);
		em.getTransaction().commit();
		System.out.println("Persisted "+emp);
		
		/*emp= service.findEmployee(50948);
		System.out.println("Found "+emp);
		
		em.getTransaction().begin();
		emp =service.raiseEmployeeSalary(50948, 20000);
		em.getTransaction().commit();
		System.out.println("Updated "+emp);*/
		em.close();
		emf.close();
	}

}
