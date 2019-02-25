package line.spring.main.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import line.spring.beans.Boss;
import line.spring.beans.Car;

public class XmlAppCtxDemo {

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		Car car = ctx.getBean(Car.class); // 这里也可以不通过id来获取bean
		System.out.println(car);
		Boss boss1 = ctx.getBean("boss", Boss.class);
		System.out.println(boss1);
		Boss boss2 = ctx.getBean("boss", Boss.class);
		System.out.println(boss2);
		
		System.out.println(boss1 == boss2);
		System.out.println(boss1.getCar() == boss2.getCar());
		
		boss1.washCar();
		System.out.println(boss1.getCarWashService() == boss2.getCarWashService());
		((AbstractApplicationContext) ctx).close();
	}
}
