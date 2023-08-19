package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.met.model.Employee;
import com.met.model.Stage;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext appContext = new
				ClassPathXmlApplicationContext("test.xml");
				
				 System.out.println("********************Post Spring Container Initialization*******************");
		
		
		Employee employeeBean = appContext.getBean("emp1", Employee.class);
		System.out.println(employeeBean);
		System.out.println("Annual salary of bean with id emp1:  "+ employeeBean.totalsalary());
		
		Employee employeeTest = (Employee)   appContext.getBean("emp1");
		System.out.println(employeeTest);
		System.out.println("Annual salary of bean with id emp1:  "+ employeeTest.totalsalary());
		
		
		Employee employee3 = appContext.getBean("emp3", Employee.class);
		System.out.println(employee3);
		
		Employee employee3Prototype = appContext.getBean("emp3", Employee.class);
		System.out.println(employee3Prototype);
		
		Employee employee4 = appContext.getBean("emp4", Employee.class);
		System.out.println(employee4);
		
		Employee employee5 = appContext.getBean("emp5", Employee.class);
		System.out.println(employee5);
		
		Employee employee6 = appContext.getBean("emp6", Employee.class);
		System.out.println(employee6);
		
	
		Employee employee7 = appContext.getBean("emp7", Employee.class);
		System.out.println(employee7);

		System.out.println("lazy-init");
		Employee employee8 = appContext.getBean("emp8", Employee.class);
		System.out.println(employee8);
		
		Employee employee9 = appContext.getBean("emp9", Employee.class);
		System.out.println(employee9);
		
		Stage st1=appContext.getBean("stage1", Stage.class);
		System.out.println(st1);
	}

}
