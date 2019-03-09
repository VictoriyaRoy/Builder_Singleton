package com.example.user.builder_singleton;

public class ApiService {
    private static ApiService instance;
    public String value;

    public ApiService(String value) {
        this.value = value;
    }

    public static ApiService getInstance(String value) {
        if (instance == null) {
            instance = new ApiService(value);

        }
        return instance;
    }
}
