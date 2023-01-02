package com.example.account.dto;

import com.example.account.type.TransactionResultType;
import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class UseBalance {

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Request{
        @NotNull
        @Min(1)
        private Long userId;


        @NotBlank
        @Size(min=9,max=9)
        private String accountNumber;

        @NotNull
        @Min(0)
        private Long amount;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response{
        private String accountNumber;
        private TransactionResultType transactionResultType;
        private String transactionId;
        private  Long amount;
        private LocalDateTime transactedAt;

//        public static Response from(AccountDto accountDto){
//            return Response.builder()
//                    .userId(accountDto.getUserId())
//                    .accountNumber(accountDto.getAccountNumber())
//                    .registeredAt(accountDto.getRegisteredAt())
//                    .build();
//        }
    }
}
