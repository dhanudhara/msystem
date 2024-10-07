package org.example;

import org.example.controller.UserController;
import org.example.model.UserModel;
import org.example.user.Guest;
import org.example.user.Staff;
import org.example.view.UserView;

public class App {
    public static void main(String[] args) {
        UserModel model = new UserModel();
        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        controller.addUser(new Staff("Bob", "bob@bob.com", "HR"));
        controller.addUser(new Guest("Anna", "anna@bob.com"));
    }
}
