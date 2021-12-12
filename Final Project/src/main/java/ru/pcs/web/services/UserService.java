package ru.pcs.web.services;

import ru.pcs.web.forms.UserForm;
import ru.pcs.web.models.Booking;
import ru.pcs.web.models.User;

import java.util.List;

public interface UserService {
    void addUser(UserForm form);

    List<User> getAllUsers();

    void deleteUser(Integer productId);

    User getUser(Integer productId);

    void updateUser(Integer productId,UserForm form);

    List<Booking> getBookingsByUser(Integer userId);
}
