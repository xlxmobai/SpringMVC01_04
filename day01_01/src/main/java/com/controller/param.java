package com.controller;

import com.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/param")
public class param {




        @RequestMapping(value = "/test" )
        public String paramTest(String username){
            System.out.println(username);
            return "success";
        }

    @RequestMapping(value = "/saveAccount" )
    public String saveAccount(Account account){
        System.out.println(account.toString());
        return "success";
    }

}
