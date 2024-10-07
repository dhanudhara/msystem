package org.example.user;

public record Staff(String name, String email, String department) implements User {
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
        return "Role: Staff, Department: " + department;
    }
}
