package line.spring.config;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 首先通过@Component，将此类加入spring容器，
 * 再通spring的xml配置，生成定时任务。
 */
@Component
public class ScheduleTask {

    public void execute1(){
        System.out.printf("Task: %s, Current time: %s\n", 1, LocalDateTime.now());
    }

    public void execute2(){
        System.out.printf("Task: %s, Current time: %s\n", 2, LocalDateTime.now());
    }

    public void execute3(){
        System.out.printf("Task: %s, Current time: %s\n", 3, LocalDateTime.now());
    }

    public void execute4(){
        System.out.printf("Task: %s, Current time: %s\n", 4, LocalDateTime.now());
    }

    public void execute5(){
        System.out.printf("Task: %s, Current time: %s\n", 5, LocalDateTime.now());
    }

    public void execute6(){
        System.out.printf("Task: %s, Current time: %s\n", 6, LocalDateTime.now());
    }

    public void execute7(){
        System.out.printf("Task: %s, Current time: %s\n", 7, LocalDateTime.now());
    }

    public void execute8(){
        System.out.printf("Task: %s, Current time: %s\n", 8, LocalDateTime.now());
    }

    public void execute9(){
        System.out.printf("Task: %s, Current time: %s\n", 9, LocalDateTime.now());
    }

    public void execute10(){
        System.out.printf("Task: %s, Current time: %s\n", 10, LocalDateTime.now());
    }

    public void execute11(){
        System.out.printf("Task: %s, Current time: %s\n", 11, LocalDateTime.now());
    }

}
