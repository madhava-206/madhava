package simplecurdexample;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Employee_Get {
public static void get_data(){
     try {
    	 Configuration cfg = new Configuration();
    		cfg.configure("hibernate.cfg.xml");
    		SessionFactory sf = cfg.buildSessionFactory();
    		Session session = sf.openSession();
    		session.beginTransaction();
    		Transaction t = session.beginTransaction();
    		Employee obj_Employee=new Employee();
    		obj_Employee=(Employee)session.get(Employee.class,2);
    		System.out.println("Get the Employee Data -"+obj_Employee.getEmployee_name());
    		session.beginTransaction().commit(); 
    		session.close();
    		sf.close();
     		} catch (Exception e) {
     			System.out.println(e);
     		}
       }
}