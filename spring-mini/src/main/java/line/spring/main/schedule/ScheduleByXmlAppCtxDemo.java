package line.spring.main.schedule;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 怎么通过注解来实现？
 */
public class ScheduleByXmlAppCtxDemo {

    public static void main(String[] args) {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/config/schedule-task.xml");
        try {
			Thread.sleep(60 * 1000);
		} catch (InterruptedException e) {
		}
        ((ConfigurableApplicationContext) context).close();
    }
}
