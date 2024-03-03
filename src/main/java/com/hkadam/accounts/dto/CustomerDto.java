package com.hkadam.accounts.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
public class CustomerDto {


    @NotEmpty(message = "Name can not be empty")
    @Size(min = 5, max = 30, message = "The length of customer name should be between 5 and 30")
    private String Name;

    @NotEmpty(message = "Email address can not be empty")
    @Email(message = "Email address should be valid value")
    private String email;

    @Pattern(regexp = "^$|[0-9]{10}", message = "mobile number should be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
