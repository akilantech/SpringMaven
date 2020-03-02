package blue.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class LibraryService implements InitializingBean {

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
}
