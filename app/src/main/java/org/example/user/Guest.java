package org.example.user;

public record Guest(String name, String email) implements User {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }


    @Override
    public String displayRole() {
        return "Role: Guest";
    }
}
