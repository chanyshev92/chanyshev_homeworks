package ru.pcs.web.security.details;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.pcs.web.models.User;
import ru.pcs.web.repositories.UsersRepository;

@RequiredArgsConstructor
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UsersRepository usersRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user =usersRepository.findByEmail(email).orElseThrow(()->new UsernameNotFoundException("User not found"));
        return new UserDetailsImpl(user);
    }
}
