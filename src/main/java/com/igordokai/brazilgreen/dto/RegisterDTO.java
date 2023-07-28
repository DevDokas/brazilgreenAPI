package com.igordokai.brazilgreen.dto;

import com.igordokai.brazilgreen.config.security.UserRole;
import lombok.Data;

@Data
public class RegisterDTO {
    private Long id;
    private String login;
    private String password;
    private UserRole role;

}
