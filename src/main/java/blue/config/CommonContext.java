package blue.config;

import blue.dao.AccountDao;
import blue.meta.BeanFactoryPostProcessorImpl;
import blue.meta.BeanPostProcessorImpl;
import blue.model.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

import javax.annotation.PostConstruct;

@PropertySource(value = "database.properties")
@ComponentScan(basePackages="blue.service,blue.dao")
@Configuration
public class CommonContext {
    static Logger logger = LoggerFactory.getLogger(CommonContext.class);

    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @PostConstruct
    public void initialize(){
        logger.info("Common context initialized.........");
    }

    @Autowired
    private Environment env;

    //10.What is the default bean id if you only use @Bean? How can you override this?
    @Bean(name = "accountDao")
    public  AccountDao accountDao(){
        return new AccountDao();
    }

    //Why would you define a static @Bean method?
    //Below method will be fired before @PostConstruct
    @Bean
    public static BeanPostProcessorImpl beanPostProcessorImpl(){
        return new BeanPostProcessorImpl();
    }

    @Bean
    public static BeanFactoryPostProcessorImpl beanFactoryPostProcessor(){
        return new BeanFactoryPostProcessorImpl();
    }



    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

    @Bean
    public DataSource dataSource(){
        logger.info("Testing environment is autowired   "+env.getProperty("jdbc.url"));
        return new DataSource(driverClassName,url,username,password);
    }


}
