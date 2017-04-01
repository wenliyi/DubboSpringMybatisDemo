/**
 * Created by root on 17-4-1.
 */
import com.wenly.domain.User;
import com.wenly.service.InsertService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringMybatisTest {
    private static ApplicationContext act;
    private static  InsertService insertService;
    static{
        act = new ClassPathXmlApplicationContext(
                new String[]{"spring.xml","spring-mybatis.xml"});
        insertService = (InsertService)act.getBean("insertService");
    }
    public static void main(String[] args) {
        User userTest = new User("John",24);
        insertService.insertUser(userTest);
    }
}
