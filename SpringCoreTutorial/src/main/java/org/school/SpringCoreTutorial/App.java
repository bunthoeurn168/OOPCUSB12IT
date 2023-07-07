package org.school.SpringCoreTutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// no loose coupling
        /*Employee emp = new Employee(1, "Sok San");
        System.out.println(emp);*/
    	
    	// Use loose coupling
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Address addr = (Address) context.getBean("address");
    	Employee emp = (Employee) context.getBean("employee");
    	emp.setId(101);
    	emp.setName("Sok San");
    	addr.setCity("Preah Sihanouk");
    	System.out.println(emp);
    	
    	
    	
    }
}
