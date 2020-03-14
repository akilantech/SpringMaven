package blue.meta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

//What is a BeanFactoryPostProcessor and what is it used for? When is it invoked?

public class BeanPostProcessorImpl implements BeanPostProcessor {
    Logger logger = LoggerFactory.getLogger(BeanPostProcessorImpl.class);

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        logger.info("postProcessBeforeInitialization................"+o.getClass());
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        logger.info("postProcessAfterInitialization................"+o.getClass());
        return o;
    }
}
