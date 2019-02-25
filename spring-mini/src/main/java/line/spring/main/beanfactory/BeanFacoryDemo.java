package line.spring.main.beanfactory;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import line.spring.beans.Car;

public class BeanFacoryDemo {

	public static void main(String[] args) {
		try {
			test1();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public static void test1() throws Throwable {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource resource = resolver.getResource("classpath:spring-beans.xml");
//		Resource resource = resolver.getResource("spring-beans.xml");
		System.out.println("url : " + resource.getURL());
		System.out.println("uri : " + resource.getURI());
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		
		Car car = factory.getBean("car", Car.class);
		System.out.println(car);
	}
}
