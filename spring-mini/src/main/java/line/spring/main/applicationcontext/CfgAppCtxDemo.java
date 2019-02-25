/**
 * 
 */
package line.spring.main.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import line.spring.config.Config;

/**
 * @author line
 *
 */
public class CfgAppCtxDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		String myString = (String)ctx.getBean("myString");
		System.out.println(myString);
		((AbstractApplicationContext) ctx).close();
	}
}