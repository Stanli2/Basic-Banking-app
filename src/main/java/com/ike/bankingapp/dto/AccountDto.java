package com.ike.bankingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {

    private Long id;
    private String accountName;
    private String accountNo;
    private double balance;

}
