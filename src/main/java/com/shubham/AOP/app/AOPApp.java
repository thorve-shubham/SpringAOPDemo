package com.shubham.AOP.app;

import com.shubham.AOP.config.AppConfig;
import com.shubham.AOP.dao.AccountDAO;
import com.shubham.AOP.daoImplementation.AccountDAOImplementation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AccountDAO dao = context.getBean("accountDAOImplementation", AccountDAOImplementation.class);

        dao.addAccount();

        context.close();
    }
}
