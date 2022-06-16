package com.santiagoposadag.cs50.receiverpublisher.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String userId;
    private String userName;
    private String userLastName;
    private String routingKey;

}
