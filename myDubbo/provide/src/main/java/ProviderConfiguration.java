import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @类名: ProviderConfiguration
 * @描述: TODO
 * @作者: nanmu
 * @日期: 2019-09-24
 **/
@Configuration
@EnableDubbo(scanBasePackages = "com.nanmu.service.Impl")
@PropertySource("classpath:dubbo-provider.properties")
public class ProviderConfiguration {
}
