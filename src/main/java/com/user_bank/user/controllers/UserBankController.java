package com.user_bank.user.controllers;

import com.user_bank.user.dao.models.Bank;
import com.user_bank.user.dao.models.User;
import com.user_bank.user.services.UserBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/userbank")
public class UserBankController {

    @Autowired
    private UserBankService bankService;
    @Autowired
    private UserBankService userService;

    @GetMapping(value = "/bank")
    public @ResponseBody
    List<Bank> getBanks(){
        return  bankService.list();

    }

    @GetMapping(value = "/user")
    public @ResponseBody
    List<User> getUsers(){
        return  userService.list1();

    }

    @PostMapping(value = "/bank")
    public @ResponseBody String create(@RequestBody Bank bank)
    {
        return bankService.create(bank);
    }

    @PostMapping(value = "/user")
    public @ResponseBody String create(@RequestBody User user)
    {
        return userService.create(user);
    }

    @PutMapping(value = "/bank")
    public @ResponseBody String update(@RequestBody Bank bank)
    {
        return bankService.update(bank);
    }

    @PutMapping(value = "/user")
    public @ResponseBody String update(@RequestBody User user)
    {
        return userService.update(user);
    }

    @DeleteMapping(value = "/bank/{id}")
    public @ResponseBody String delete(@PathVariable(value = "id") long id)
    {
        return bankService.delete(id);
    }

    @DeleteMapping(value = "user/{id}")
    public @ResponseBody String delete1(@PathVariable(value = "id") long id)
    {
        return userService.delete1(id);
    }

}
