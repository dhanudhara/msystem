package org.example.view;

import java.util.List;

import org.example.user.User;

public class UserView {
    public UserView() {}

    public void displayUsers(List<User> users) {
        for (User user : users) {
            System.out.println(
                    "Name: " + user.getName() +
                    "Email: " + user.getEmail()
            );
            System.out.println(user.displayRole());
        }
    }
}
