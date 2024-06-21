package com.ike.bankingapp.mapper;

import com.ike.bankingapp.dto.AccountDto;
import com.ike.bankingapp.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto) {

        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountName(),
                accountDto.getAccountNo(),
                accountDto.getBalance()
        );

        return account;
    }

    public static AccountDto mapToAccountDto (Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountName(),
                account.getAccountNo(),
                account.getBalance()
        );

        return accountDto;
    }
}
