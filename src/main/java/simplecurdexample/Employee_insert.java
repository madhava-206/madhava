package simplecurdexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Employee_insert {
public static void insert_data(){
	
try {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	Transaction t = session.beginTransaction();
	Employee obj_Employee=new Employee();
	obj_Employee.setEmployee_name("Emplyee One");
	obj_Employee.setMobil_no("22");
	session.save(obj_Employee);
	t.commit();
	session.close();
	sf.close();
      } catch (Exception e) {
	System.out.println(e);
      }
    }
}