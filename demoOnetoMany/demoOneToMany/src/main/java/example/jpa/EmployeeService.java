package example.jpa;
import javax.persistence.*;
import java.util.List;
public class EmployeeService {

	protected EntityManager em;
	
	public EmployeeService(EntityManager em){
		this.em=em;
	}
	
	public Employee createEmployee(int id,String name,int salary, Address address){
		
		Employee emp = new Employee(id);
		emp.setAddress(address);
		emp.setName(name);
		emp.setSalary(salary);
		return emp;
	}
	public Department createDepartment(int id, String name, List<Employee> employees){
			Department dept = new Department(id,name, employees);
			em.persist(dept);
			return dept;
	}

	
}
	
