package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.example.user.User;

public class UserModel {
    private final List<User> users;    

    public UserModel() {
        this.users = new ArrayList<>();
    }

    private UserModel(List<User> users) {
        this.users = List.copyOf(users);
    }

    public UserModel addUser(User user) {
        List<User> updateUsers = new ArrayList<>(this.users);
        updateUsers.add(user);
        return new UserModel(updateUsers);
    }

    public List<User> getUsers() {
        return users;
    }
}
