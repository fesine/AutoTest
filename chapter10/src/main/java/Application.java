import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/20
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/20
 */
@SpringBootApplication
@ComponentScan("com.fesine.autotest")
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
