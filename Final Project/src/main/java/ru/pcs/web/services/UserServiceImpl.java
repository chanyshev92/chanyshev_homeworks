package ru.pcs.web.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.pcs.web.exceptions.UserNotFoundException;
import ru.pcs.web.forms.UserForm;
import ru.pcs.web.models.Booking;
import ru.pcs.web.models.User;
import ru.pcs.web.repositories.BookingsRepository;
import ru.pcs.web.repositories.UsersRepository;

import java.util.List;

@RequiredArgsConstructor
@Component
public class UserServiceImpl implements UserService{

    private final UsersRepository usersRepository;

    private final BookingsRepository bookingsRepository;

    @Override
    public void addUser(UserForm form) {
        User user = User.builder()
                .name(form.getName())
                .email(form.getEmail())
                .build();
        usersRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public void deleteUser(Integer productId) {

        usersRepository.deleteById(productId);

    }

    @Override
    public User getUser(Integer productId) {
        return usersRepository.findById(productId).orElseThrow(UserNotFoundException::new);
    }

    @Override
    public void updateUser(Integer productId,UserForm form) {
        User user =usersRepository.getById(productId);
        user.setName(form.getName());
        user.setEmail(form.getEmail());
        //user.setRole(form.getRole());
        usersRepository.save(user);

    }

    @Override
    public List<Booking> getBookingsByUser(Integer userId) {
        return bookingsRepository.findAllByCustomer_Id(userId);
    }
}
