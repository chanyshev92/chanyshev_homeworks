package ru.pcs.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.pcs.web.forms.UserForm;
import ru.pcs.web.models.Booking;
import ru.pcs.web.models.User;
import ru.pcs.web.services.UserService;

import java.util.List;
@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService= userService;
    }

    @GetMapping("/users")
    public String getUsersPage(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/users/{user-id}")
    public String getUserPage(Model model, @PathVariable("user-id") Integer userId) {
        User user = userService.getUser(userId);
        model.addAttribute("user", user);
        return "user";
    }

    @GetMapping("/users/{user-id}/bookings")
    public String getBookingsByUser(Model model, @PathVariable("user-id") Integer userId) {
        List<Booking> bookings = userService.getBookingsByUser(userId);
        model.addAttribute("bookings", bookings);
        return "bookings_of_user";
    }

    @PostMapping("/users/{user-id}/delete")
    public String deleteUser(@PathVariable("user-id") Integer userId) {
        userService.deleteUser(userId);
        return "redirect:/users";
    }

    @PostMapping("/users/{user-id}/update")
    public String updateUser(UserForm form, @PathVariable("user-id") Integer userId) {
        userService.updateUser(userId,form);
        return String.format("redirect:/users/%s", userId);
    }
}
