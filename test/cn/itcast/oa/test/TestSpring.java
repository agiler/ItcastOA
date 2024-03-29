package cn.itcast.oa.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

	@Test
	public void testSessionFactory() { // hbm2ddl=update
		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println("-------> " + sessionFactory.openSession());
	}

	@Test
	public void testTransaction() {
		TestService testService = (TestService) ac.getBean("testService");
		testService.addUsers();
	}

}
