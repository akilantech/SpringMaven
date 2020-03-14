package blue.config;

import blue.dao.AccountDao;
import blue.meta.BeanFactoryPostProcessorImpl;
import blue.meta.BeanPostProcessorImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@ComponentScan(basePackages="blue.service,blue.dao")
@Configuration
public class CommonContext {
    static Logger logger = LoggerFactory.getLogger(CommonContext.class);

    @PostConstruct
    public void initialize(){
        logger.info("Common context initialized.........");
    }

    @Bean
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

}
