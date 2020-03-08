package blue.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

//Container, Dependency, and IOC
//Component scanning, Stereotypes?

@Component
public class AccountService {
    Logger logger=LoggerFactory.getLogger(AccountService.class);


    @PostConstruct
    public void init(){
        logger.info("AccountService  initialized....");
    }

    public void getUserById(String id){

    }
}
