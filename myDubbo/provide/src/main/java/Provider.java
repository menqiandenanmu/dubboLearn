import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

public class Provider {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();

        System.out.println("dubbo service started.");
        new CountDownLatch(1).await();
    }
}