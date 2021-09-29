package com.shubham.AOP.daoImplementation;

import com.shubham.AOP.dao.AccountDAO;
import org.springframework.stereotype.Component;

@Component
public class AccountDAOImplementation implements AccountDAO {

    @Override
    public void addAccount() {
        System.out.println("***********Adding Account***********");
    }
}
