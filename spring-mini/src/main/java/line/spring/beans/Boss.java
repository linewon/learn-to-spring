package line.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

import line.spring.services.CarWashService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Boss {

	private String name;
	private Car car;
	/**
	 * 通过Autowired注解的bean
	 * 在配置文件中可以不赋予id，直接通过class属性找到对应的bean
	 * 
	 * 这里的bean的作用域设成prototype也没关系，每次也会重新给生成一个service的
	 */
	@Autowired 
	private CarWashService carWashService;
	
	public void washCar() {
		carWashService.washCar(this, this.car);
	}
}
