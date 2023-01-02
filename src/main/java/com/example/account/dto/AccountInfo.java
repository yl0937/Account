package com.example.account.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AccountInfo {
    private String accountNumber;
    private Long balance;
}
