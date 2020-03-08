package blue;

import blue.config.CommonContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(CommonContext.class);
    }
}
