package com.example.rentify;

public final class AuthRules {

    static final String ADMIN_USERNAME = "admin";
    static final String ADMIN_PASSWORD = "XPI76SZUqyCjVxgnUjm0";

    private AuthRules() {}

    public static boolean isAdmin(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }

    public static boolean hasCredentials(String username, String password) {
        return username != null && !username.trim().isEmpty()
                && password != null && !password.isEmpty();
    }
}
