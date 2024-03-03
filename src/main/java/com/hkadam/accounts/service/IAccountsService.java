package com.hkadam.accounts.service;

import com.hkadam.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto- Customer Object
     */
    void createAccount(CustomerDto customerDto);

    boolean updateAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean deleteAccount(String mobileNumber);


}
