package ru.pcs.web.forms;

import lombok.Data;

@Data
public class SignUpForm {
    private String name;
    private String email;
    private String password;
}
