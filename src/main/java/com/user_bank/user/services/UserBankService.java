package com.user_bank.user.services;

import com.user_bank.user.dao.models.Bank;
import com.user_bank.user.dao.models.User;

import java.util.List;

public interface UserBankService {

    String create(Bank bank);
    String update(Bank bank);
    List<Bank> list();
    String delete(long id);

    String create(User user);
    String update(User user);
    List<User> list1();
    String delete1(long id);
}
