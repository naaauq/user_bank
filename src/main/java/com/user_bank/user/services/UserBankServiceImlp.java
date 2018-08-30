package com.user_bank.user.services;

import com.user_bank.user.dao.models.Bank;
import com.user_bank.user.dao.models.User;
import com.user_bank.user.dao.repositories.BankRepository;
import com.user_bank.user.dao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBankServiceImlp implements UserBankService {

    @Autowired
    private BankRepository bankRepository;
    @Autowired
    private UserRepository userRepository;

    public UserBankServiceImlp(){super();}

    @Override
    public String create(Bank bank) {
        bankRepository.save(bank);
        return "DA ADD XONG";
    }

    @Override
    public String create(User user) {
        userRepository.save(user);
        return "DA ADD XONG";
    }
    @Override
    public String update(Bank bank) {
        bankRepository.save(bank);
        return " DA UPDATE XONG";
    }

    @Override
    public String update(User user) {
        userRepository.save(user);
        return " DA UPDATE XONG";
    }

    @Override
    public List<Bank> list() {
        return bankRepository.findAll();
    }

    @Override
    public List<User> list1() {
        return userRepository.findAll();
    }

    @Override
    public String delete(long id) {
        bankRepository.deleteById(id);
        return "DA XOA XONG";
    }

    @Override
    public String delete1(long id) {
        userRepository.deleteById(id);
        return "DA XOA XONG";
    }
}
