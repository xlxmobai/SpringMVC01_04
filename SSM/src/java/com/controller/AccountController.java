package com.controller;

import com.domain.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "findAll")
    public String findAll(Model model){
        List<Account> accounts=accountService.findAll();
        model.addAttribute("list",accounts);
        return "list";
    }
}
