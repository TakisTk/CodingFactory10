package gr.aueb.cf.ch18.bankapp.controller;

import gr.aueb.cf.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.ch18.bankapp.model.Account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountController {

    // dummy
//    private final List<Account> accounts = new ArrayList<>();

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance) {
        // Data binding
       // AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);
        AccountReadOnlyDTO readOnlyDTO;

        // Validation

        //service
       // readOnlyDTO = accountService.createAccount(insertDTO);

        // Dummy
//        accounts.add(new Account(iban, balance));

        readOnlyDTO = new AccountReadOnlyDTO(iban, balance);
        return readOnlyDTO;
    }

    public void deposit(String iban, BigDecimal amount) {

        if(iban.equals("GR12345")) {
            throw new IllegalArgumentException("Invalid IBAN");
        }
//        acountService.deposit(iban, amount);
    }

    public void withdraw(String iban, BigDecimal amount) {

        if(iban.equals("GR12345")) {
            throw new IllegalArgumentException("Invalid IBAN");
        }
//        acountService.withdrow(iban, amount);

    }

    public BigDecimal getBalance(String iban) {

        // Dummy Data
        if (iban.equals("GR12345")) {
            throw new IllegalArgumentException("Account with IBAN " + iban + " does not exist");
        }

        return new BigDecimal("1000");

        // Service Call
        //return accountService.getBalance(iban);
    }


    public List<AccountReadOnlyDTO> getAllAccounts() {
        new AccountReadOnlyDTO("GR1234567890123456789012345", new BigDecimal("1000.00"));
        new AccountReadOnlyDTO("GR9876543210987654321098765", new BigDecimal("500.00"));
        new AccountReadOnlyDTO("GR1111111111111111111111111", new BigDecimal("250.00"));

       // return accountService.getAllAccounts();
    }
}
