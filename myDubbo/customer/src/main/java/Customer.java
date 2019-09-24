import com.nanmu.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"customer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world111"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}