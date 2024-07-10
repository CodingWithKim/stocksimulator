package org.example.stocksimulator;

public class UserSession {
    private static UserSession instance;
    private String username;

    private UserSession() {
        username = "Guest"; // Default username
    }

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
