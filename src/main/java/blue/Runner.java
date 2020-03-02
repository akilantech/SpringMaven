package blue;

import blue.service.LibraryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    static Logger logger = LoggerFactory.getLogger(Runner.class);


    public static void main(String[] args) {

        logger.info("Main.............");

        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("application-config.xml");
        LibraryService libraryService = classPathXmlApplicationContext.getBean("libraryService", LibraryService.class);
        libraryService.findAllBooks();

    }
}
