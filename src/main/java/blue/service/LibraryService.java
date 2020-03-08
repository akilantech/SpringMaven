package blue.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.Lifecycle;
import org.springframework.context.LifecycleProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class LibraryService implements InitializingBean, LifecycleProcessor {

    Logger logger = LoggerFactory.getLogger(LibraryService.class);

    @PostConstruct
    public void initialize(){
        logger.info("initialize.......");
    }

    public List<String> findAllBooks(){
        logger.info("findAllBooks.....");
        return new ArrayList<String>();
    }

    public void afterPropertiesSet() throws Exception {
        logger.info("after property set......");
    }

    @PreDestroy
    public void destroy(){
        logger.info("Destroy.......");
    }

    public void start() {
        logger.info("Start.....");
    }

    public void stop() {
        logger.info("Stop.....");

    }

    public boolean isRunning() {
        return false;
    }

    public void onRefresh() {
        logger.info("Refresh.....");

    }

    public void onClose() {
        logger.info("Close.....");

    }
}
