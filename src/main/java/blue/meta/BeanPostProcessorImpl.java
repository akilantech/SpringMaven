package blue.meta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

//What is a BeanFactoryPostProcessor and what is it used for? When is it invoked?

public class BeanPostProcessorImpl implements BeanFactoryPostProcessor {
    Logger logger = LoggerFactory.getLogger(BeanPostProcessorImpl.class);
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        logger.info("BeanFactoryPost processor...."+configurableListableBeanFactory);
    }
}
