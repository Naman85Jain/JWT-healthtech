package com.NamanJain.HealthNew.entity;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtResponse {

    private String JwtToken;
    private String username;

}
