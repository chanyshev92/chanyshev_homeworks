package ru.pcs.web.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.pcs.web.forms.SignUpForm;
import ru.pcs.web.models.User;
import ru.pcs.web.repositories.UsersRepository;

@RequiredArgsConstructor
@Component
public class SignUpServiceImpl implements SignUpService {
    private final PasswordEncoder passwordEncoder;
    private final UsersRepository customersRepository;

    @Override
    public void signUpUser(SignUpForm form) {
        User customer = User.builder()
                .name(form.getName())
                .role(User.Role.CUSTOMER)
                .email(form.getEmail())
                .hashPassword(passwordEncoder.encode(form.getPassword()))
                .build();
        customersRepository.save(customer);

    }
}
