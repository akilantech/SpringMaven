package blue.dao;

import blue.service.AccountService;
import org.slf4j.Logger;

import javax.annotation.PostConstruct;

import static org.slf4j.LoggerFactory.*;

public class AccountDao {
    static Logger logger= getLogger(AccountDao.class);

    @PostConstruct
    public void initialize(){
        logger.info("AccountDao...............initialize");
    }
}
