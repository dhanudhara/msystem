package org.example.controller;

import org.example.model.UserModel;
import org.example.user.User;
import org.example.view.UserView;

public class UserController {

    private final UserModel model;
    private final UserView view;

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void addUser(User user) {
        UserModel updatedModel = model.addUser(user);
        updateView(updatedModel);
    }

    private void updateView(UserModel model) {
        view.displayUsers(model.getUsers());
    }
}
