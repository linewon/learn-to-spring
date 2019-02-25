package line.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author line
 * @date 2019��2��25�� ����11:58:30
 */
@Slf4j
@SpringBootApplication // ���ע�⣬�̳����Զ�ɨ��ע�⣡
public class MyApp {

	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(MyApp.class);
//		app.setBannerMode(Banner.Mode.OFF);
//		
//		ConfigurableApplicationContext ctx = app.run(args);
		
		ConfigurableApplicationContext ctx = SpringApplication.run(MyApp.class, args);
		
		String myString = (String)ctx.getBean("myString");
		log.info(myString);
		
		ctx.close();
	}
}
