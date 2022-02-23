package simplecurdexample;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Employee_Delete {
 
public static void delete(){
   try {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	Transaction t = session.beginTransaction();
	Employee obj_Employee=new Employee();
	obj_Employee.setEmployee_name("Employee Two");
	session.delete(obj_Employee);
	System.out.println("Deleted  "+obj_Employee.getEmployee_name());
	t.commit(); 
	System.out.println("Done...");
        session.close();
    } catch (Exception e) {
	System.out.println(e);
     }
    }
}