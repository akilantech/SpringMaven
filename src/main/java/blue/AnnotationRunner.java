package blue;

import blue.config.CommonContext;
import blue.model.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationRunner {

    private static Logger logger = LoggerFactory.getLogger(AnnotationRunner.class);
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(CommonContext.class);

        DataSource dataSource = annotationConfigApplicationContext.getBean(DataSource.class);
        logger.info("DataSource"+dataSource);


    }
}
